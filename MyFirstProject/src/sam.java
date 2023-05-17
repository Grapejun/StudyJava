import java.util.Scanner;
public class sam {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        double num1 = scanner.nextInt();
        String operator = scanner.next();
        double num2 = scanner.nextInt();
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.print("잘못 입력하였습니다.");
                System.exit(0);
        }

        if ((num2 == 0) && operator.equals("/"))
        {
            System.out.print("0으로 나눌 수 없습니다.");
            System.exit(1);
        }
        System.out.println(num1 + operator + num2 + "의 계산 결과는 " + result);

        scanner.close();
    }
}

