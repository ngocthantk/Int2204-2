package javaapplication17;

import java.util.ArrayList;

public class Layer{
	ArrayList<Shape> lop = new ArrayList<Shape>();

  public int deleteTriangle(){
    for (int i = 0; i < lop.size(); i++){
	  if(lop.get(i) instanceof  Triangle){
		lop.remove(i);
		i--;
	  }
	}
	return lop.size();
  }
}