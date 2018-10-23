
public class Hexagon extends Shape {
	private double radius; // khoang cach tu tam den cac dinh
	private Node node;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public Hexagon(String color, double radius, Node node) {
		super(color);
		this.radius = radius;
		this.node = node;
	}
	public boolean isSameHexagon(Hexagon b) {
		if(radius==b.radius&&node==b.node)
		return true;
		else return false;
	}
	
}
