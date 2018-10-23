package lab06;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class CircleT extends Shape {
	protected double radius = 0;
	private Circle circle = new Circle();

	public CircleT() {
	}

	public CircleT(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		try {
			circle = new Circle(x, y, radius);
			circle.setStroke(Color.BLACK);
			circle.setStrokeWidth(2);
			circle.setFill(Color.TRANSPARENT);
			Controller.root.getChildren().add(circle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void erase() {
		try {
			Controller.root.getChildren().remove(circle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}