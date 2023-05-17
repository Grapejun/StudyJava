public class theory9 {
    public static void main(String[] args) {

        int sum = 0, i = 0;
        while (i < 100) {
            if (i % 3 != 0) {
                i++;
            } else sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
