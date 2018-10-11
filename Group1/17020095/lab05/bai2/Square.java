public class Square extends Rectangle{
	Square(){
		super();
	}
	Square(double side){
		super(side,side);
	}
	Square(double side,String color,boolean filled){
		super(side,side,color,filled);
	}
	
	public double getSide(){
		return width;
	}
	
	public void setSide(double side){
		this.width = side;
		this.length = side;
	}	
	public void setWidth(double width){
		this.width = width;
		this.length = width;
	}
	public void setLength(double length){
		this.width = length;
		this.length = length;
	}
	
	public String toString(){
		return null;
	}
	
}
