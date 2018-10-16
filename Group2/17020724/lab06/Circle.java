package lab06;
public class Circle extends Shape {
    public final double PI = 3.14;
    private double radius_;

    //Constructor
    public Circle() {
        super();
        this.radius_ = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius_ = radius;
    }

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius_ = radius;
    }

    //constructor
    public double getRadius() {
        return radius_;
    }

    public void setRadius(double radius) {
        this.radius_ = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius_ +
                ", x=" + x_ +
                ", y=" + y_ +
                ", color='" + color_ + 
                "']\n";
    }
}
