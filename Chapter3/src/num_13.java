public class num_13 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            String num = String.valueOf(i);

            if (i>=10) {
                char a = num.charAt(0);
                char b = num.charAt(1);

                if ((a=='3' || a=='6' || a=='9') && (b=='3' || b=='6' || b=='9'))
                    System.out.println(num+" 박수 짝짝");
                else if(((a=='3' || a=='6' || a=='9') && (b!='3' || b!='6' || b!='9')) || ((a!='3' || a!='6' || a!='9') && (b=='3' || b=='6' || b=='9')))
                    System.out.println(num + " 박수 짝");
            }

            else{
                char a = num.charAt(0);

                if (a=='3' || a=='6' || a=='9') {
                    System.out.println(num+" 박수 짝");
                }
            }
        }
    }
}
