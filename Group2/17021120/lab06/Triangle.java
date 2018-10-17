package lab06;

public class Triangle extends Shape {
	private Point A=new Point(1,1);
        private Point B=new Point(1,1);
        private Point C=new Point(1,1);
      //  private Point D=new Point(1,1);
    
    // Constructor
    public Triangle() {
    }

    public Triangle(Point A, Point B, Point C) {
        this.A=A;
        this.B=B;
        this.C=C;
    }

    // getter, setter

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

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }
	
    
	// calculate
	public double getPerimeter() {
            
		return this.A.Distance(B)+this.A.Distance(C)+this.B.Distance(C);
	}
	
	public double getArea() {
	    double p = getPerimeter() / 2;
	    return Math.sqrt(p * ((p - this.A.Distance(B)) * (p - this.A.Distance(C)) * (p - this.B.Distance(C))));
	}
	
	public String toString() {
	    return "Triangle: Side 1 = " +  this.A.Distance(B) + " Side 2 = " + this.A.Distance(C)
	           + " Side 3 = " + this.B.Distance(C) + "\nMove: " + canMove + "\nFilled: " + filled;
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
