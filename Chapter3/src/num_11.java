import java.util.Scanner;
public class num_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("몇 개의 평균을 구하시겠습니까?");
        int loop = scanner.nextInt();

        System.out.print("숫자를 넣어주세요");

        for (int i = 0; i < loop; i++) {
            String num = scanner.next();
            sum += Integer.parseInt(num);
        }
        System.out.println("평균은 " + sum/loop);

    }

}
