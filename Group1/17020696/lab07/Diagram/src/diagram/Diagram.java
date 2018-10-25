/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Diagram {
    private ArrayList<Layer> layer = new ArrayList<>();
    
    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    
    public void deleteTriangle(){
        for(int i = 0; i < this.getLayer().size();i++){
            for(int j = 0;j < this.getLayer().get(i).getShape().size();j++){
                if(this.getLayer().get(i).getShape().get(j) instanceof  Circle){
                this.getLayer().remove(i);
                i--;
                }
            }
        }
    }
    
    public void changeSameShape()
    {
        Layer a = new Layer();
        Layer b = new Layer();
        Layer c = new Layer();
        Layer d = new Layer();
       
        for(int i=0; i<layer.size(); i++)
        {
            for(int j=0; j<layer.get(i).getShape().size(); j++)
            {
                if(layer.get(i).getShape().get(j) instanceof Circle)
                    a.getShape().add(layer.get(i).getShape().get(j));
                if(layer.get(i).getShape().get(j) instanceof Hexagon)
                    b.getShape().add(layer.get(i).getShape().get(j));
                if(layer.get(i).getShape().get(j) instanceof Square)
                    c.getShape().add(layer.get(i).getShape().get(j));
                if(layer.get(i).getShape().get(j) instanceof Triangle)
                    d.getShape().add(layer.get(i).getShape().get(j));
               
            }
        }
        this.layer.clear();
        this.layer.add(a);
        this.layer.add(b);
        this.layer.add(c);
        this.layer.add(d);
      
    }

    
}

