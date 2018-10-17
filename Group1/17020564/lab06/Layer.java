package javaapplication17;

import java.util.ArrayList;
//lop lop ke thua tu so do
public class Layer{
	ArrayList<Shape> lop = new ArrayList<Shape>();
  
//mang dong loai bo doi tuong tam giac  
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