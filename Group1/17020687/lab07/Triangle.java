import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {
	private Node A;
	private Node B;
	private Node C;
	private Node Local;
	
	public Triangle(String color, Node a, Node b, Node c, Node local) {
		super(color);
		A = a;
		B = b;
		C = c;
		Local = local;
	}
	public Node getA() {
		return A;
	}
	public void setA(Node a) {
		A = a;
	}
	public Node getB() {
		return B;
	}
	public void setB(Node b) {
		B = b;
	}
	public Node getC() {
		return C;
	}
	public void setC(Node c) {
		C = c;
	}
	
    public void drawTri(GraphicsContext gc) {
        gc.beginPath();
        gc.moveTo(Local.getX(),Local.getY());
        gc.lineTo(A.getX(),A.getY());
        gc.lineTo(B.getX(),B.getY());
        gc.lineTo(C.getX(), C.getY());
        gc.setStroke(Color.RED);
        gc.stroke();
    }
	public boolean isSameTriangle(Triangle a) {
		if(A==a.A&&B==a.B&&C==a.C)
		return true;
		else return false;
	}
}
