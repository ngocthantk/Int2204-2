
public class Rectangle extends Shape{
    private double cd, cr;

    public Rectangle(boolean fill, double cd, double cr) {
        super(fill);
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }
    
}