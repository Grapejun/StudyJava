import java.util.Scanner;
class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; this.y = y; this.radius = radius; // ,로 연결 불가능 this.x = x, this.y = y; 등
    }
    public double GetX() { return x;}
    public double GetY() { return y;}
    public int GetRadius() { return radius;}
    public void show() {
        System.out.println("("+x+","+y+")"+radius);
    }
}

/*public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];
        for(int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for(int i = 0; i <c.length; i++) c[i].show();
        scanner.close();
    }
}*/
public class CircleManager {
    // public static int max = 0;
    public static void MaxShow(Circle[] circle_array) {
        int max = 0;
        for(int i = 0; i <circle_array.length; i++) {
            if(circle_array[i].GetRadius() > max) {
                max = circle_array[i].GetRadius();
            }
        }
        for(int i = 0; i<circle_array.length; i++) {
            if(max == circle_array[i].GetRadius()) {
                System.out.println("가장 면적이 큰 원은 ("+circle_array[i].GetX()+","+circle_array[i].GetY()+")"+circle_array[i].GetRadius());
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];

        for(int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        MaxShow(c);
        scanner.close();
    }
}

