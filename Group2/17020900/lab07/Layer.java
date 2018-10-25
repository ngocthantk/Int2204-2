package minh.dim;

import java.util.ArrayList;

public class Layer {
	ArrayList<Shape> layer = new ArrayList<Shape>();
	boolean visible = true;
	public void themCircle(int radian, int x, int y) {
		Shape c = new Circle(radian, x, y);
		this.layer.add(c);
	}
	public void themTriangle(int xA, int yA, int xB, int yB, int xC, int yC) {
		Shape t = new Triangle(xA, yA, xB, yB, xC, yC);
		this.layer.add(t);
	}
	public void themRetangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		Shape r = new Retangle(x1, y1, x2, y2, x3, y3, x4, y4);
		this.layer.add(r);
	}
	public void themSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		Shape s = new Square(x1, y1, x2, y2, x3, y3, x4, y4);
		this.layer.add(s);
	}
	public void themHexagon(int x, int y, int side) {
		Shape h = new Hexagon(x, y, side);
		this.layer.add(h);
	}
	public void xoaSame() {
		for(int i=0; i<this.layer.size(); i++) {
			if(this.layer.get(i) instanceof Circle) {
				Circle circle = (Circle) this.layer.get(i);
				for(int j=0; j <this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Circle && j!=i) {
						Circle c1 = (Circle) this.layer.get(j);
						if(circle.sameCircle(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Triangle) {
				Triangle triangle = (Triangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Triangle && j!=i) {
						Triangle a = (Triangle) this.layer.get(j);
						if(triangle.TanhF(a)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Retangle) {
				Retangle retangle = (Retangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Retangle && j!=i) {
						Retangle r = (Retangle) this.layer.get(j);
						if(retangle.TandF(r)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Square) {
				Retangle retangle = (Retangle) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Square && j!=i) {
						Retangle c1 = (Retangle) this.layer.get(j);
						if(retangle.TandF(c1)) this.layer.remove(j);
						j--;
					}
					
				}
			}
			if(this.layer.get(i) instanceof Hexagon) {
				Hexagon hexagon = (Hexagon) this.layer.get(i);
				for(int j=0; j<this.layer.size(); j++) {
					if(this.layer.get(j) instanceof Hexagon && j!=i) {
						Hexagon c1 = (Hexagon) this.layer.get(j);
						if(hexagon.TandF(c1)) this.layer.remove(j);
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
