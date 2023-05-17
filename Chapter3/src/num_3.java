import java.util.Scanner;
public class num_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오>>");

        int i = scanner.nextInt();
        for (; i > 0; i--) {
            //int count = 5;
            for (int j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}