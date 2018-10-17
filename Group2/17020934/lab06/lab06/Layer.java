/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author tuann_000
 */
public class Layer {
    private int i;
    public  void deleteRectangle() {
    ArrayList<Shape> lay = new ArrayList<>();
    for (int i=0;i<lay.size();i++){
       if  (lay.get(i) instanceof Rectangle)
            lay.remove(i);
              }
    
        }
}
