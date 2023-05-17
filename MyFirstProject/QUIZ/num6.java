import java.util.Scanner;
public class num6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        String num = scanner.next();


        if (i>=10) {
            char a = num.charAt(0);
            char b = num.charAt(1);

            if ((a=='3' || a=='6' || a=='9') && (b=='3' || b=='6' || b=='9'))
                System.out.println(num+" 박수 짝짝");
            else if(((a=='3' || a=='6' || a=='9') && (b!='3' || b!='6' || b!='9')) || ((a!='3' || a!='6' || a!='9') && (b=='3' || b=='6' || b=='9')))
                System.out.println(num + " 박수 짝");
            else
                System.out.println("박수없음");
        }

        else{
            char a = num.charAt(0);

            if (a=='3' || a=='6' || a=='9') {
                System.out.println(num+" 박수 짝");
            }
            else
                System.out.println("박수없음");
        }

        scanner.close();
    }
}
