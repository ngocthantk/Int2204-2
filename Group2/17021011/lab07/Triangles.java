package lab07;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
public class Triangles extends Shape {
	protected double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
	private Polygon polygon = new Polygon();
	
	public Triangles() {
	}
	public Triangles(double x, double y, double x1, double y1, double x2, double y2) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void draw() {
		try
		{
			polygon.getPoints().addAll(new Double[] { x, y, x1, y1, x2, y2 });
			polygon.setStrokeWidth(5);
			polygon.setStroke(Color.RED);
			Controller.root.getChildren().add(polygon);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}