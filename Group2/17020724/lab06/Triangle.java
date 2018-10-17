package lab06;
public class Triangle extends Shape {
    private double base_;
    private double height_;
    //constructor

    public Triangle() {
        super();
        this.base_ = 1.0;
        this.height_ = 1.0;
    }

    public Triangle(double base, double height) {
        super();
        this.base_ = base;
        this.height_ = height;
    }

    public Triangle(double x, double y, String color, double base, double height) {
        super(x, y, color);
        this.base_ = base;
        this.height_ = height;
    }

    //getter & setter
    public double getBase() {
        return base_;
    }

    public void setBase(double base) {
        this.base_ = base;
    }

    public double getHeight() {
        return height_;
    }

    public void setHeight(double height) {
        this.height_ = height;
    }

    public double getArea() {
        return this.base_* this.height_ * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "base=" + base_ +
                ", height=" + height_ +
                ", x=" + x_ +
                ", y=" + y_ +
                ", color='" + color_ +
                "']\n";
    }
}
