import java.util.Scanner;
public class num11_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달을 입력하세요(1~12)>>");
        Integer season = scanner.nextInt();

        if ((3<=season)&&(season<=5))
            System.out.println("봄");
        else if ((6<=season)&&(season<=8))
            System.out.println("여름");
        else if ((9<=season)&&(season<=11))
            System.out.println("가을");
        else if ((12==season)||(season==1)||(season==2))
            System.out.println("겨울");
        else
            System.out.println("잘못입력");
    }
}
