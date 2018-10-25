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
public class Layer {
    protected ArrayList<Shape> shape;
    private boolean visible;

    public Layer(){
        shape = new ArrayList<>();
    }
    
    public Layer(ArrayList<Shape> shape){
        this.shape = shape;
    }

    public ArrayList<Shape> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Shape> shape) {
        this.shape = shape;
    }
        public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void deleteTriangle(){
        for(int i = 0;i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                i --;
            } 
        }
    }
    public void deleteCircle(){
        for(int i = 0;i < shape.size(); i++){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                i --;
            } 
        }
    }
    
    //ham xoa cac hinh trung nhau
    public void xoaHinhTrung(){
        int i = 0,j;
        for(;i<shape.size()-1;i++ ){
            if(shape.get(i) instanceof Circle){// neu la hinh tron thi xoa hinh tron
                Circle tmp = (Circle) shape.get(i);// tạo thực thể tmp
                for(j = i+1;j<shape.size();j++){
                    if(shape.get(j) instanceof Circle){
                        Circle tmp2 = (Circle) shape.get(j);
                        if(tmp.getTamX() == tmp2.getTamX() && 
                                tmp.getTamY() == tmp2.getTamY() && tmp.getSize() == tmp2.getSize())
                            shape.remove(j);
                    }
                }
            }
            if(shape.get(i) instanceof Triangle){//xóa hình tam giác trùng
                Triangle tmp = (Triangle) shape.get(i);
                for(j = i+1;j<shape.size();j++){
                    if(shape.get(j) instanceof Triangle){
                        Triangle tmp2 = (Triangle) shape.get(j);
                        if(tmp.getDinhA().soSanh(tmp2.getDinhA())&&
                                tmp.getDinhB().soSanh(tmp2.getDinhB()) &&
                                tmp.getDinhC().soSanh(tmp2.getDinhC())) {
                                shape.remove(j);
                        }
                    }
                }
            }
            if(shape.get(i) instanceof Rectangle){//nếu là hình vuông hoặc chữ nhật thì xóa hình Vuông hoặc hình chữ nhật trùng
                Rectangle tmp = (Rectangle) shape.get(i);
                for(j = i+1;j<shape.size();j++){
                    if(shape.get(j) instanceof Rectangle){
                        Rectangle tmp2 = (Rectangle) shape.get(j);
                        if(tmp.getDinhA().soSanh(tmp2.getDinhA())&&
                                tmp.getDinhB().soSanh(tmp2.getDinhB()) &&
                                tmp.getDinhC().soSanh(tmp2.getDinhC()) &&
                                tmp.getDinhD().soSanh(tmp2.getDinhD()) && tmp.getTamX() == tmp2.getTamX() &&
                                tmp.getTamY() == tmp2.getTamY()) {
                                shape.remove(j);
                        }
                    }
                }
            }
            if(shape.get(i) instanceof Hexagon){//xóa hình tam giác trùng
                Hexagon tmp = (Hexagon) shape.get(i);
                for(j = i+1;j<shape.size();j++){
                    if(shape.get(j) instanceof Hexagon){
                        Hexagon tmp2 = (Hexagon) shape.get(j);
                        if(tmp.getDinhA().soSanh(tmp2.getDinhA())&&
                                tmp.getDinhB().soSanh(tmp2.getDinhB()) &&
                                tmp.getDinhC().soSanh(tmp2.getDinhC())) {
                                shape.remove(j);
                        }
                    }
                }
            }
        }
    }
}

