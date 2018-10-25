package bai2;

import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Diagram {
	   ArrayList<Layer>dia=new ArrayList<>();
	  //Layer la=new Layer();
      public void delete(ArrayList<Layer>dia)
      {
    	  for(int i=0;i<dia.size();i++)
    	  {
    		 for(int j=0;j<dia.get(i).layer.size();j++)
    		 {
    			 if(dia.get(i).layer.get(j) instanceof Circle)
    			 {
    				 dia.get(i).layer.remove(j);
    				 j--;
    			 }
    		 }
    	  }
      }
    public void sort()
    {
    	Layer C= new Layer();
    	Layer T= new Layer();
    	Layer R= new Layer();
    	Layer S= new Layer();
//    	ArrayList <Shape> C=new ArrayList<>();
//    	ArrayList<Shape>T=new ArrayList<>();
//    	ArrayList<Shape>R=new ArrayList<>();
//    	ArrayList<Shape>S=new ArrayList<>();
    	for(int i=0;i<dia.size();i++)
    	{
    		for(int j=0;j<dia.get(i).layer.size();j++)
    		{
    			 if(dia.get(i).layer.get(j) instanceof Circle) {C.layer.add(dia.get(i).layer.get(j));}
    			 if(dia.get(i).layer.get(j) instanceof Triangle) {T.layer.add(dia.get(i).layer.get(j));}
    			 if(dia.get(i).layer.get(j) instanceof Rectangle) {R.layer.add(dia.get(i).layer.get(j));}
    			 if(dia.get(i).layer.get(j) instanceof Square) {S.layer.add(dia.get(i).layer.get(j));}
    			 //if(dia.get(i).layer.get(j) instanceof Circle) {C.add(dia.get(i).layer.get(j));}
    		}
    	}
    	dia.clear();
    	dia.add(C);
    	dia.add(T);
    	dia.add(R);
    	dia.add(S);
    	
    }
      public void dr(Graphics g)
      {
    	  for(int i=0;i<2;i++)
    	  {
    		  
    		 // System.out.print(i);
    		  ArrayList<Shape> lay=  dia.get(i).deleteCompe();
    		
    		  dia.get(i).Dr(g,lay);
    	  }
      }
}
