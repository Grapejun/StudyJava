class TV {
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}
public class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color) {
        super(size);
        //super.size = size;
        //super(size);
        this.color = color;
    }
    public void printProperty() {
        System.out.println(getSize()+"인치 "+color+"컬러");
    }
    protected int getColor() { return color; }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    } // 실습문제 1번
}
