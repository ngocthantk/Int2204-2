package lab06;

public class Triangle extends Shape{
	private double edge;
	private double bottomEdge;
	private double height;
	public Triangle() {
		
	}
	public Triangle(double edge1, double edge2, double height) {
		super();
		this.edge = edge1;
		this.bottomEdge = edge2;
		this.height = height;
	}
	
	public double getEdge1() {
		return edge;
	}
	public void setEdge1(double edge1) {
		this.edge = edge1;
	}
	public double getEdge2() {
		return bottomEdge;
	}
	public void setEdge2(double edge2) {
		this.bottomEdge = edge2;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void size() {
			System.out.println(height*bottomEdge/2);	
	}
	@Override
	public void move(double x, double y) {
		super.x = x;
		super.y = y;
	}
	@Override
	public String toString() {
		return "Triangle";
	}
	
}
