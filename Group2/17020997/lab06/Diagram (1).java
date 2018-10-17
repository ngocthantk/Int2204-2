/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
