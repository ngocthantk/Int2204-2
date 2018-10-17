package lab06;

public class Rectangle extends Shape {
    protected double width = 0, length = 0, x1 = 0, y1 = 0;

    public Rectangle() {}
    
    public Rectangle(double width, double length, double x1, double y1) {
    	this.x1 = x1;
		this.y1 = y1;
    	this.width = width;
        this.length = length;
        this.area = computeArea();
    }

    public Rectangle(double width, double length, double x, double y, double x1, double y1) {
    	super(x,y);
    	this.x1 = x1;
		this.y1 = y1;
        this.width = width;
        this.length = length;
        this.area = this.computeArea();
    }

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", x1=" + x1 + ", y1=" + y1 + ", color=" + color
				+ ", x=" + x + ", y=" + y + ", area=" + area + "]";
	}

	@Override
    public double computeArea() {
        return width * length;
    }
	
	@Override
	public void moveShapeTo(double x, double y)
	{
		double px = x - this.x;
		double py = y - this.y;
		super.moveShapeTo(x, y);
		x1 += px;y1 += py;
	}

}