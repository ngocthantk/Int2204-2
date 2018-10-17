package bai2;

public class Shape {
	protected String color = "red";
	protected boolean filled = true;
    
    public Shape() {}
    
    public Shape(String color,boolean filled) {
    	this.color = color;
    	this.filled = filled;
    }
// get thuoc tinh   
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
// set thuoc tinh  
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape ";
    }
}
