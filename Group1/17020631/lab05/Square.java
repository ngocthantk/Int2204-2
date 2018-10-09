package lab05;

public class Square extends Rectangle{
	public Square() {
		
	}
	public Square(double size) {
		super(size,size);
		
	}
	public Square(double size,String color,boolean filled) {
		super(size,size,color,filled);
		/*
		this.color=color;
		this.filled=filled;*/
	}
	public void setSize(double size) {
		this.length=size;
		this.width=size;
	}
	@Override
	public void setLength(double size) {
		this.length=size;
		//super.setLength(size);
		this.width=size;
	}
	@Override
	public void setWidth(double size) {
		this.length=size;
		//super.setWidth(size);
		this.width=size;
	}
	public static void main(String[] args) {
		Square a=new Square(2);
		a.setLength(5);
		System.out.println(a.length);
	}
}
