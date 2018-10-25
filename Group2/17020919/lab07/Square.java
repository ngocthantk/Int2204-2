package bai2;

import java.awt.Graphics;

public class Square extends Rectangle {
	
      public Square(int x1,int y1,int width,boolean visible)
      {
    	  super(x1,y1,width,width,visible);
      }
      public Square(String color)
      {
    	  super(color);
      }
      public String toString()
  	{
  		return "Square";
  	}
//      public boolean check()
//      {
//    	  double a=top1.distance(top2);
//    	  double b=top1.distance(top3);
//    	  if(top1.kt(top2, top4)&&top2.kt(top1, top3)&&top3.kt(top2, top4)&&a==b)
//  		{
//  			return true;
//  		}
//    	  return false;
//      }
//      public void Move(double a,double b)
//      {
//    	  top1.Move(a, b);
//    	  top2.Move(a, b);
//    	  top3.Move(a, b);
//    	  top4.Move(a, b);
//    	  
//      }
}
