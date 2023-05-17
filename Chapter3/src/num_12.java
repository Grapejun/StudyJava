import java.util.Scanner;
public class num_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("입력해주세요");
        int loop = scanner.nextInt();

        System.out.print("숫자를 넣어주세요");

        for (int i = 0; i < loop; i++) {

            try {
                String num = scanner.next();
                Integer integer_num = Integer.parseInt(num);
                if (integer_num.getClass().getTypeName().equals("java.lang.Integer"))
                    sum += Integer.parseInt(num);
            }

            catch(NumberFormatException ignored) {
                continue;
            }

        }
        System.out.println("정수의 합은 " + sum);
        scanner.close();
    }
}
//


    /*Integer integer_num = Integer.parseInt(num);
            if (integer_num.getClass().getTypeName().equals("java.lang.Integer")) 대신에

           if (Integer.parseInt(num).getClass().getName().equals("java.lang.Integer")) 썻을 경우에 .getClass()를 사용할 수 없음.*/

//1. Integer 형에는 .getClass()를 사용할 수 있지만, int 형에는 .getClass()를 쓸 수 없는 것 같다.  Integer.parseInt(num)는 int 형이 되는 듯.

    /*2. Integer num = 5;
        System.out.println(num.getClass().getName());
위 코드의 결과는 java.lang.Integer*/