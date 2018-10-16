package lab06;
	public abstract class Shape {
	    protected double x_;
	    protected double y_;
	    protected String color_;
	    
	    //constructor
	    public Shape(double x, double y, String color) {
	        this.x_ = x;
	        this.y_ = y;
	        this.color_ = color;
	    }

	    public Shape() {
	        this.x_ = 0;
	        this.y_ = 0;
	        this.color_ = "blue";
	    }

	    //method
	    public void moveTo(double x, double y) {
	        this.x_ = x;
	        this.y_ = y;
	    }

	    public void fillColor(String color) {
	        this.color_ = color;
	    }

	    //getter & setter
	    public double getX() {
	        return x_;
	    }

	    public void setX(double x) {
	        this.x_ = x;
	    }

	    public double getY() {
	        return y_;
	    }

	    public void setY(double y) {
	        this.y_ = y;
	    }

	    public String getColor() {
	        return color_;
	    }

	    public void setColor(String color) {
	        this.color_ = color;
	    }

	    @Override
	    public String toString() {
	        return "Shape[" +
	                "x=" + x_ +
	                ", y=" + y_ +
	                ", color='" + color_ +
	                "']";
	    }
}
