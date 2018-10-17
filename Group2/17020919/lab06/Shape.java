package bai2;

public abstract class Shape {
	protected String color;
	protected String name;
    protected double xMove;
    protected double yMove;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getxMove() {
		return xMove;
	}
	public void setxMove(double xMove) {
		this.xMove = xMove;
	}
	public double getyMove() {
		return yMove;
	}
	public void setyMove(double yMove) {
		this.yMove = yMove;
	}
	
	public Shape() {};
	public Shape(String color,double x,double y)
	{
		this.color=color;
		this.xMove=x;
		this.yMove=y;
	}
	public Shape(String s) {
		this.color=s;
	}
	public Shape(double x,double y)
	{
		this.xMove=x;
		this.yMove=y;
	}
	public boolean check()
	{
		return true;
	}
	public String toString(){
		return "Shape";
	}
}
