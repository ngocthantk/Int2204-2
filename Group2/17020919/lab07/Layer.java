package bai2;

import java.awt.Graphics;
import java.util.ArrayList;

public class Layer {
	 ArrayList<Shape>layer=new ArrayList<>();
	   
	 public void Dr(Graphics g, ArrayList<Shape> lay)
	 {
		for(int i=0;i<lay.size();i++)
		{
			if(lay.get(i).visible==true)
			{lay.get(i).draw( g);}
		}
	 }   
	 public ArrayList<Shape> deleteCompe()
                  {
                	  ArrayList <Shape> ar=new ArrayList<>();
                	  boolean []kt=new boolean[layer.size()];
                	  for(int i=0;i<kt.length;i++)
                	  {
                		  kt[i]=true;
                	  }
                	  if(layer.size()>0)
                	  {
                		 for(int i=0;i<layer.size();i++)
                	  {
                		  for(int j=i+1;j<layer.size();j++)
                		  {
                			  if((layer.get(i).toString().equals("Circle"))&&layer.get(j).toString().equals("Circle"))
                			  {
                				  Circle circle = (Circle) layer.get(i);
                				  Circle circle1=(Circle) layer.get(j);
                				  if(circle.getHeart().equals (circle1.getHeart()) && circle.getR()==circle1.getR())
                				  {
                					  kt[j]=false;
                					 
                				  }
                				 
                			  }
                			  if(layer.get(i) instanceof Rectangle &&layer.get(j) instanceof Rectangle)
                			  {
                				  Rectangle rec = (Rectangle) layer.get(i);
                				  Rectangle rec1 = (Rectangle) layer.get(j);
                				  if(rec.getTop1().equals (rec1.getTop1()) && rec.getHigh()==rec1.getHigh()&&rec.getWeight()==rec1.getWeight())
                				  {
                					  kt[j]=false;
                				  }
                				
                			  }
                			  if(layer.get(i) instanceof Triangle &&layer.get(j) instanceof Triangle)
                			  {
                				  Triangle tri = (Triangle) layer.get(i);
                				  Triangle tri1 = (Triangle) layer.get(j);
                				  if(tri.getTop1().equals (tri1.getTop1())==true)
                				  {
                					    kt[j]=false;
                				  }
                				  
                			  }
                			  if(layer.get(i) instanceof Square &&layer.get(j) instanceof Square)
                			  {
                				  Square sq = (Square) layer.get(i);
                				  Square sq1 = (Square) layer.get(j);
                				  if(sq.getTop1().equals(sq1.getTop1())&&sq.getHigh()==sq1.getHigh())
                				  {
                					  kt[j]=false;
                				  }
                				 
                			  }
                			  
                		  }
                	  }
                	
                	 // return ar;
//                	  layer.clear();
//                	  for(int i=0;i<ar.size();i++)
//                	  {
//                		  layer.add(ar.get(i));
//                	  }
                  }
                	  for(int i=0;i<kt.length;i++)
                	  {
                		  if(kt[i]==true)
                		  {
                			  ar.add(layer.get(i));
                		  }
                	  }
					return ar;
                  }
                   public void delete(ArrayList<Shape>lay)
                   {
                	   for(int i=0;i<layer.size();i++)
                	   {
                		   if((layer.get(i) instanceof Triangle))
                		   {
                			   layer.remove(i);
                			   i--;
                		   }
                	   }
                   }
                   public void delete1(ArrayList<Shape>lay)
                   {
                	   for(int i=0;i<lay.size();i++)
                	   {
                		   if((lay.get(i) instanceof Circle))
                		   {
                			   lay.remove(i);
                			   i--;
                		   }
                	   }
                   }
}
