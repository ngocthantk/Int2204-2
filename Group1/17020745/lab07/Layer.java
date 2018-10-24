package javaapplication17;

import java.util.ArrayList;

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
    
    public void deletesame(){//delete duoc dat trong layer
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
