package javaapplication17;

import java.util.ArrayList;


public class Diagram {

    ArrayList<Layer> sodo = new ArrayList<Layer>();


    public int deleteCircle() {
        for (int i = 0; i < sodo.size(); i++) {
            for (int j = 0; j < sodo.get(i).lop.size(); j++) {
                if (sodo.get(i).lop.get(j) instanceof Circle) {
                    sodo.get(i).lop.remove(j);
                    j--;
                }

            }
        }
        return sodo.size();
    }

}
