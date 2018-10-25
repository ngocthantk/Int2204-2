package javaapplication17;

import java.util.ArrayList;

public class Diagram {

    ArrayList<Layer> sodo = new ArrayList<>();
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
    public void changeSameShape()
    {
        Layer a = new Layer();
        Layer b = new Layer();
        Layer c = new Layer();
        Layer d = new Layer();
       
        for(int i=0; i<sodo.size(); i++)
        {
            for(int j=0; j<sodo.get(i).lop.size(); j++)
            {
                if(sodo.get(i).lop.get(j) instanceof Circle)
                    a.lop.add(sodo.get(i).lop.get(j));
                if(sodo.get(i).lop.get(j) instanceof Hexagon)
                    b.lop.add(sodo.get(i).lop.get(j));
                if(sodo.get(i).lop.get(j) instanceof Square)
                    c.lop.add(sodo.get(i).lop.get(j));
                if(sodo.get(i).lop.get(j) instanceof Triangle)
                    d.lop.add(sodo.get(i).lop.get(j));
               
            }
        }
        this.sodo.clear();
        this.sodo.add(a);
        this.sodo.add(b);
        this.sodo.add(c);
        this.sodo.add(d);
      
    }

}
