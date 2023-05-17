import java.util.Scanner;

public class num_8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 점 (x1,y1), (x2, y2)의 좌표를 입력하시오>>");
        int posx1 = scanner.nextInt();
        int posy1 = scanner.nextInt();

        int posx2 = scanner.nextInt();
        int posy2 = scanner.nextInt();

        if (inRect(posx1, posy1, 100, 100, 200, 200))
            System.out.print("해당 사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        else if (inRect(posx1, posy2, 100, 100, 200, 200))
            System.out.print("해당 사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        else if (inRect(posx2, posy1, 100, 100, 200, 200))
            System.out.print("해당 사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        else if (inRect(posx2, posy2, 100, 100, 200, 200))
            System.out.print("해당 사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        else
            System.out.print("해당 사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하지 않습니다.");

        scanner.close();
    }
}