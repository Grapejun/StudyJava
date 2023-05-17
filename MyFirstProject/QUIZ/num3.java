import java.util.Scanner;
public class num3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();
        int count;

        if ((money / 50000) > 0) {
            count = money / 50000;
            money -= 50000 * (money / 50000);
            System.out.println("오만원권 " + count + "매");
        } else
            System.out.println("오만원권 0매");

        if ((money / 10000) > 0) {
            count = money / 10000;
            money -= 10000 * (money / 10000);
            System.out.println("만원권 " + count+ "매");
        } else
            System.out.println("만원권 0매");

        if ((money / 1000) > 0) {
            count = money / 1000;
            money -= 1000 * (money / 1000);
            System.out.println("천원권 " + count + "매");
        } else
            System.out.println("천원권 0매");

        if ((money / 100) > 0) {
            count = money / 100;
            money -= 100 * (money / 100);
            System.out.println("백원권 " + count + "매");
        } else
            System.out.println("백원권 0매");

        if ((money / 50) > 0) {
            count = money / 50;
            money -= 50 * (money / 50);
            System.out.println("오십원권 " + count + "매");
        } else
            System.out.println("오십원권 0매");

        if ((money / 10) > 0) {
            count = money / 10;
            money -= 10 * (money / 10);
            System.out.println("십원권 " + count + "매");
        } else
            System.out.println("십원권 0매");

        if (money > 0) {
            System.out.println("일원권 " + money + "매");
        } else
            System.out.println("일원권 0매");

        scanner.close();
    }
}
