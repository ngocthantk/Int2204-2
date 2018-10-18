/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;
import java.util.ArrayList;

//lop so do
public class Diagram{
	ArrayList<Layer> sodo = new ArrayList<Layer>();
  public void deleteCircleOfDiagram(){
    for (int i = 0; i < sodo.size(); i++){
	  sodo.get(i).deleteCircle();
          int x=sodo.size();
          if(x==0){
              sodo.remove(i);
              
          }
    }
	
  }
	
}