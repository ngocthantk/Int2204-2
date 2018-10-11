package lab;

public class Square extends Rectangle {
	 //  private double side;
	   protected Square(double side) {
		super(side,side);
	}
	   public Square(double side,String color,boolean filled)
	   {
		   super(side,side,color,filled);
	   }
	public double getSide() {
		return this.getLength();
	}
	
	public void setSide(double side) {
		this.length = side ;
		this.width = side ;
	}
	public void setWidth(double side)
	{
		this.setSide(side);
	}
	public void setLength(double side)
	{
		this.setSide(side);
	}
	public String toString() {
		String s;
		
		
		double ar=this.getArea();
		double pe=this.getPerimeter();
		
		s="Square"+"   "+ar+"   "+pe+"	"+color+"	"+filled;
		return s;
 
}
}
