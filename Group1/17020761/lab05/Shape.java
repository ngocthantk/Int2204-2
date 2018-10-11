package chap05.oop2;

public class Shape {
	protected String color = "blue";
	protected boolean filled = true;
	public String getColor() {
		return this.color;
	}
	public void setColor(String s) {
		this.color = s;
	}
	public boolean isFilled() {
		return this.filled;
	}
	public void setFilled(boolean a) {
		this.filled = a;
	}
	public  Shape(String s,boolean a) {
		this.color = s;
		this.filled = a;
	}
	public Shape() {
		
	}
	public String toString() {
		return "abc";
	}
}
