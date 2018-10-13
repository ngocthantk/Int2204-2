package bai2;

//lop hinh tron ke thua tu lop hinh
public class Circle extends Shape
{
//so PI nen de final	
  final double PI= 3.14;
  private double radius=1.0;
//ham tao    
  public Circle()
  {

  };
  public Circle(double radius)
  {
      this.radius=radius;
  }
  public Circle(double radius,String color,boolean filled)
  {
  	this.radius=radius;;
      this.setColor(color);
      this.setFilled(filled);
  }
//get ban kinh    
  public double getRadius()
  {
      return radius;
  }
//set ban kinh    
  public void setRadius(double radius)
  {
      this.radius = radius;
  }
//get chu vi    
  public double getArea()
  {
      return(PI*this.radius*this.radius);
  }
//get dien tich    
  public double getPerimeter()
  {
      return (2*PI*this.radius);
  }
//in    
  public String toString() {
  	return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
  }
}
