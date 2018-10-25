package lab07;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Hexagons extends Circles {

	private Polygon polygon = new Polygon();

	public Hexagons() {
	}

	public Hexagons(double x, double y, double radius) {
		super(x, y, radius);
	}

	public List<Double> getPoints() {
		List<Double> points = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			points.add((i % 2 == 0) ? this.x + radius * Math.cos((i / 2) * 2 * Math.PI / 6)
					: this.y + radius * Math.sin((i / 2) * 2 * Math.PI / 6));
		}
		return points;
	}

	public void draw() {
		try {
			polygon.getPoints().addAll(this.getPoints());
			polygon.setStroke(Color.BLACK);
			polygon.setStrokeWidth(2);
			polygon.setFill(Color.TRANSPARENT);
			Controller.root.getChildren().add(polygon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}