/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

\
public class Diagram {
    private ArrayList<Layer> layer;
    
    public Diagram(ArrayList<Layer> layer){
        this.layer = layer;
    }
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
    
}

