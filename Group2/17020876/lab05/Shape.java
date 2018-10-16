package Shape;

public class Shape{
	String color = "red";
	Boolean filled = true;
        
	public Shape(){}

	public Shape(String color, Boolean filled)
        {
            this.color = color;
            this.filled = filled;
	}
	public String getColor()
        {
            return color;
        }
	public void setColor(String color)
        {
            this.color = color;
        }
	public Boolean getFilled()  
        {
            return filled;
        }
        public void setFilled(Boolean filled)
        {
            this.filled = filled;
        }

	
	public String toString()
        {
              return this.toString();
        }
}