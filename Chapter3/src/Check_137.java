public class Check_137 {
    public static void main(String[] args) {
        int [] tenArray = new int[10];
        // int size = tenArray.length;

        for (int i = 0; i < 10; i++) {
            tenArray[i] = i+1;
        }

        int sum = 0;
        for (int k : tenArray) {
            sum += k;
        }
        System.out.println("합은 " + sum);
    }
}
