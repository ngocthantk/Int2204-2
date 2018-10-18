package lab06;

import java.util.ArrayList;

	public class Diagram {
		ArrayList<Layer> layer = new ArrayList<Layer>();
	//mang dong de loai bo doi tuong hinh tron
	  public void deleteCircle(){
	    for (int i = 0; i < layer.size(); i++){
	    	for(int j=0;j<layer.get(i).hinhHoc.size();j++) {
	    		if(layer.get(i).hinhHoc.get(j) instanceof  Circle){
	    			layer.remove(j);
	    			j--;
	    		}
	    	}
	    }
	  }
	  
}
