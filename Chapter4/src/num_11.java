import java.util.Scanner;

class Add {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a + b;
    }
}

class Sub {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a - b;
    }
}

class Mul {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a * b;
    }
}

class Div {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a / b;
    }
}
public class num_11 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        String cal = scanner.next();

        switch (cal) {
            case "+":
                Add add = new Add();
                add.setValue(first, second);
                System.out.println(add.calculate());
                break;

            case "-":
                Sub sub = new Sub();
                sub.setValue(first, second);
                System.out.println(sub.calculate());
                break;

            case "*":
                Mul mul = new Mul();
                mul.setValue(first, second);
                System.out.println(mul.calculate());
                break;

            case "/":
                Div div = new Div();
                div.setValue(first, second);
                System.out.println(div.calculate());
                break;
        }

    }
}

