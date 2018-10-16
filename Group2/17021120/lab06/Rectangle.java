package lab06;

public class Rectangle extends Shape {
	protected Point A=new Point(1,1);
        protected Point B=new Point(1,1);
        protected Point C=new Point(1,1);
        protected Point D=new Point(1,1);

	// Constructor
	public Rectangle() {}
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		//super();
		this.A=A;
                this.B=B;
                this.C=C;
                this.D=D;
	}
	
	public Rectangle(Point A, Point B, Point C, Point D, boolean canMove, boolean filled) {
		this.A=A;
                this.B=B;
                this.C=C;
                this.D=D;
		this.canMove = canMove;
		this.filled = filled;
	}

	// Setter, getter

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getD() {
        return D;
    }

    public void setD(Point D) {
        this.D = D;
    }
	
	
	public double getArea() {
		return this.A.Distance(B)*this.A.Distance(D);
	}
	
	public double getPerimeter() {
		return 2*(this.A.Distance(B)+this.A.Distance(D));
	}
	
	public String toString() {
		return "Name: Rectangle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nWidth: " + this.A.Distance(B) + "\nLength: " + this.A.Distance(D) +  "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

    @Override
    public boolean check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}