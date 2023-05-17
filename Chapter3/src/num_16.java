import java.util.Scanner;
public class num_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str[] = {"가위", "바위", "보"};

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while (true) {

            int n = (int) (Math.random() * 3);
            String com = str[n];

            System.out.print("가위 바위 보!>>");
            String user = scanner.next();
            if (user.equals("그만")) {
                System.exit(1);
            }

            if (com.equals("가위")) {
                com = str[0];
            } else if (com.equals("바위")) {
                com = str[1];
            } else if (com.equals("보")) {
                com = str[2];
            }

            if ((com.equals("가위") && user.equals("보")) || (com.equals("바위") && user.equals("가위")) || (com.equals("보") && user.equals("바위")))
                System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + ", 컴퓨터가 이겼습니다.");
            else if ((com.equals("바위") && user.equals("보")) || (com.equals("보") && user.equals("가위")) || (com.equals("가위") && user.equals("바위")))
                System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + ", 사용자가 이겼습니다.");
            else  if (com.equals(user))
                System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + ", 비겼습니다.");
            else
                System.out.println("다시 입력해 주세요.");
            // 이상한 문자 넣었을 경우 다시 입력해주세요 출력

        }
    }
}