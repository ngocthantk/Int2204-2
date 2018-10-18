package lab6;

import java.util.ArrayList;

public class Layer {
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
			System.out.println();
			System.out.println();
		}
	}
}
