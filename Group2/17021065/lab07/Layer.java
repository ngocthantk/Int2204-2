package tuan7;

import java.util.ArrayList;

public class Layer {
	ArrayList<Shape> layer = new ArrayList<Shape>();
	boolean visible = true;
	public void addCircle(int radian, int x, int y) {
		Shape c = new Circle(radian, x, y);
		this.layer.add(c);
	}
	public void addTriangle(int xA, int yA, int xB, int yB, int xC, int yC) {
		Shape t = new Triangle(xA, yA, xB, yB, xC, yC);
		this.layer.add(t);
	}
	public void addRetangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		Shape r = new Retangle(x1, y1, x2, y2, x3, y3, x4, y4);
		this.layer.add(r);
	}
	public void addSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		Shape s = new Square(x1, y1, x2, y2, x3, y3, x4, y4);
		this.layer.add(s);
	}
	public void addHexagon(int x, int y, int side) {
		Shape h = new Hexagon(x, y, side);
		this.layer.add(h);
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
			if(this.layer.get(i) instanceof Retangle) {
				Retangle c = (Retangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Retangle && j!=i) {
						Retangle c1 = (Retangle) this.layer.get(j);
						if(c.sameRetangle(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Square) {
				Retangle c = (Retangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Square && j!=i) {
						Retangle c1 = (Retangle) this.layer.get(j);
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
	
	public void deleteTriangle() {
		for (int i=0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Triangle) { 
				this.layer.remove(i);
				i--;
			}
		}
	}
	public void deleteCircle() {
		for (int i=0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Circle) {
				this.layer.remove(i);
				i--;
			}
		}
	}
}
