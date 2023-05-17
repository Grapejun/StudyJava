import java.util.Scanner;
interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

public class StringStack implements Stack {
    private String[] Stack;
    private int capacity;
    private int top;

    public StringStack(int capacity) {
        top = 0;
        this.capacity = capacity;
        Stack = new String[capacity];
    }
    public int length() {
        return top;
    }
    public int capacity() {
        return Stack.length;
    }
    public String pop() {
        if(top <= 0)
            return null;
        top--;
        String s = Stack[top];
        //top++ 안해도 돼?
        return s;
    }
    public boolean push(String val) {
        if(top < capacity) {
            Stack[top] = val;
            top++;
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int cap = scanner.nextInt();
        StringStack bag = new StringStack(cap);

        while(true) {
            System.out.print("문자열 입력 >> ");
            String str = scanner.next();
            if(str.equals("그만"))
                break;
            //bag.push(str);
            if(!bag.push(str)) {
                System.out.print("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝: ");
        for (int i = 0; i < bag.length(); i++) {
            System.out.print(bag.pop() + " ");
        }
        scanner.close();
    }
}

