/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Diagram {
    ArrayList<Layer> diagram=new ArrayList<>();
    public int deleteCircle()
    {
        for (int i = 0; i < diagram.size(); i++) {
            for (int j = 0; j < diagram.get(i).lop.size(); j++) {
            if(diagram.get(i).lop.get(j) instanceof Circle)
                diagram.get(i).lop.remove(j);
                j--;
              
            }  
        }
        return diagram.size();
    }
}
