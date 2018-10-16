<<<<<<< HEAD
package Cau2;

public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;

	public Rectangle() {

	}

	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double width, double length,String color,boolean filled) {
		super(color,filled);
		this.length = length;
		this.width = width;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.getLength();
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

//Tinh Chu Vi
	public double getPeremeter() {
		return (this.length + this.width) * 2;
	}

//tinh Dien Tich
	public double getArea() {
		return this.length * this.width;
	}
	public String toString()
	{
		return this.getColor()+','+this.isFilled()+','+this.length+','+this.width;
	}
}
=======
package Cau2;

public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;

	public Rectangle() {

	}

	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double width, double length,String color,boolean filled) {
		super(color,filled);
		this.length = length;
		this.width = width;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.getLength();
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

//Tinh Chu Vi
	public double getPeremeter() {
		return (this.length + this.width) * 2;
	}

//tinh Dien Tich
	public double getArea() {
		return this.length * this.width;
	}
	public String toString()
	{
		return this.getColor()+','+this.isFilled()+','+this.length+','+this.width;
	}
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
