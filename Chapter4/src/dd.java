public class dd{
    public static void main(String []args) {
        int [] a = {10, 100};
        int[] b = {20,200,2000,20000};

        int [][]test = {a,b};
        for(int i = 0; i<test.length;i++) {
            for(int k = 0; k<test[i].length; k++) {
                System.out.print(test[i][k]);
            }
            System.out.println();
        }
    }
}