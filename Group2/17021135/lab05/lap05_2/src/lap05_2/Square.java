package lap05_2;

public class Square extends Rectangle{
	
	public Square(){}
	
	public Square(double side){
	this.setWidth(side);
	this.setLength(side);
	}

	public Square(double side, String color, boolean filled){
	this.setWidth(side);
	this.setLength(side);
	this.setColor(color);
	this.setFilled(filled);
	}
	
	public double getSide(){
	return this.getWidth();
	}

	public void setSide(double side){
	this.setWidth(side);
	this.setLength(side);
	}
	@Override
	public String toString(){
	return this.getColor()+","+this.getFilled()+","+this.getWidth();}
}