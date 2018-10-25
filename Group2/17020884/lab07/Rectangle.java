package main.execute;

import java.awt.Color;

public class Rectangle extends Shape{
	
	protected int width =1, length=1;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int posX, int posY, Color color, boolean isFilled) {
		super(posX, posY, color, isFilled);
	}
	
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(int posX, int posY, Color color, boolean isFilled, int width, int length) {
		super(posX, posY, color, isFilled);
		this.width = width;
		this.length = length;
	}
	
	public void resizeWidth(int width) {
		this.width = width;
	}
	
	public void resizeLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}

	@Override
	public void getInfo() {
		System.out.println("Rectangle");
		System.out.println("width: " + width);
		System.out.println("length: " + length);
		System.out.println("Color" + color);
		getPos();
		
	}

	@Override
	public void setPos(int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
	}
	
	@Override
	public void move(int x, int y) {
		posX+=x;
		posY+=y;
		
	}

	@Override
	public boolean equals(Shape shape) {
		if (shape instanceof Rectangle) {
			if (shape.posX!=this.posX 
			|| shape.posY!=this.posY) 
				return false;
			if (((Rectangle)shape).getWidth()!=this.getWidth()
			|| ((Rectangle)shape).getLength()!=this.getLength())
				return false;
			return true;
		}
		return false;
	}
}
