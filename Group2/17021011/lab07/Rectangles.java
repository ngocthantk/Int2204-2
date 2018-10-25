package lab07;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
 public class Rectangles extends Shape {
    protected double width = 0, length = 0;
	private Rectangle rectangle = new Rectangle();
    
    public Rectangles() {}
     public Rectangles( double x, double y,double width, double length) {
    	super(x,y);
        this.width = width;
        this.length = length;
    }
 
	public void draw() {
		try
		{
			rectangle = new Rectangle(x, y, width, length);
			rectangle.setFill(Color.ORANGE);
			Controller.root.getChildren().add(rectangle);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}