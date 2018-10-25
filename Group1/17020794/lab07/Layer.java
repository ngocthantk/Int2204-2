/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class Layer extends JPanel {

    ArrayList<Shape> lop = new ArrayList<Shape>();
    boolean visible = true;

    public Layer(ArrayList<Shape> l) {
        this.lop = l;
        visible =true;
    }
    public Layer(){
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        if (this.visible) {
            super.paintComponent(g);
            for (Shape s : this.lop) {
                s.drawShape(g);
            }
        }
    }

    public void deleteTriangle() {
        for (int i = 0; i < lop.size(); i++) {
            if (lop.get(i) instanceof Triangle) {
                lop.remove(i);
                i--;
            }
        }

    }

    public void deleteCircle() {
        for (int i = 0; i < lop.size(); i++) {
            if (lop.get(i) instanceof Circle) {
                lop.remove(i);
                i--;
            }
        }

    }
    public void deleteSameShape(){
        for(int i =0; i<lop.size(); i++){
            if(lop.get(i) instanceof Circle){
                Circle a= (Circle) lop.get(i);
                for(int j=0; j<lop.size(); j++){
                    if((lop.get(j) instanceof Circle)&&i!=j){
                        Circle c=(Circle) lop.get(j);
                        if(a.isSameCircle(c)){
                        lop.remove(lop.get(j));
                        j--;
                    }
                    }
                    
                }
            }
            if(lop.get(i) instanceof Triangle){
                Triangle a= (Triangle) lop.get(i);
                for(int j=0; j<lop.size(); j++){
                    if((lop.get(j) instanceof Triangle)&&i!=j){
                        Triangle c=(Triangle) lop.get(j);
                        if(a.isSame(c)){
                        lop.remove(lop.get(j));
                        j--;
                    }
                    }
                    
                }
            }
             if(lop.get(i) instanceof Rectangle){
                Rectangle a= (Rectangle) lop.get(i);
                for(int j=0; j<lop.size(); j++){
                    if((lop.get(j) instanceof Rectangle)&&i!=j){
                        Rectangle c=(Rectangle) lop.get(j);
                        if(a.isSame(c)){
                        lop.remove(lop.get(j));
                        j--;
                    }
                    }
                    
                }
            }
               if(lop.get(i) instanceof Square){
                Square a= (Square) lop.get(i);
                for(int j=0; j<lop.size(); j++){
                    if((lop.get(j) instanceof Square)&&i!=j){
                        Square c=(Square) lop.get(j);
                        if(a.isSame(c)){
                        lop.remove(lop.get(j));
                        j--;
                    }
                    }
                    
                }
            }
                 if(lop.get(i) instanceof Hexagon){
                Hexagon a= (Hexagon) lop.get(i);
                for(int j=0; j<lop.size(); j++){
                    if((lop.get(j) instanceof Hexagon)&&i!=j){
                        Hexagon c=(Hexagon) lop.get(j);
                        if(a.isSame(c)){
                        lop.remove(lop.get(j));
                        j--;
                    }
                    }
                    
                }
            }
            
        }
    }
}
