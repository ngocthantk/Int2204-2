package lab6;


public class Circle extends Shape {
    public double radius;
    public final double PI= Math.PI;

    public Circle() {
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    

    
}

    
    

