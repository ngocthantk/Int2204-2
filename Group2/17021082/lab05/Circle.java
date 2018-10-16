public class Circle extends Shape {
    private double radius = 1.0;
    private double area;
    private final double PI = Math.PI;
    private double perimeter;	
    public Circle(){}

    Circle(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double getRadius(){
	return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Circle( double radius, String color, Boolean filled){
        super(color, filled);
	this.radius = radius;
    }
    public double getArea(){
	return area = PI*this.radius*this.radius;
    }
    public double getPerimeter(){
	return perimeter = 2*PI*this.radius;
    }
    @Override
    public String toString(){
	return this.getColor()+ "," + this.getFilled() + "," + this.radius;
    }
	
}