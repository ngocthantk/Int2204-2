package tuan6;
public abstract class Shape {
	
	private String color;
	protected float area;
	

	public abstract void setColor();
	
        public abstract void setType();
       

	public abstract int getType(); 

	

	public abstract String getColor();
	

	public abstract void move();
		// do somethings
	

	public abstract float getArea();
	

	public abstract void showInfo();
		// do somethings
	
}
