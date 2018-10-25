package Tuan06;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Aplications extends Canvas {
//	public Aplications() {
//		setSize(600, 600);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
//	}
	
//	public void paint(Graphics g) {
//		Shape s1 = new Square(2);
//		super.paint(g);
//		g.drawRect(s1.x, s1.y, 50,50);
//	}
	public static void main(String[] args) {
		Shape c1 = new Circle(2);
		Shape s1 = new Square(60);
		
		Layer l1 = new Layer();
		l1.add(c1);
		l1.add(s1);
		
		Diagram d = new Diagram();
		d.addLayer(l1);
		
		d.showAllLayers();
		new Aplications();
		Square s = new Square();
		JFrame f = new JFrame();
		f.add(s);
//		getFrames().clone();
		
	}
}
