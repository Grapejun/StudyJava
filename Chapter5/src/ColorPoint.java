/*
class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x;}
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y;}
}
public class ColorPoint extends Point{
    String color;
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return color+"색의 ("+getX()+","+getY()+")의 점";
    }
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
실습문제 5번
*/
/*class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public Point() {}
    public int getX() { return x;}
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y;}
}
public class ColorPoint extends Point{
    private String color;
    public ColorPoint() {
        this(0, 0, "Black"); //super() 호출하고 color 따로 선언 할 수 있다.
    }
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public ColorPoint(int x, int y) {
        super(x, y);
        color = "BLACK";
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return color+"색의 ("+getX()+","+getY()+")의 점";
    }

    public static void main(String[] args) {

        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}*/
