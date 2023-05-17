public class Rectangle0 {

    private int x, y, width, height;

    public Rectangle0(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }

    public boolean contains(Rectangle0 r) {
        //if((this.x <= r.x) && (this.y <= r.y) && (this.x+width >= r.x+r.width) && (this.y + this.height >= r.y + r.height))
        if(((this.x+this.width >= r.x-1) && (this.y <= y-1)) &&
                ((this.x <= x+width+1) && (this.y <= y+height+1)) &&
                ((this.x <= x+width+1) && (this.y + this.height >= y-1)) &&
                ((this.x + this.width >= x-1) && (this.y + this.height >= y-1))
        )
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Rectangle0 r = new Rectangle0(2, 2, 8, 7);
        Rectangle0 s = new Rectangle0(5, 5, 6, 6);
        Rectangle0 t = new Rectangle0(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+ s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}

