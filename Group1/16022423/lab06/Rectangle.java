public class Rectangle extends Shape {
    protected double width = 2.0;
    protected double length = 2.0;
    public Rectangle(){
    	
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean check) {
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setCheck(check);
    }
	
	public void setWidth(double width) {
        this.width = width;
    }
	
    public double getWidth() {
        return width;
    }
    
	public void setLength(double length) {
        this.length = length;
    }
	
    public double getLength() {
        return length;
    }
    
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
