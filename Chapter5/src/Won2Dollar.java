import java.util.Scanner;
abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 "+ getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다");
        scanner.close();
    }
}
public class Won2Dollar extends Converter{
    protected double convert(double src) {
        return src*ratio;
    }
    protected String getSrcString() {
        return "원";
    }
    public Won2Dollar(double Won) {
        ratio = 1/Won;
    }
    protected String getDestString() {
        return "달러";
    }
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}

// ratio = 1/Won, convert()에서 return src*ratio는 왜 안돼?
//-> 내가 int로 받으니까 0이 나왔지


