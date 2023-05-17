public class num_10 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*16);

            for(int j = 0; j < i; j++) {
                if(num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }
        // arr[i][j] = arr[num[i]/4][num[i]%4]
        for (int i = 0; i < num.length; i++) {
            arr[num[i]/4][num[i]%4] = (int)(Math.random()*10+1);

            //System.out.print(arr[num[i]/4][num[i]%4]+"\t");
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
                if(j == 3)
                    System.out.println();
            }
        }
    }
}
