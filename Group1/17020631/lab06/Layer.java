package lab06;

import java.util.ArrayList;

import lab05.Shape;

public class Layer{
	protected ArrayList<shape> hinhHoc = new ArrayList<shape>();
	  
	//mang dong loai bo doi tuong tam giac  
	  public void deleteTriangle(){
	    for (int i = 0; i < hinhHoc.size(); i++){
		  if(hinhHoc.get(i) instanceof  Triangle){
			hinhHoc.remove(i);
			i--;
		  }
		}
	  }
}
