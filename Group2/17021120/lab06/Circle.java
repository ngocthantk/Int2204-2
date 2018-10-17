package lab06;

public class Circle extends Shape {
	private final double PI = 3.14159;
	private double radius;
        private Point I=new Point(1,1);

	// Constructor
	public Circle() {}
        public Circle(double radius) {
            this.radius=radius;
        }
	public Circle(double radius, Point I) {
		this.radius = radius;
                this.I.setX(I.getX());
                this.I.setY(I.getY());
	}
	
	// Setter, getter 
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*PI*radius;
	}
	
	public String toString() {
		return "Name: Circle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

    @Override
    public boolean check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
