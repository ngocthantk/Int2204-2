package bai2;

public class Square extends Rectangle {
	
      public Square(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
      {
    	  super(x1,y1,x2,y2,x3,y3,x4,y4);
      }
      public Square(String color)
      {
    	  super(color);
      }
      public boolean check()
      {
    	  double a=top1.distance(top2);
    	  double b=top1.distance(top3);
    	  if(top1.kt(top2, top4)&&top2.kt(top1, top3)&&top3.kt(top2, top4)&&a==b)
  		{
  			return true;
  		}
    	  return false;
      }
      public void Move(double a,double b)
      {
    	  top1.Move(a, b);
    	  top2.Move(a, b);
    	  top3.Move(a, b);
    	  top4.Move(a, b);
    	  
      }
	public String toString()
	{
		return "Square";
	}
}
