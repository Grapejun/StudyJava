import java.util.Scanner;
class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

public class MonthSchedule {
    private int k;
    private Day [] month;
    MonthSchedule(int k) // k를 private로 선언 후 초기화가 가능한가?
    {
        this.k = k;
        this.month = new Day[k];
        for(int i = 0; i < month.length; i++) {
            month[i] = new Day();
        } //this.~~~는 한번만 쓰면 그 다음부터 this. 안 적어도 알아서 적용되는건가?? => ㄴㄴ month가 하나밖에 없어서 그냥 쓰면 되는거였어.
    }
    Scanner scanner = new Scanner(System.in); // 스캐너는 어디 위치에 쓰는게 맞는것인가??
    public void input() {
        System.out.print("날짜(1~30)?");
        int day =  scanner.nextInt();

        if(day < 0 || day > k) {
            System.out.println(day+"일은 없습니다.");
            return;
        }

        System.out.print("할일(빈칸없이입력)?");
        String work = scanner.next();

        day--;
        month[day].set(work);
    }
    public void view() {
        System.out.print("날짜(1~30)?");
        int day =  scanner.nextInt();

        if(day < 0 || day > k) {
            System.out.println(day+"일은 없습니다.");
            return;
        }

        System.out.print(day+"일의 할 일은 ");
        day--;
        month[day].show();
    }
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    input(); break;
                case 2:
                    view(); break;
                case 3:
                    finish(); return;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
            }
        }