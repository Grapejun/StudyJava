public class num_1_4 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        do {
            sum = sum + i;
            i += 2;
        } while(i<100);
        System.out.println(sum);
    }
}