package main.execute;

public class Point {
	private int posX=0,posY=0;
	
	public Point(int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
	}
	
	public Point() {
	}
	
	
	public void setPos(int x, int y) {
		posX=x;
		posY=y;
	}
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
}
