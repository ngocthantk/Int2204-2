package lab03;

public class Rectangle {
	private double width;
	private double height;
	
	// Constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// Calculate
	public double S() {
		return width*height;
	}
	
	public double C() {
		return 2*(width+height);
	}
}
