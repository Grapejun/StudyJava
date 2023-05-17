import java.util.Scanner;
abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public  void setNext(Shape obj) { next = obj; } // 링크 연결
    public Shape getNext() { return next; }
    public abstract void draw();
}
class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
public class GraphicEditor {
    static int count = 0;
    static Shape start, last, obj;
    static Scanner scanner = new Scanner(System.in);

    static public void insert(int num) {
        if (start == null)
        {
            switch (num) {
                case 1:
                    start = new Line();
                    break;
                case 2:
                    start = new Rect();
                    break;
                case 3:
                    start = new Circle();
                    break;
                default:
                    break;
            }
            last = start;
            count++;
        }
        else {
            switch (num) {
                case 1:
                    obj = new Line();
                    break;
                case 2:
                    obj = new Rect();
                    break;
                case 3:
                    obj = new Circle();
                    break;
                default:
                    break;
            }
            last.setNext(obj);
            last = obj;
            count++;
        }
    }
    static public void delete(int num) {
        if(num > count)
        {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        else if (num == 1){
            start = start.getNext();
        }
        else if (num == count) {
            Shape delete_node = start;
            for(int i = 1; i < num-1; i++) {
                delete_node = delete_node.getNext();
            }
            delete_node.setNext(null);
        }
        else
        {
            Shape before_node = start;
            for(int i = 1; i < num-1; i++) {
                before_node = before_node.getNext();
            }
            Shape delete_node = before_node.getNext();
            before_node.setNext(delete_node.getNext());
        }
        count--;
    }
    static public void show() {
        Shape p = start;
        while(p != null) {
            p.draw();
            p = p.getNext();
        }
    }
    public static void main(String[] args) {

        int num;
        int i = 0;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");

            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int insert_num = scanner.nextInt();
                    insert(insert_num);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치");
                    int delete_num = scanner.nextInt();
                    delete(delete_num);
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.print("beauty을 종료합니다.");
                    System.exit(0);
            }
        }
    }
}



