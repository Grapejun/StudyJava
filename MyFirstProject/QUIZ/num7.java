import java.util.Scanner;
public class num7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int posx = scanner.nextInt();
        int posy = scanner.nextInt();

        if (((100 <= posx) && (posx <= 200)) && ((100 <= posy) && (posy <= 200)))
            System.out.println("(" + posx + "," + posy + ")는 사각형 안에 있습니다.");
        else
            System.out.println("(" + posx + "," + posy + ")는 사각형 안에 있지 않습니다.");

        scanner.close();
    }
}
