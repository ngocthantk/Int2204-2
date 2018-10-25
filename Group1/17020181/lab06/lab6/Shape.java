package lab6;

public class Shape {
	protected String color = "red";
	protected Location point;
    
    public Shape() {}
    
    public Shape(String color, Location O) {
    	this.color = color;
    	this.point = O;
	}
    

    public String getColor() {
        return color;
    }
    public Location getPoint() {
    	return point;
    }
 

    public void setColor(String color) {
        this.color = color;
    }
    public Location setPoint(Location O) {
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
