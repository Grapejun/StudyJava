import java.util.Scanner;
class Phone {
    private String name;
    private String tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String GetName() {
        return name;
    }
    public String GetTel() {
        return tel;
    }
}
public class PhoneBook {
    // Phone book [] = new Phone
    public PhoneBook() {}

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = scanner.nextInt();

        Phone [] person = new Phone[num];

        for(int i = 0; i < person.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");

            String name = scanner.next();
            String tel = scanner.next();
            person[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String search = scanner.next();

            if(search.equals("그만"))
                System.exit(1);

            int count = 0;

            for(int i = 0; i < person.length; i++) {

                if(search.equals(person[i].GetName())) {
                    System.out.println(person[i].GetName()+"의 전화번호는 "+person[i].GetTel()+" 입니다.");
                    break;
                }
                count++;

                if(count == person.length)
                    System.out.println(search+" 이 없습니다.");
            }
        }
    }
}
// Phone의 필드변수를 public으로 선언하여 풀었다.
// Phone 객체의 name과 tel을 리턴하는 퍼블릭 함수를 선언하면 필드변수를 private로 설정할 수 있다.