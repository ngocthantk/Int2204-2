package lab05;

public class Shape {
	protected String color = "red";
	protected boolean filled = true;
	public Shape() {}
	public Shape(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return ("Color: "+ getColor()+"\nfilled: " + isFilled());
	}
    public static void main(String[] args) {
    	Shape shape = new Shape("red",true);
    	System.out.print(shape.toString());
	}

}
