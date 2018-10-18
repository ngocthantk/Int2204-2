
package dohoa;


public class Circle extends Shape{
    private double radius;
    public Circle(double r, boolean b){
        super(b);
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}