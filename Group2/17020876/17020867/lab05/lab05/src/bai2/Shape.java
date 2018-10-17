package bai2;
//lop hinh
public class Shape
{
  protected String color="red";
  protected boolean filled=true;
//contractor
  public Shape()
  {
  }
  public Shape(String color,boolean filled)
  {
      this.color=color;
      this.filled=filled;
  }    
//get va set
  public String getColor()
  {
      return color;
  }
  public void setColor(String color)
  {
      this.color = color;
  }
  public boolean isFilled()
  {
      return filled;
  }
  public void setFilled(boolean filled)
  {
      this.filled = filled;
  }
//in    
  public String toString()
  {
      return  this.color + " " + this.filled;

  }
}
