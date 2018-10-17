package main.execute;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Layer extends JPanel{
	private ArrayList <Shape> elements = new ArrayList<Shape>();
	
	public Layer() {
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
	
	public void clearAllCircle() {
		ArrayList <Shape> c = new ArrayList<Shape>();
		for (Shape shape: elements) {
			if (shape instanceof Circle) c.add(shape);
		}
		elements.removeAll(c);
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
		}
	}
}
