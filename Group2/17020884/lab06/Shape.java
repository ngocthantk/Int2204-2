package main.execute;

import java.awt.Color;

public abstract class Shape {
	protected int posX=0, posY=0;
	protected Color color=Color.WHITE; 
	protected boolean isFilled=true;
	
	public Shape() {
	}
	
	public Shape(int posX, int posY, Color color, boolean isFilled) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void reColor(Color color) {
		this.color = color;
	}
	
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public void getPos() {
		System.out.println("Current pos: (" + posX + "," + posY + ").");
	}
	
	public int getX() {
		return posX;
	}
	
	public int getY() {
		return posY;
	}
	public abstract void getInfo();
	public abstract void setPos(int posX, int posY);
	public abstract void move(int x, int y);
	
}
