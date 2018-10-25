package lab06;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class TriangleT extends Shape {
	protected double x1 = 0, y1 = 0, x2 = 0, y2 = 0;

	private Polygon polygon = new Polygon();
	
	public TriangleT() {
	}

	public TriangleT(double x, double y, double x1, double y1, double x2, double y2) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		polygon.setStroke(Color.BLACK);
		polygon.setStrokeWidth(1);
		polygon.setFill(Color.TRANSPARENT);
	}

	@Override
	public void moveShapeTo(double x, double y) {
		double px = x - this.x;
		double py = y - this.y;
		x1 += px;y1 += py;
		x2 += px;y2 += py;
		super.moveShapeTo(x, y);
	}

	public void erase()
	{
		try
		{
			Controller.root.getChildren().remove(polygon);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void draw() {
		try
		{
			polygon.getPoints().clear();
			polygon.getPoints().addAll(new Double[] { x, y, x1, y1, x2, y2 });
			Controller.root.getChildren().add(polygon);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
