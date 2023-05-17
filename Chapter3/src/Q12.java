public class Q12 {
    public static void main(String[] args) {
        int sum=0;
        int j;

        for(int i=0; i<args.length; i++){

            try {
                j = Integer.parseInt(args[i]);
                //System.out.println(j);
                sum += j;
            }
            catch(NumberFormatException e) {
                continue;
            }
            }
        System.out.println(sum);
        }
    }
