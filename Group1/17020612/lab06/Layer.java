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
public class Layer {
    ArrayList<Shape> lop=new ArrayList<>();
    public int deleteTriangle()
    {
        for (int i = 0; i < lop.size(); i++) {
            if(lop.get(i) instanceof Triangle) 
            {
                lop.remove(i);
                i--;
            }
        }
        return lop.size();
    }
}
