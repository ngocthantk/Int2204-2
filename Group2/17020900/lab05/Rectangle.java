package minh.dim;

public class Rectangle extends Shape {
	protected double width, length;
	
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
	public Rectangle(String color, boolean filled) {
		super(color, filled);
	}
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public Rectangle() {
		super();
	}


	public double getArea() {
		return (this.width*this.length);
	}
	public double getPerimeter() {
		return 2*(this.length + this.width);
	}
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("red", true, 5.0, 6.5);
		System.out.println("chu vi hình chữ nhật " + rectangle.getPerimeter() + "\ndiện tích hình chữ nhật " + rectangle.getArea());
		System.out.println(rectangle.toString());
	}

}
