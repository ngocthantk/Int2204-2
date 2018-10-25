package tuan6;
public class Triangle extends Shape {
	private float x1, y1, x2, y2, x3, y3;
	
	public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

        @Override
	public void move() {
		// do somethings
	}

        @Override
	public float getArea() {
		area = (float)Math.abs(((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2);
		return area;
	}

        @Override
	public void showInfo() {
		System.out.println("Triangle: x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2="+ y2 + ", x3=" + x3 + ", y3=" + y3 + ", area=" +getArea());
	}

    @Override
    public void setColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
