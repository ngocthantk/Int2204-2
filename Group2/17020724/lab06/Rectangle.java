 package lab06;

public class Rectangle extends Shape {

    protected double width_;
    protected double length_;

    //Constructor
    public Rectangle() {
        super();
        this.length_ = 1.0;
        this.width_ = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width_ = width;
        this.length_ = length;
    }

    public Rectangle(int x, int y, String color, double width, double length) {
        super(x, y, color);
        this.width_ = width;
        this.length_ = length;
    }

    //getter & setter
    public double getWidth() {
        return width_;
    }

    public void setWidth(double width) {
        this.width_ = width;
    }

    public double getLength() {
        return length_;
    }

    public void setLength(double length) {
        this.length_ = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width_ +
                ", length=" + length_ +
                ", x=" + x_ +
                ", y=" + y_ +
                ", color='" + color_ + 
                "']\n";
    }
}
