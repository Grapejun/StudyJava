public class Star_While {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        while(i>0) {
            while (j < i) {
                System.out.print("*");
                j++;
            }
            j = 0;
            System.out.println();
            i--;
        }
    }
}




