package bai2;

//lop hinh vuong ke thua tu lop chu nhat
public class Square extends Rectangle
{
//contractor	
  public Square ()
  {

  }
  public Square (double side)
  {

      super(side,side);

  }
  public Square(double side,String color, boolean filled)
  {
      super(side,side,color,filled);
  }
//get va set    
  public double getSide()
  {
      return this.getLength();
  }
  public void setSide(double side )
  {
      this.setLength(side);
      this.setLength(side);
  }
  public void setLength(double side)
  {
      super.setLength(side);
      super.setWidth(side);
  }
  public void setWidth(double side)
  {
      super.setWidth(side);
      super.setLength(side);
  }
//in    
  public String toString()
  {
      return super.toString();
  }
}

