package main.execute;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Layer extends JPanel{
	private ArrayList <Shape> elements = new ArrayList<Shape>();
	private boolean visible = true;
	public Layer() {
		
	}
	
	public int getElementsSize() {
		return elements.size();
	}
	
	public void addShape(Shape shape) {
		elements.add(shape);
	}
	
	public void clearAllTriangle() {
		ArrayList <Shape> tri = new ArrayList<Shape>();
		for (Shape shape: elements) {
			if (shape instanceof Triangle) tri.add(shape);
		}
		elements.removeAll(tri);
	}
	
	public void clearAllSquare() {
		ArrayList <Shape> s = new ArrayList<Shape>();
		for (Shape shape: elements) {
			if (shape instanceof Square) s.add(shape);
		}
		elements.removeAll(s);
	}
	
	public void clearAllRect() {
		ArrayList <Shape> r = new ArrayList<Shape>();
		for (Shape shape: elements) {
			if (shape instanceof Rectangle) r.add(shape);
		}
		elements.removeAll(r);
	}
	
	public void clearAllCircle() {
		ArrayList <Shape> c = new ArrayList<Shape>();
		for (Shape shape: elements) {
			if (shape instanceof Circle) c.add(shape);
		}
		elements.removeAll(c);
	}
	
	public void clearAllHexagon() {
		ArrayList <Shape> h = new ArrayList<Shape>();
		for (Shape shape: elements) {
			if (shape instanceof Hexagon) h.add(shape);
		}
		elements.removeAll(h);
	}
	
	public void clearAllMatch() {
		ArrayList <Shape> h = new ArrayList<Shape>();
		for (int i=0;i<elements.size();i++) {
			for (int j=i+1;j<elements.size();j++) {
				if (elements.get(i) instanceof Circle) {
					if (((Circle)elements.get(i)).equals(elements.get(j))) 
						h.add(elements.get(j));
				}
				if (elements.get(i) instanceof Rectangle) {
					if (((Rectangle)elements.get(i)).equals(elements.get(j))) 
						h.add(elements.get(j));
				}
				if (elements.get(i) instanceof Hexagon) {
					if (((Hexagon)elements.get(i)).equals(elements.get(j))) 
						h.add(elements.get(j));
				}
				if (elements.get(i) instanceof Triangle) {
					if (((Triangle)elements.get(i)).equals(elements.get(j))) 
						h.add(elements.get(j));
				}
			}
		}
		elements.removeAll(h);
	}
	
	public void showAllShape() {
		int shapeNo=0;
		for (Shape shape: elements) {
			System.out.println("Shape no." +shapeNo);
			shape.getInfo();
			shapeNo++;
		}
	}
	
	public void removeShape(int shapeNo) {
		elements.remove(shapeNo);
	}
	
	public Shape getShape(int shapeNo) {
		return elements.get(shapeNo);
	}
	
	public void setVisible(boolean visible) {
		this.visible=visible;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	public void drawShape(Graphics g) {
		for (Shape shape: elements) {
			int pX = shape.getX();
			int pY = shape.getY();
			if (shape instanceof Rectangle) {
				int w  = ((Rectangle) shape).getWidth();
				int l  = ((Rectangle) shape).getLength();
				g.setColor(shape.getColor());
				g.drawRect(pX, pY, w, l);
			}
			if (shape instanceof Square) {
				int s  = ((Square) shape).getWidth();
				g.setColor(shape.getColor());
				g.drawRect(pX, pY, s, s);
			}
			if (shape instanceof Circle) {
				int s = ((Circle) shape).getRadius();
				g.setColor(shape.getColor());
				g.drawOval(pX, pY, s, s);
			}
			if (shape instanceof Triangle) {
				int[] posX= {((Triangle)shape).point1.getPosX(),
						((Triangle)shape).point2.getPosX(),
						((Triangle)shape).point3.getPosX()
						};
				int[] posY= {((Triangle)shape).point1.getPosY(),
						((Triangle)shape).point2.getPosY(),
						((Triangle)shape).point3.getPosY()
						};
				g.setColor(shape.getColor());
				g.drawPolygon(posX, posY, 3);
			}
			if (shape instanceof Hexagon) {
				int[] posX= {((Hexagon)shape).point1.getPosX(),
						((Hexagon)shape).point2.getPosX(),
						((Hexagon)shape).point3.getPosX(),
						((Hexagon)shape).point4.getPosX(),
						((Hexagon)shape).point5.getPosX(),
						((Hexagon)shape).point6.getPosX()
						};
				int[] posY= {((Hexagon)shape).point1.getPosY(),
						((Hexagon)shape).point2.getPosY(),
						((Hexagon)shape).point3.getPosY(),
						((Hexagon)shape).point4.getPosY(),
						((Hexagon)shape).point5.getPosY(),
						((Hexagon)shape).point6.getPosY()
						};
				g.setColor(shape.getColor());
				g.drawPolygon(posX, posY, 6);
			}
		}
	}
}
