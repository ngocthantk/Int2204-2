package main.execute;

import java.awt.Color;

public class Circle extends Shape{
	protected int radius=1;
	
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public Circle(int posX, int posY, Color color, boolean isFilled) {
		super(posX, posY, color, isFilled);
	}
	
	public Circle(int posX, int posY, Color color, boolean isFilled, int radius) {
		super(posX, posY, color, isFilled);
		this.radius=radius;
	}
	
	public void resize(int radius) {
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
	}
	@Override
	public void getInfo() {
		System.out.println("Circle");
		System.out.println("radius: " + radius);
		System.out.println("isFilled: " + isFilled);
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
	

}
