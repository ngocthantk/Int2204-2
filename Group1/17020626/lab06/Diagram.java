package dohoa;


import java.util.ArrayList;


public class Diagram{
	ArrayList<Layer> So_Do = new ArrayList<Layer>();

  public void deleteCircle(){
      for(int i=0; i<So_Do.size(); i++){
          So_Do.get(i).deleteCircle();
      }
  }
	
}