package lab07;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Circles extends Shape {
	protected double radius = 0;
	private Circle circle = new Circle();
 	public Circles() {
	}
 	public Circles(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
 	@Override
	public void draw() {
		try {
			circle = new Circle(x, y, radius);
			circle.setFill(Color.BLUE);
			Controller.root.getChildren().add(circle);
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}
} 