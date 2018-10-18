package bai2;
//lop chu nhat ke thua lop hinh
public class Rectangle extends Shape
{
  protected double width =1.0;
  protected double  length =1.0;
//contractor 
  public  Rectangle ()
  {

  }
  public  Rectangle (double width, double length)
  {
      this.length =length;
      this.width = width;
  }
  public  Rectangle (double width,double length,String color,boolean filled)
  {
	  super(color,filled);
      this.length = length;
      this.width = width;  
  }
//get va set    
  public double getWidth()
  {
      return width;
  }
  public void setWidth(double width)
  {
      this.width = width;
  }
  public double getLength()
  {
      return length;
  }
  public void setLength(double length)
  {
      this.length = length;
  }
//chu vi va dien tich   
  public double getArea()
  {
      return(this.getLength()*this.getWidth());
  }
  public double getPerimeter()
  {
      return (2*(this.getWidth()+this.getLength()));
  }
//in    
  public String toString()
  {
      return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
  }
}

