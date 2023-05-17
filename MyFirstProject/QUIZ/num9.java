import  java.util.Scanner;
public class num9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        double centerX = scanner.nextDouble();
        double centerY = scanner.nextDouble();
        double radius = scanner.nextDouble();

        System.out.print("점 입력>>");
        double posX = scanner.nextDouble();
        double posY = scanner.nextDouble();

        if (  Math.sqrt(((posX - centerX) * (posX - centerX)) + ((posY - centerY) * (posY - centerY))) <= radius)
            System.out.println("(" + posX + "," + posY + ")는 원 안에 있다.");
        else
            System.out.println("(" + posX + "," + posY + ")는 원 안에 있지 않다.");

        //변수 x에 대한 제곱급의 값은 Math.sqrt(x)를 이용하면 된다.
        scanner.close();

    }
}
