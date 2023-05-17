import  java.util.Scanner;
public class num10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double centerX = scanner.nextDouble();
        double centerY = scanner.nextDouble();
        double radius = scanner.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double center2X = scanner.nextDouble();
        double center2Y = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        if (  Math.sqrt(((center2X - centerX) * (center2X - centerX)) + ((center2Y - centerY) * (center2Y - centerY))) <= radius+radius2)
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");

        // r - R <= 중심사이의 거리
        //변수 x에 대한 제곱급의 값은 Math.sqrt(x)를 이용하면 된다.
        scanner.close();

    }
}