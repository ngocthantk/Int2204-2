package Tuan06;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics2D;

public class Main extends JFrame {
	public Main(){
		setTitle("lab07");
		setVisible(true); 
		setSize(1000, 1000); 
	}
	public void paint(Graphics g) {
		super.paint(g);
		Shape c1 = new Circle(100);
		Shape t1 = new Triangle(100,100,130,150,180,100);
		Shape s2 = new Square(100);
		Shape r2 = new Rectangle(150,250);
		int [] a1 = {500,600,500,300,200};
		int [] a2 = {300,473,646,646,473};
		Shape h1 = new Hexagon(200, 200,a1, a2);
		Layer l1 = new Layer();
		l1.add(c1);
		l1.add(t1);
		l1.add(s2);
		l1.add(r2);		
		Diagram d = new Diagram();
		d.addLayer(l1);
		d.delCircle();
		System.out.println("NEW DIAGRAM");
		d.showAllLayers();
//vẽ hình vuông
		((Square)s2).move(50, 50);
		g.drawRect(s2.x, s2.y,((Square)s2).getSide(),((Square)s2).getSide());
//vẽ hình chữ nhật
		((Rectangle)r2).move(100, 200);
		g.drawRect(r2.x, r2.y, ((Rectangle)r2).getWidth(),((Rectangle)r2).getLength());
//vẽ hình tròn
		((Circle) c1).move(200, 50);
		g.drawArc(c1.x, c1.y,((Circle) c1).getRadius(), ((Circle) c1).getRadius(),360, 360);
//vẽ tam giác
		((Triangle) t1).move(500, 100);
		g.drawLine(t1.x,t1.y,((Triangle) t1).getX2(),((Triangle) t1).getY2());
		g.drawLine(t1.x,t1.y,((Triangle) t1).getX3(),((Triangle) t1).getY3());
		g.drawLine(((Triangle) t1).getX2(),((Triangle) t1).getY2(),((Triangle) t1).getX3(),((Triangle) t1).getY3());
//vẽ lục giác
		((Hexagon)h1).move(300, 300);
		int[] x1 = ((Hexagon)h1).getX1();
		int[] y1 = ((Hexagon)h1).getY1();
		
		g.drawLine(h1.x, h1.y, x1[0], y1[0]);
		g.drawLine(x1[0], y1[0], x1[1], y1[1]);
		g.drawLine(x1[1], y1[1], x1[2], y1[2]);
		g.drawLine(x1[2], y1[2], x1[3], y1[3]);
		g.drawLine(x1[3], y1[3], x1[4], y1[4]);
		g.drawLine(x1[4], y1[4], h1.x, h1.y);
		
	}
	public static void main(String[] args) {
		new Main();		
	}
}