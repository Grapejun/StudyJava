import java.util.Scanner;
public class rockscissorspaper {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >>");
        String person1 = scanner.next();

        System.out.print("영희 >>");
        String person2 = scanner.next();

        if ((person1.equals("가위") && person2.equals("보")) || (person1.equals("바위") && person2.equals("가위")) || (person1.equals("보") && person2.equals("바위")))
            System.out.println("철수가 이겼습니다.");
        else if ((person1.equals("가위") && person2.equals("가위")) || (person1.equals("바위") && person2.equals("바위")) || (person1.equals("보") && person2.equals("보")))
            System.out.println("비겼습니다.");
        else
            System.out.println("영희가 이겼습니다.");

        scanner.close();
    }
}
