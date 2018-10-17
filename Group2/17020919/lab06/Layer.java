package bai2;

import java.util.ArrayList;

public class Layer {
                   ArrayList<Shape>layer=new ArrayList<>();
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
