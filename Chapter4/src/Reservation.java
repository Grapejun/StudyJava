import java.util.InputMismatchException;
import java.util.Scanner;
class Seat {
    String[][] totalSeat = new String[3][];
    private String seat = " --- ";
    public void setTotalSeat(String[][] totalSeat) { this.totalSeat = totalSeat;}
    public String[][] getTotalSeat() {
        return totalSeat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
    public String getSeat() {
        return seat;
    }
    public Seat() {
        for (int i = 0; i < totalSeat.length; i++) {
            totalSeat[i] = new String[10];
            for (int j = 0; j < totalSeat[i].length; j++) {
                totalSeat[i][j] = seat;
            }
        }
    }
    public String grade(int num) {
        switch (num) {
            case 1:
                return "S";
            case 2:
                return "A";
            case 3:
                return "C";
        }
        return "다시 입력하세요";
    }
}
public class Reservation {
    static Scanner scanner = new Scanner(System.in);
        Reservation() { }

    public static void run(Seat date) {
            System.out.println("명품콘서트홀 예약 시스템입니다.");
            while(true) {
                System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");

               try{
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        reservation(date); break;
                    case 2:
                        show(date); break;
                    case 3:
                        cancel(date); break;
                    case 4:
                        finish(date); return;
                    default:
                        System.out.println("다시 입력해주세요.");
                }
            }
                catch (InputMismatchException e) {
                    System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                    scanner.nextLine();
                }
            }
        }
        public static void reservation(Seat date) {
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            try{
                int grade = scanner.nextInt();
                System.out.print(date.grade(grade)+">> ");
                //System.out.print(date.totalSeat[menu-1]+">> "); 에서 date.totalSeat[menu-1]는 S, A, B가 아닌 주소를 반환한다.
                for (int i = 0; i < 10; i++)
                    System.out.print(date.totalSeat[grade-1][i]);

                System.out.print("\n이름>>");
                String name = scanner.next();

                System.out.print("번호>>");
                int number = scanner.nextInt();

                date.totalSeat[grade-1][number-1] = name;
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("좌석을 잘못 입력하였습니다.");
            }
        }
        public static void cancel(Seat date) {
            try {
                System.out.print("좌석 S:1, A:2, B:3>>");
                int grade = scanner.nextInt();

                System.out.print(date.grade(grade)+">> ");
                for (int i = 0; i < 10; i++)
                    System.out.print(date.totalSeat[grade-1][i]);
                System.out.print("\n이름>>");
                String name = scanner.next();

                for (int i = 0, count = 0; i < 10; i++) {

                    if (date.totalSeat[grade-1][i].equals(name)) {
                        date.totalSeat[grade-1][i] = " --- ";
                        count++;
                    }
                    if(i==9&count==0) {
                        System.out.println("잘못된 이름을 입력하였습니다.");
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("좌석을 잘못 입력하였습니다.");
            }
        }
        public static void show(Seat date) {
            for (int j = 0; j<date.totalSeat.length; j++) {
                System.out.print(date.grade(j+1)+">> ");

                for (int i = 0; i < 10; i++)
                    System.out.print(date.totalSeat[j][i]);

                if(j<2)
                    System.out.println();
            }
            System.out.println("\n<<<조회를 완료하였습니다.>>>");
        }
        public static void finish(Seat date) {
            System.exit(0);
        }

        public static void main(String[] args) {
            Seat today = new Seat();
            Reservation.run(today);
        }
    }
