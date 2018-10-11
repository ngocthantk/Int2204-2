package Cau2;

public class Square extends Rectangle {
private double side=1.0;
public Square()
{
	
}
public Square(double side)
{
	this.side=side;
}
public Square(double side, String color, boolean filled)
{
	this.side=side;
	this.setColor(color);
	this.setFilled(filled);
}
public double getSide() {
	return side;
}
public void setSide(double side) {
	super.setWidth(side);
	super.setLength(side);
}
public void setWidth(double side)
{
	this.setSide(side);
}
public void setLength(double side)
{
	this.setSide(side);
}

public String toString()
{
	return this.getColor()+','+this.isFilled()+','+this.side;
}
}
