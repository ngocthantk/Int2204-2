package Diagram;

public class Shape {
	protected String color = "red";
	protected ToaDo point;
    
    public Shape() {}
    
    public Shape(String color, ToaDo O) {
    	this.color = color;
    	this.point = O;
	}
    
// get thuoc tinh   
    public String getColor() {
        return color;
    }
    public ToaDo getPoint() {
    	return point;
    }
 
// set thuoc tinh  
    public void setColor(String color) {
        this.color = color;
    }
    public ToaDo setPoint(ToaDo O) {
        return this.point = O;
    }
    
    public void move(double distance) {
    	point.setX(point.getX() + distance);
    	point.setY(point.getY() + distance);
    }

    public String toString() {
        return "Shape";
    }
}
