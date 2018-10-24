import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{
	private Node A;
	private Node B;
	private Node C;
	private Node D;
	private Node local;
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
	public Node getD() {
		return D;
	}
	public void setD(Node d) {
		D = d;
	}
	public Node getLocal() {
		return local;
	}
	public void setLocal(Node local) {
		this.local = local;
	}
	public Rectangle(String color, Node a, Node b, Node c, Node d, Node local) {
		super(color);
		A = a;
		B = b;
		C = c;
		D = d;
		this.local = local;
	}
	
    public void drawRec(GraphicsContext gc) {
        gc.beginPath();
        gc.moveTo(local.getX(),local.getY());
        gc.lineTo(A.getX(),A.getY());
        gc.lineTo(B.getX(),B.getY());
        gc.lineTo(C.getX(), C.getY());
        gc.lineTo(D.getX(), D.getY());
        gc.lineTo(A.getX(),A.getY());
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        gc.stroke();
    }
	public boolean isSameRectangle(Rectangle a) {
		if(A==a.A&&B==a.B&&C==a.C&&D==a.D)
		return true;
		else return false;
	}
}
