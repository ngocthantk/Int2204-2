package bai2;

public class Square extends Rectangle {
	 //  private double side;
	   public Square(double side) {
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
		this.setLength(side);
		this.setWidth(side);
	}
	public void setWidth(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	public void setLength(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	
	public String toString() {
		String s;
		
		
		double ar=this.getArea();
		double pe=this.getPerimeter();
		
		s="Square"+"   "+ar+"   "+pe;
		return s;
 
}
}
