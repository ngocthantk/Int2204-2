package main.execute;

import java.awt.Color;

public class Square extends Rectangle{
	protected int side=1;
	
	public Square() {
		super();
	}
	
	public Square(int side) {
		super(side, side);
	}
	
	public Square(int posX, int posY, Color color, boolean isFilled) {
		super(posX, posY, color, isFilled);
	}
	
	public Square(int posX, int posY, Color color, boolean isFilled, int side) {
		super(posX, posY, color, isFilled, side, side);
	}
	
	public void resize(int side) {
		width=side;
		length=side;
	}
	
	@Override
	public void resizeWidth(int side) {
		width=side;
		length=side;
	}
	
	public void resizeHeight(int side) {
		width=side;
		length=side;
	}
	@Override
	public void getInfo() {
		System.out.println("Square");
		System.out.println("side: " + side);
		System.out.println("isFilled: " + isFilled);
		System.out.println("Color" + color);
		getPos();
		
	}

}
