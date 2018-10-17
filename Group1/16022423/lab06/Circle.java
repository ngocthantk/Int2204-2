public class Circle extends Shape {
    protected double radius;
    final double PI = 3.1415;
    public Circle(){
    	
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean check) {
        this.radius = radius;
        this.setColor(color);
        this.setCheck(check);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*PI*PI;
    }

    public double getPerimeter() {
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
