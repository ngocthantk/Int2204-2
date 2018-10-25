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
        for(int i = 0;i < layer.size();i ++){
            layer.get(i).deleteCircle();
        }
    }
    //xoa cac hinh khong hien thi
    public void khongHienHinh(){
        for(int i=0;i<layer.size();i++){
            if(layer.get(i).isVisible()==false) {
                layer.remove(i);
                i--;
		}
        }
    }
    // chuyen hinh ve cung mot layer
    public void chuyenHinh() {
        Layer c = new Layer();
	Layer t = new Layer();
	Layer s = new Layer();
	Layer r = new Layer();
        Layer h = new Layer();
	for(int i=0;i<layer.size();i++) {
	    for(int j=0;j<layer.get(i).shape.size();j++) {
                if(layer.get(i).shape.get(j) instanceof Circle) {
                    c.shape.add(layer.get(i).shape.get(j));  
                }
                if(layer.get(i).shape.get(j) instanceof Rectangle) {
                    r.shape.add(layer.get(i).shape.get(j));
                }
	    	if(layer.get(i).shape.get(j) instanceof Square) {
                    s.shape.add(layer.get(i).shape.get(j));
                }
	    	if(layer.get(i).shape.get(j) instanceof Triangle) {
                    t.shape.add(layer.get(i).shape.get(j));
                }
                if(layer.get(i).shape.get(j) instanceof Hexagon) {
                    h.shape.add(layer.get(i).shape.get(j));
                }
                layer.remove(i);
	    }
	}
    }
}
