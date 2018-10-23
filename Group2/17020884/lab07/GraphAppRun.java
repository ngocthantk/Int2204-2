package main.execute;

import java.awt.Color;
import java.awt.EventQueue;

public class GraphAppRun {

	public static void main(String[] args) {
			EventQueue.invokeLater( () -> {
			Diagram renderer = new Diagram();
			Layer layer = new Layer();
			Layer layernull = new Layer();
			Layer layervisible = new Layer();
			Point p1 = new Point(0,0);
			Point p2 = new Point(100,0);
			Point p3 = new Point(90,100);
			layer.addShape(new Rectangle(100,100));
			layer.addShape(new Circle(100));
			layer.addShape(new Square(10,10,Color.BLACK,false,30));
			layer.addShape(new Triangle(p1,p2,p3));
			layer.addShape(new Hexagon(
					new Point(100,100),
					new Point(0,200),
					new Point(100,300),
					new Point(200,300),
					new Point(300,200),
					new Point(200,100)
					));
			layernull.addShape(new Hexagon(
					new Point(10,10),
					new Point(0,20),
					new Point(10,30),
					new Point(20,30),
					new Point(30,20),
					new Point(20,10)
					));
			layernull.getShape(0).reColor(Color.RED);
			layervisible.addShape(new Circle(100));
			layervisible.addShape(new Circle(100));
			layervisible.addShape(new Circle(100));
			layervisible.addShape(new Circle(100));
			layervisible.getShape(0).reColor(Color.BLUE);
			layervisible.addShape(new Square(200));
			layervisible.addShape(new Square(200));
			layervisible.addShape(new Rectangle(100,300));
			layervisible.clearAllMatch();
			layernull.clearAllMatch();
			layer.clearAllMatch();
			layervisible.getShape(1).reColor(Color.RED);
			layer.getShape(4).reColor(Color.BLACK);
			renderer.addLayer(layer);
			renderer.addLayer(layernull);
			renderer.addLayer(layervisible);
			renderer.getLayer(0).getShape(3).move(30, 20);
			renderer.reOrganized();
			renderer.getLayer(1).getShape(1).reColor(Color.GREEN);;
			//renderer.getLayer(0).clearAllTriangle();
			//renderer.clearAllCircle();
		});
		}

}
