public class Km2Mile extends Converter{
    protected double convert(double src) {
        return src*ratio;
    }
    protected String getSrcString() {
        return "Km";
    }
    public Km2Mile(double ratio) {
        this.ratio = 1/ratio;
    }
    protected String getDestString() {
        return "mile";
    }
    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
