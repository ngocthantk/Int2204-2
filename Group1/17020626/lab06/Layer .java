package dohoa;

import java.util.ArrayList;

public class Layer extends Diagram{
	ArrayList<Shape> hinh = new ArrayList<Shape>();
  
 
  public void deleteTriangle(){
    for (int i = 0; i < hinh.size(); i++){
	  if(hinh.get(i) instanceof  Triangle){
		hinh.remove(i);
	i--;
	  }
	}
	
  }

  public void deleteCircle(){
	    for (int i = 0; i < hinh.size(); i++){
		  if(hinh.get(i) instanceof  Circle){
			hinh.remove(i);
                        i--;
			
		  }
		}
		
	  }
}