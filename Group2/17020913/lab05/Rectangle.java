<<<<<<< HEAD
package KeThua_2;

public class Rectangle extends Shape {
	double width= 1.0;
	double length =1.0;
	public Rectangle() {};
	public Rectangle(double width,double length,String color, boolean filled) {
		super (color, filled);
		this.width = width;
		this.length = length;
		
	};

	public  Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width*length;
	}
	@Override
	public String toString() {
		
		return this.color + "," + this.filled +","+ this.width+", " + this.length;
		
	}
}
=======
package KeThua_2;

public class Rectangle extends Shape {
	double width= 1.0;
	double length =1.0;
	public Rectangle() {};
	public Rectangle(double width,double length,String color, boolean filled) {
		super (color, filled);
		this.width = width;
		this.length = length;
		
	};

	public  Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width*length;
	}
	@Override
	public String toString() {
		
		return this.color + "," + this.filled +","+ this.width+", " + this.length;
		
	}
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
