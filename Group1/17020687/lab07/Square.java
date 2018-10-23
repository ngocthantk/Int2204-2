import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Rectangle {
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

	public Square(String color, Node a, Node b, Node c, Node d, Node local) {
		super(color, a, b, c, d, local);
	}
	
	public boolean isSameSquare(Square a) {
		if(A==a.A&&B==a.B&&C==a.C&&D==a.D)
		return true;
		else return false;
	}

}
