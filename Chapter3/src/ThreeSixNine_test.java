import java.util.Scanner;
public class ThreeSixNine_test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        String num = scanner.next();

        char a = num.charAt(0);
        char b = num.charAt(1);

        if ((a=='3' || a=='6' || a=='9') && (b=='3' || b=='6' || b=='9'))
            System.out.println("박수짝짝");
        else if(((a=='3' || a=='6' || a=='9') && (b!='3' || b!='6' || b!='9')) || ((a!='3' || a!='6' || a!='9') && (b=='3' || b=='6' || b=='9')))
            System.out.println("박수짝");
        else
            System.out.println("박수없음");

        scanner.close();
    }
}
