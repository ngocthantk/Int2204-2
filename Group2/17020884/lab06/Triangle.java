package main.execute;

import java.awt.Color;

public class Triangle extends Shape{

	protected Point point1= new Point(0,0),
			point2 = new Point(0,1),
			point3= new Point(1,0);
	
	public Triangle() {
		super();
	}
	
	public Triangle(int posX, int posY, Color color, boolean isFilled) {
		super(posX, posY, color, isFilled);
		point1.setPos(posX, posY);
	}
	
	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1= point1;
		this.point2= point2;
		this.point3= point3;
	}
	
	public Triangle(int posX, int posY, Color color, boolean isFilled, Point point2, Point point3) {
		super(posX, posY, color, isFilled);
		point1.setPos(posX, posY);
		this.point2= point2;
		this.point3= point3;
	}
	
	public void resize(Point point1, Point point2, Point point3) {
		this.point1= point1;
		this.point2= point2;
		this.point3= point3;
	}
	@Override
	public void getInfo() {
		System.out.println("Triangle");
		System.out.println("Location: ");
		System.out.println(point1.getPosX() + "," + point1.getPosY());
		System.out.println(point2.getPosX() + "," + point2.getPosY());
		System.out.println(point3.getPosX() + "," + point3.getPosY());
		System.out.println("isFilled: " + isFilled);
		System.out.println("Color" + color);
		getPos();
		
	}

	@Override
	public void setPos(int x, int y) {
		this.point1.setPos(x, y);
	}

	@Override
	public void move(int x, int y) {
		point1.setPos(point1.getPosX()+x, point1.getPosY()+y);
		point2.setPos(point2.getPosX()+x, point2.getPosY()+y);
		point3.setPos(point3.getPosX()+x, point3.getPosY()+y);
	}

}
