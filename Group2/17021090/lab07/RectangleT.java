package lab06;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleT extends Shape {
    protected double width = 0, length = 0;
	private Rectangle rectangle = new Rectangle();
    
    public RectangleT() {}

    public RectangleT( double x, double y,double width, double length) {
    	super(x,y);
        this.width = width;
        this.length = length;
    }


	@Override
	public void moveShapeTo(double x, double y)
	{
		super.moveShapeTo(x, y);
	}
	
	public void draw() {
		try
		{
			rectangle = new Rectangle(x, y, width, length);
			rectangle.setStroke(Color.BLACK);
			rectangle.setStrokeWidth(1);
			rectangle.setFill(Color.TRANSPARENT);
			Controller.root.getChildren().add(rectangle);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void erase() {
		try
		{
			Controller.root.getChildren().remove(rectangle);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}