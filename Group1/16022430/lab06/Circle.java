package tuan6;
public class Circle extends Shape {
	private float x, y, R;
	
	public Circle(float x, float y, float R) {
		this.x = x;
		this.y = y;
		this.R = R;
	}

        @Override
	public void move() {
		// do somethings
	}

        @Override
	public float getArea() {
		area = (float)Math.PI * R * R;
		return area;
	}

        @Override
	public void showInfo() {
		System.out.println("Circle: x=" + x + ", y=" + y + ", R=" + R + ", area=" + getArea());
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
