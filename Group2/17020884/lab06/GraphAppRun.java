package main.execute;

import java.awt.Color;
import java.awt.EventQueue;

public class GraphAppRun {

	public static void main(String[] args) {
			EventQueue.invokeLater( () -> {
			Diagram renderer = new Diagram();
			Layer layer = new Layer();
			layer.addShape(new Rectangle(100,100));
			layer.addShape(new Circle(100));
			layer.addShape(new Square(10,10,Color.BLACK,false,30));
			Point p1 = new Point(30,90);
			Point p2 = new Point(60,20);
			Point p3 = new Point(20,50);
			layer.addShape(new Triangle(p1,p2,p3));
			renderer.addLayer(layer);
			renderer.getLayer(0).getShape(0).move(10, 10);
			renderer.getLayer(0).getShape(3).move(30, 20);
			renderer.clearAllCircle();
		});
		}

}
