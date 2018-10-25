package lab6;

import java.util.ArrayList;

public class Layer {
	public static ArrayList<Shape> layer = new ArrayList<Shape>();
	
	public void addShape(String shape) {
		switch(shape) {
		case "retangle": {
			Shape rectangle = new Rectangle();
			this.layer.add(rectangle);
			break;
		}
		case "square": {
			Shape square = new Square();
			this.layer.add(square);
			break;
		}
		case "triangle": {
			Shape triangle = new Triangle();
			this.layer.add(triangle);
			break;
		}
		case "circle": {
			Shape circle = new Circle();
			this.layer.add(circle);
			break;
		}
		default:
			break;
		}
	}
	
	public void deleteTriangle() {
		for (int i = 0; i < this.layer.size(); i++){
			if (this.layer.get(i) instanceof Triangle) { 
				this.layer.remove(i);
				i--;
			}
		}
	}
	
	public void deleteCircle() {
		for (int i = 0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Circle) {
				this.layer.remove(i);
				i--;
			}
		}
	}
}
