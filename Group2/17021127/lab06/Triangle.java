package lab6;

public class Triangle extends Shape {
	private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
     private Point A, B, C;
    // Constructor
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
     public Triangle(Point A, Point B, Point C) {
    	this.A = A;
    	this.B = B;
    	this.C = C;
    }

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
    // getter, setter
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
    
	// calculate
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
	    double p = getPerimeter() / 2;
	    return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}
        @Override
	public boolean check() {
		double AB = A.length(B);
		double BC = B.length(C);
		double AC = A.length(C);
		if(AB+AC>BC && AB+BC>AC && AC+BC>AB) return true;
		return false;
	}
        @Override

        public String toString() {
	    return "Triangle: Side 1 = " + side1 + " Side 2 = " + side2
	           + " Side 3 = " + side3 + "\nMove: " + canMove + "\nFilled: " + filled;
	}
        @Override
	public void move(double x, double y) {
		A.movePoint(x, y);
		B.movePoint(x, y);
		C.movePoint(x, y);
	}
}
