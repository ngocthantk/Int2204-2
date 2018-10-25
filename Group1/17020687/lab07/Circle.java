import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Circle extends Shape{
	private Node O; // Tam duong tron
	private double radius; // Ban kinh duong tron
	
	public Node getO() {
		return O;
	}
	public void setO(Node o) {
		O = o;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(String color, Node o, double radius) {
		super(color);
		O = o;
		this.radius = radius;
	}
	
	public void drawCircle(Pane pane)
	{
		javafx.scene.shape.Circle c = new javafx.scene.shape.Circle();
		c.setCenterX(O.getX());
		c.setCenterY(O.getY());
		c.setRadius(radius);
		c.setStroke(Color.RED);
		c.setFill(Color.RED);
		pane.getChildren().add(c);
	}
	public boolean isSameCircle(Circle a) {
		if(this.O.getX()==a.O.getX()&&this.O.getY()==a.O.getY()&&radius==a.radius) return true;
		else return false;
	}
	
}
