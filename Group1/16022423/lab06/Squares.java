public class Squares extends Rectangle {
    protected double size = 1.0;
    public Squares(){}

    public Squares(double size) {
        this.length = size;
        this.width = size;
    }

    public Squares(double size, String color, boolean check) {
        this.size =size;
        this.setColor(color);
        this.setCheck(check);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        this.width = length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
