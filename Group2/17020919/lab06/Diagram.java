package bai2;

import java.util.ArrayList;

public class Diagram {
	   ArrayList<Layer>dia=new ArrayList<>();
	  Layer la=new Layer();
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
      public void delete1(ArrayList<Layer>dia)
      {
    	  for(int i=0;i<dia.size();i++)
    	  {
    		 la.delete1(dia.get(i).layer); 
    	  }
      }
}
