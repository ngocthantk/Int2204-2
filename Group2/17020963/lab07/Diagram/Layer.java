package Diagram;

import java.util.ArrayList;

public class Layer{
	public ArrayList<Shape> layer = new ArrayList<Shape>();
	public boolean visible = true;
	
	public void deleteTriangle() {
		ArrayList <Shape> tri = new ArrayList<Shape>();
		for (Shape shape: layer) {
			if (shape instanceof Triangle) tri.add(shape);
		}
		layer.removeAll(tri);
	}
	
	public void addCircle(int radian, ToaDo A) {
		Shape c = new Circle(radian, A);
		this.layer.add(c);
	}
	public void addTriangle(int xA, int yA, int xB, int yB, int xC, int yC) {
		Shape t = new Triangle(xA, yA, xB, yB, xC, yC);
		this.layer.add(t);
	}
	public void addRectangle(double width, double length, ToaDo A) {
		Shape r = new Rectangle(width, length, A);
		this.layer.add(r);
	}
	public void addSquare(double side, ToaDo A) {
		Shape s = new Square(side, A);
		this.layer.add(s);
	}
	public void addHexagon(int x, int y, int side) {
		Shape h = new Hexagon(x, y, side);
		this.layer.add(h);
	}
	
	public void deleteCircle() {
		ArrayList <Shape> c = new ArrayList<Shape>();
		for (Shape shape: layer) {
			if (shape instanceof Circle) c.add(shape);
		}
		layer.removeAll(c);
	}
	
	public void deleteSame() {
		for(int i=0; i<this.layer.size(); i++) {
			if(this.layer.get(i) instanceof Circle) {
				Circle c = (Circle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Circle && j!=i) {
						Circle c1 = (Circle) this.layer.get(j);
						if(c.sameCircle(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Triangle) {
				Triangle c = (Triangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Triangle && j!=i) {
						Triangle c1 = (Triangle) this.layer.get(j);
						if(c.sameTriangle(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Rectangle) {
				Rectangle c = (Rectangle) this.layer.get(i);
				for(int j =0 ; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Rectangle && j!=i) {
						Rectangle c1 = (Rectangle) this.layer.get(j);
						if(c.sameRetangle(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Square) {
				Rectangle c = (Rectangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Square && j!=i) {
						Rectangle c1 = (Rectangle) this.layer.get(j);
						if(c.sameRetangle(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Hexagon) {
				Hexagon c = (Hexagon) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Hexagon && j!=i) {
						Hexagon c1 = (Hexagon) this.layer.get(j);
						if(c.sameHexagon(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
		
		}
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	
	
}
