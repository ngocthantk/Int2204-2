package Tuan06;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public static void main(String[] args) {
		Shape c1 = new Circle(1);
		Shape t1 = new Triangle(3,4,5);
		Shape s2 = new Square(10);
		Shape r2 = new Rectangle(1,5);
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
	}
}