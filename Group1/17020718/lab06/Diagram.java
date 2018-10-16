package lap06;


import java.util.ArrayList;

public class Diagram{
	ArrayList<Layer> sodo = new ArrayList<Layer>();
  public int deleteCircleOfDiagram(){
    for (int i = 0; i < sodo.size(); i++){
	  int x=sodo.get(i).deleteCircle();
          if(x==0){
              sodo.remove(i);
              
          }
    }
	return sodo.size();
  }
	
}