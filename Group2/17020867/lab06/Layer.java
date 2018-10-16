package lab06;

import java.util.ArrayList;

public class Layer {
	ArrayList<Shape> layer = new ArrayList<Shape>();
	public void addShape(String shape) {
		switch(shape) {
		case "circle":
			Shape s = new Circle();
			this.layer.add(s);
			break;
		case "triangle":
			Shape s1 = new Triangle();
			this.layer.add(s1);
			break;
		case "rectangle":
			Shape s2 = new Rectangle();
			this.layer.add(s2);
			break;
		default:
			break;
		}
	}
	
	public void deleteTriangle() {
		for (int i=0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Triangle) { 
				this.layer.remove(i);
				i--;
			}
		}
	}
	public void deleteCircle() {
		for (int i=0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Circle) {
				this.layer.remove(i);
				i--;
			}
		}
	}
}
