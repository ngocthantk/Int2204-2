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
	  //
	  public void ve() {
		  for(int i=0;i<layer.size();i++) {
			  if(layer.get(i).isVisible()==false) {
				  layer.remove(i);
				  i--;
			  }
		  }
	  }
	  //
	  public void cungLayer() {
		  Layer c = new Layer();
	      Layer t = new Layer();
	      Layer s = new Layer();
	      Layer r = new Layer();
	      for(int i=0;i<layer.size();i++) {
	    	  for(int j=0;j<layer.get(i).hinhHoc.size();j++) {
	    		  if(layer.get(i).hinhHoc.get(j) instanceof Circle) {
	    			  c.hinhHoc.add(layer.get(i).hinhHoc.get(j));
	    		  }
	    		  if(layer.get(i).hinhHoc.get(j) instanceof Rectangle) {
	    			  r.hinhHoc.add(layer.get(i).hinhHoc.get(j));
	    		  }
	    		  if(layer.get(i).hinhHoc.get(j) instanceof Square) {
	    			  s.hinhHoc.add(layer.get(i).hinhHoc.get(j));
	    		  }
	    		  if(layer.get(i).hinhHoc.get(j) instanceof Triangle) {
	    			  t.hinhHoc.add(layer.get(i).hinhHoc.get(j));
	    		  }
	    	  }
	      }
	  }
}
