import java.util.Scanner;
class Player {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    public void setName(String name) {  this.name = name;}
    String getWordFromUser() {
        System.out.print(name+">>");
        String word = scanner.next();
        return word;
    }
    String checkSuccess(String given_word, String my_word) {

        int lastIndex = given_word.length() - 1;
        char lastChar = given_word.charAt(lastIndex);
        char firstChar = my_word.charAt(0);

        if(lastChar == firstChar)
        {
            return my_word;
        }

        System.out.println(name+"이 졌습니다.");
        System.exit(0);
        return my_word; // 형식적으로 return을 넣어 줘야 하는건가?
    }
}

public class WordGameApp {
    WordGameApp() {}
    Player[] player;

    static Scanner scanner = new Scanner(System.in);
    void run(int num) {

        String name;
        player = new Player[num];
        String start_word = "아버지";

        for(int i = 0; i<num; i++)
        {
            player[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요>>");
            name = scanner.next();
            player[i].setName(name);
        }

        System.out.println("시작하는 단어는 아버지입니다.");

        while(true)
        {
            for (int i = 0; i < num; i++)
            {
                String connect_word = player[i].getWordFromUser();
                start_word = player[i].checkSuccess(start_word, connect_word);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");

        int num = scanner.nextInt();

        WordGameApp game = new WordGameApp();
        game.run(num);
    }
}
