public class Problem10 {
    public Problem10() {
        this(10);
        System.out.println("Problem10()");
    }    public Problem10(int x){
        System.out.println("Problem10(" + x + ")");
    }
    public static void main(String[] args) {
        new Problem10();
    }
}
