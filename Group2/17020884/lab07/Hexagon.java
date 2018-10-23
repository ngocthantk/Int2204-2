package main.execute;

import java.awt.Color;

public class Hexagon extends Shape{

	protected Point 
		point1= new Point(0,0),
		point2 = new Point(0,1),
		point3= new Point(1,0),
		point4= new Point(1,1),
		point5= new Point(2,1),
		point6= new Point(1,0);
	
	public Hexagon() {
		super();
	}
	
	public Hexagon(int posX, int posY, Color color, boolean isFilled) {
		super(posX, posY, color, isFilled);
		point1.setPos(posX, posY);
	}
	
	public Hexagon(Point point1, Point point2, Point point3, Point point4, Point point5, Point point6) {
		super();
		this.point1= point1;
		this.point2= point2;
		this.point3= point3;
		this.point4= point4;
		this.point5= point5;
		this.point6= point6;
	}
	
	public Hexagon(int posX, int posY, Color color, boolean isFilled,
			Point point2, Point point3, Point point4, Point point5, Point point6) {
		super(posX, posY, color, isFilled);
		point1.setPos(posX, posY);
		this.point2= point2;
		this.point3= point3;
		this.point4= point4;
		this.point5= point5;
		this.point6= point6;
	}
	
	public void resize(Point point1, Point point2, Point point3, Point point4, Point point5, Point point6) {
		this.point1= point1;
		this.point2= point2;
		this.point3= point3;
		this.point4= point4;
		this.point5= point5;
		this.point6= point6;
	}
	@Override
	public void getInfo() {
		System.out.println("Hexagon");
		System.out.println("Location: ");
		System.out.println(point1.getPosX() + "," + point1.getPosY());
		System.out.println(point2.getPosX() + "," + point2.getPosY());
		System.out.println(point3.getPosX() + "," + point3.getPosY());
		System.out.println(point4.getPosX() + "," + point4.getPosY());
		System.out.println(point5.getPosX() + "," + point5.getPosY());
		System.out.println(point6.getPosX() + "," + point6.getPosY());
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
		point4.setPos(point4.getPosX()+x, point4.getPosY()+y);
		point5.setPos(point5.getPosX()+x, point5.getPosY()+y);
		point6.setPos(point6.getPosX()+x, point6.getPosY()+y);
	}

	@Override
	public boolean equals(Shape shape) {
		if (shape instanceof Hexagon) {
			if (shape.posX!=this.posX 
			|| shape.posY!=this.posY) 
				return false;
			if (((Hexagon)shape).point2.getPosX()!=this.point2.getPosX() 
			|| ((Hexagon)shape).point2.getPosY()!=this.point2.getPosY()) 
				return false;
			if (((Hexagon)shape).point3.getPosX()!=this.point3.getPosX() 
			|| ((Hexagon)shape).point3.getPosY()!=this.point3.getPosY()) 
				return false;
			if (((Hexagon)shape).point4.getPosX()!=this.point4.getPosX() 
			|| ((Hexagon)shape).point4.getPosY()!=this.point4.getPosY()) 
				return false;
			if (((Hexagon)shape).point5.getPosX()!=this.point5.getPosX() 
			|| ((Hexagon)shape).point5.getPosY()!=this.point5.getPosY()) 
				return false;
			if (((Hexagon)shape).point6.getPosX()!=this.point6.getPosX() 
			|| ((Hexagon)shape).point6.getPosY()!=this.point6.getPosY()) 
				return false;
			return true;
		}
		return false;
	}

}
