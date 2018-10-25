/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;
import java.util.ArrayList;
public class Layer{
	ArrayList<Shape> lop = new ArrayList<Shape>();
  public void deleteTriangle(){
    for (int i = 0; i < lop.size(); i++){
	  if(lop.get(i) instanceof  Triangle){
		lop.remove(i);
		i--;
	  }
	}

  }
  
  public void deleteCircle(){
	    for (int i = 0; i < lop.size(); i++){
		  if(lop.get(i) instanceof  Circle){
			lop.remove(i);
			i--;
		  }
		}
                
	  }
}