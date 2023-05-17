import java.util.Scanner;
import java.util.Random;
public class UpAndDown {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            int k = r.nextInt(100);

            int min = 0;
            int max = 99;
            int i = 1;

            System.out.println("수를 결정하였습니다. 맞추어 보세요");


            System.out.println(min+"-"+max);
            while(true) {

                System.out.print(i+">>");
                int num = scanner.nextInt();

                if (num == k) {
                    System.out.println("맞았습니다.");
                    break;
                } else if (num > k) {
                    System.out.println("더 낮게");
                    max = num;
                    System.out.println(min+"-"+max);
                }
                else {
                    System.out.println("더 높게");
                    min = num;
                    System.out.println(min+"-"+max);
                }

                i++;
            }
            System.out.print("다시하시겠습니까(y/n)>>");
            String str = scanner.next();
            if (str.equals("y")) {
                continue;
            } else {
                break;
            }
        }
        scanner.close();
    }
}
