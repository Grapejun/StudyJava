import java.util.Scanner;
abstract class GameObject {
    protected int distance;
    protected int x, y;
    public GameObject(int startX, int startY, int distance) {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean collide(GameObject p) {
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else return false;
    }
    protected abstract void move();
    protected abstract char getShape();
}
class Bear extends GameObject {
    public Bear() {
        super(0, 0, 1);
    }
    protected void move() {

    }
    protected  char getShape() {
        return 'B';
    }
    public void change(char control) {
        {
            switch (control) {
                case 'a':
                    if(y!=0)
                        y -= 1;
                    break;
                case 's':
                    if(x!=9)
                        x += 1;
                    break;
                case 'd':
                    if(x!=0)
                        x -= 1;
                    break;
                case 'f':
                    if(y!=19)
                        y += 1;
                    break;

                default:
                    break;
            }
        }
    }
}

class Fish extends GameObject {
    int count = 0;
    public Fish() {
        super((int)((Math.random()*100)%10), (int)((Math.random()*100)%20), 1);
    }
    protected void move() {

    }
    protected  char getShape() {
        return '@';
    }
    public void change() {
        int rand =  (int)((Math.random()*100)%4);

        switch (rand) {
            case 0:
                if(y!=0)
                    y -= 1;
                break;
            case 1:
                if(x!=9)
                    x += 1;
                break;
            case 2:
                if(x!=0)
                    x -= 1;
                break;
            case 3:
                if(y!=19)
                    y += 1;
                break;
            default:
                break;
        }

    }
}

public class Game {

    static Scanner scanner = new Scanner(System.in);

    static public void main(String [] args) {
        Bear bear = new Bear();
        Fish fish = new Fish();

        int bear_pre_x;
        int bear_pre_y;
        int fish_pre_x;
        int fish_pre_y;

        char[][] map = new char[10][20];
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                map[i][j] = '-';
            }
        }

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");

        map[bear.x][bear.y] = bear.getShape();
        map[fish.x][fish.y] = fish.getShape();

        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        while(!bear.collide(fish))
        {
            System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
            char direction = scanner.next().charAt(0);
            bear_pre_x = bear.getX();
            bear_pre_y = bear.getY();

            fish_pre_x = fish.getX();
            fish_pre_y = fish.getY();

            bear.change(direction);

            map[bear.x][bear.y] = bear.getShape();

            if(bear_pre_x != bear.x || bear_pre_y != bear.y)
            {
                map[bear_pre_x][bear_pre_y] = '-';
            }

            map[fish.x][fish.y] = fish.getShape();
            //map[fish_pre_x][fish_pre_y] = '-';

            if(fish.count == 1 || fish.count == 4)
            {
                fish.change();
                if(fish_pre_x != fish.x || fish_pre_y != fish.y)
                {
                    map[fish.x][fish.y] = fish.getShape();
                    map[fish_pre_x][fish_pre_y] = '-';
                }
            }

            for(int i=0; i<map.length; i++) {
                for(int j=0; j<map[i].length; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            fish.count++;
            if(fish.count == 5) {
                fish.count = 0;
            }
        }

        /*for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }*/

    }
}

/*    protected void move(char control) */
/*
    int rand_index_1 =  (int)((Math.random()*100)%5);
    int rand_index_2 =  (int)((Math.random()*100)%5);

        if(rand_index_1 == rand_index_2) {
                while(rand_index_1 == rand_index_2) {
                rand_index_2 =  (int)((Math.random()*100)%5);
                }
                }
                */
