import java.util.InputMismatchException;
import java.util.Scanner;
public class num_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            try {
                System.out.print("곱하고자 하는 두 수 입력>>");
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.print(n + "X" + m + "=" + n*m);
                break;
            }

            catch (InputMismatchException e) {
                scanner.nextLine(); // 왜 버퍼를 제거해야할까??
                System.out.println("실수는 입력하면 안됩니다.");
                // continue; 는 필요없음 없어도 반복할꺼니까
            }
        }

        scanner.close();
    }
}
