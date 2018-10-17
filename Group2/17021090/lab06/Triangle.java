package lab06;


public class Triangle extends Shape {
	protected double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
	
	public Triangle() {}
    
	public Triangle(double x1, double y1, double x2, double y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.area = computeArea();
	}
	
	public Triangle(double x, double y ,double x1, double y1, double x2, double y2)
	{
		super(x,y);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.area = computeArea();
	}
    
    

	@Override
	public String toString() {
		return "Triangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", color=" + color + ", x=" + x
				+ ", y=" + y + ", area=" + area + "]";
	}

	@Override
    public double computeArea() {
        double a = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        double b = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double c = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
        double p = (a + b + c)/ 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p -c));
    }
	
	@Override
	public void moveShapeTo(double x, double y)
	{
		double px = x - this.x;
		double py = y - this.y;
		super.moveShapeTo(x, y);
		x1 += px;y1 += py;
		x2 += px;y2 += py;
	}

	
}
