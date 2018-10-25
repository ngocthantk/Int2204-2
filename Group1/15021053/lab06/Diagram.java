package lab06;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhozx
 */
public class Diagram {
    protected ArrayList<Layer> layer;
    public Diagram(){}
    public Diagram(ArrayList<Layer> layer){
        this.layer = layer;
    }

    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    //vòng lặp 2 lần, lần đầu tiên đi từ lớp layer, mỗi lớp layer có một mảng shape nên ta dò trong mảng shape xem
    public void deleteCircle(){
        Circle circle = new Circle();
        for(int i = 0;i < layer.size(); i++){
            layer.get(i).deleteShape(circle);
        }
    }
    public boolean checkCirlcle(){
        for(int i = 0;i < layer.size();i ++){
            for(int j = 0 ;j <layer.get(i).shape.size(); j++){
                if (layer.get(i).shape.get(j) instanceof Circle){
                    return false;
                }
            }
        }
        return true;
    }
    
}
