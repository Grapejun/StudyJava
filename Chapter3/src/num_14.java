import java.util.Scanner;

import static java.lang.System.exit;

public class num_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int score [] = {95, 88, 76, 62, 55};

       while(true) {
           int count = 0;

           System.out.print("과목 이름>>");
           String name = scanner.next();

           if (name.equals("그만")) {
               System.exit(1);
           }

           for(int i = 0; i < course.length; i++) {
               if(course[i].equals(name)) {
                   System.out.println(course[i] + "의 점수는 "+score[i]);
                   count = 1;
               }
           }
           if (count != 1) {
               System.out.print("없는 과목입니다.");
               System.out.println();
           }
           if(count == 1) {
               count = 0;
           }
       }
    }
}
