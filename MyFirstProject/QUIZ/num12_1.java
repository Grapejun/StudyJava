import java.util.Scanner;
public class num12_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        double num1 = scanner.nextInt();
        String operator = scanner.next();
        double num2 = scanner.nextInt();
        double result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        }
        else if (operator.equals("-")) {
            result = num1 - num2;
        }
        else if (operator.equals("*")) {
            result = num1 * num2;
        }
        else if (operator.equals("/")) {
            result = num1 / num2;

            if (num2 == 0) {
                System.out.print("0으로 나눌 수 없습니다.");
                System.exit(0);
            }
        }
        else {
            System.out.print("잘못 입력하였습니다.");
            System.exit(0);
        }

        System.out.println(num1 + operator + num2 + "의 계산 결과는 " + result);

        scanner.close();
    }
}