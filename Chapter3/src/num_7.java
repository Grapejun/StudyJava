public class num_7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i<10; i++) {
            arr[i] = (int)(Math.random()*10 + 1);
            sum += arr[i];
        }
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("평균은 "+(double)sum/10);
    }
}
