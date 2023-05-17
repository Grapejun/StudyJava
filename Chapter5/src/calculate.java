import java.util.Scanner;
abstract class Calc {
    protected int a, b; // protected 선언
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}
class Add extends Calc{
    Add(int x, int y) {
        setValue(x, y);
    }
    int calculate() {
        return a + b;
    }
}
class Sub extends Calc{
    Sub(int x, int y) {
        setValue(x, y);
    }
    int calculate() {
        return a - b;
    }
}
class Mul extends Calc{
    Mul(int x, int y) {
        setValue(x, y);
    }
    int calculate() {
        return a*b;
    }
}
class Div extends Calc{
    Div(int x, int y) {
        setValue(x, y);
    }
    int calculate() {
        return a/b;
    }
}
public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        String calculator = scanner.next();
        Calc cal; // 객체의 타입은 상위타입으로 !!
        switch (calculator) {
            case "+":
                cal = new Add(first, second);
                System.out.println(cal.calculate());
                break;

            case "-":
                cal = new Sub(first, second);
                System.out.println(cal.calculate());
                break;

            case "*":
                cal = new Mul(first, second);
                System.out.println(cal.calculate());
                break;

            case "/":
                cal = new Div(first, second);
                System.out.println(cal.calculate());
                break;
        }

    }
}
