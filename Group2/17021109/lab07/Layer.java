package Tuan06;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Layer {
	boolean visiable;
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}
	
	public void deleteAllTriangle() {
		int n = shapes.size();
		for(int i=0; i<n; i++) {
			if(shapes.get(i) instanceof Triangle) {
				shapes.remove(i);
				i--;
				n = shapes.size();
			}
		}
	}
	
	public void deleteAllCircle() {
		int n = shapes.size();
		for(int i=0; i<n; i++) {
			if(shapes.get(i) instanceof Circle) {
				shapes.remove(i);
				i--;
				n = shapes.size();
			}
		}
	}
	
	public void showAllShapes() {
		for(int i=0; i<shapes.size(); i++) {
			System.out.println(shapes.get(i).toString());
			System.out.println("------------------------");
		}
	}
	
	public boolean getVisiable() {
		return visiable;
	}
	public void setVisiable(boolean visiable) {
		this.visiable = visiable;
	}
}
