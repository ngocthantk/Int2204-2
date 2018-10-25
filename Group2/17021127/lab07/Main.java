package lab7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main {

	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		Draw d = new Draw();
		window.add(d);
		
		
		Shape r = new Retangle(10,10,100,200);
		Shape r1 = new Retangle(10,10,100,200);
		Shape c = new Circle(100,100, 100);
		Shape s = new Square(150, 150,100);
		Shape t = new Triangle(100,300, 100,600,300,300);
		Shape h = new Hexagon(100,100,100);
		
		Layer l = new Layer();
		l.shapes.add(r);
		l.shapes.add(r1);
		l.shapes.add(c);
		l.shapes.add(s);
		l.shapes.add(t);
		l.shapes.add(h);
		
		//test Xoa Circle
		l.deleteCircle();
		boolean a1 = true;
		for(int i = 0; i < l.shapes.size(); i++) {
			if (l.shapes.get(i) instanceof Circle) {
				a1 =false;
				break;
			}
		}
		if (a1 == true) System.out.println("Da xoa hinh Cicrle");
		
		//test Xoa hinh giong nhau
		
		int size1 =  l.shapes.size();
		l.deleteSameShape();
		if (size1 >  l.shapes.size()) System.out.println("Da xoa hinh Giong nhau");
		
		
	}


}
