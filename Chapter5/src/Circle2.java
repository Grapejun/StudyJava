interface sshape {
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("---다시 그립니다. ");
        draw();
    }
}
class Oval2 implements sshape {
    int width;
    int height;
    Oval2(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println(width+"X"+height+"에 내접하는 타원입니다.");
    }
    public double getArea() {
        return width*height*PI/4;
    }
}
class Rect2 implements sshape {
    int width;
    int height;
    Rect2(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println(width+"X"+height+"크기의 사각형 입니다.");
    }
    public double getArea() {
        return width*height;
    }
}
public class Circle2 implements sshape{
    int radius;
   Circle2 (int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }
    public double getArea() {
        return radius*radius*PI;
    }
    public static void main(String [] args) {
        sshape [] list = new sshape[3];
        list[0] = new Circle2(10);
        list[1] = new Oval2(20, 30);
        list[2] = new Rect2(10, 40);

        for (int i = 0; i < list.length; i++) list[i].redraw();
        for (int i = 0; i < list.length; i++)System.out.println("면적은 "+ list[i].getArea());
    }
}
