/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;

/**
 *
 * @author AnhTam
 */
public class Layer {

    ArrayList<Shape> lop = new ArrayList<Shape>();
    protected boolean visible;

    public int deleteTriangle() {
        for (int i = 0; i < lop.size(); i++) {
            if (lop.get(i) instanceof Triangle) {
                lop.remove(i);
                i--;
            }
        }
        return lop.size();
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void deletesame(){
        for (int i = 0; i < lop.size()-1; i++) {
            for (int j = i+1; j < lop.size(); j++){
                if(lop.get(i)==lop.get(j)){
                    lop.remove(j);
                    j--;
                }
            }
        }
    }
    
}