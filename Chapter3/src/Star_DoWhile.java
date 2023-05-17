public class Star_DoWhile {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        do {
            do {
                System.out.print("*");
                j++;
            } while(j<i);

            j = 0;
            System.out.println();
            i--;
        } while(i > 0);
    }
}
