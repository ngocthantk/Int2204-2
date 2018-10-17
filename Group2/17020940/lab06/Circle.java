package lab06;

public class Circle extends Shape {
	 private double radius;
	 private Position position ;
	 
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius, double x , double y) {
		super();
		this.radius = radius;
		this.position = new Position(x, y);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(double x , double y ) {
		this.position = new Position(x, y);
	}

	public  double getArea()
	{
		return radius*radius*Math.PI;
	}
	public  double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	public boolean check() {
		return (radius!=0);
	}
	public void move(double a , double b) {
		position.Move(a, b);
	}

}
