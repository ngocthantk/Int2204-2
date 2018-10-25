package dohoa;


public class Square extends Rectangle{
    private double canh;

    public Square(boolean fill, double canh) {
        super(fill, canh, canh);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    
}