/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author tuann_000
 */
import java.util.ArrayList;

public class Diagram {
    int i;
    public  void deleteRectangle() {
    ArrayList<Shape> lay = new ArrayList<>();
    for (int i=0;i<lay.size();i++){
       if  (lay.get(i) instanceof Circle)
            lay.remove(i);
              }
    
        }
}

