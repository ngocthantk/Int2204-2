package lab05;

public class rectangle {

	private shape Shape;
	private double width ;
	private double lenght;
	public shape getShape() {
		return Shape;
	}
	public void setShape(shape shape) {
		Shape = shape;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getArea() {
		double area=2* (width+lenght);
		return area;
	}
	public double getPerimeter() {
		double Perimeter=width*lenght;
		return Perimeter;
	}
	@Override
	public String toString() {
		return "rectangle [Shape=" + Shape + ", width=" + width + ", lenght=" + lenght + "]";
	}
	
}
