abstract class OddDetector {
    protected int n;
    public OddDetector (int n) {
        this.n = n;
    }
    public abstract boolean isOdd(); // 홀수이면 true 리턴
}
public class B extends OddDetector {
    public B(int n) {
        super(n);
    }
    public boolean isOdd() {  // 이부분을 추가
        if(super.n%2 == 1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.isOdd());
    }
}