/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admincxq
 */
import java.util.ArrayList;
public class Layer {
    ArrayList<Shape>shape=new ArrayList<Shape>();
    public ArrayList<Shape> getShape(){
        return shape;
    }
    public void them(Shape s){
        shape.add(s);
    }
    public void xoaTriangle() {
	int n = shape.size();
	for(int i=0; i<n; i++) {
		if(shape.get(i) instanceof Triangle) {
			shape.remove(i);
			i--;
			n = shape.size();
		}
	}
    }
    public void xoaAllCircle() {
	int n = shape.size();
	for(int i=0; i<n; i++) {
		if(shape.get(i) instanceof Circle) {
			shape.remove(i);
			i--;
			n = shape.size();
		}
	}
    }
}
