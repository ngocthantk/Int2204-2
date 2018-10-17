package lab06;

import java.util.ArrayList;

public class Layer {
	private ArrayList<Shape> layer = new ArrayList<>();
	public Layer(ArrayList<Shape> layer) {
		this.layer = layer;
	}

	public void deleteTriangle() {
		for (int i=0;i<layer.size();i++) {
			if (layer.get(i) instanceof Triangle) {
				layer.remove(i);
				i--;
			}
		}
	}
	public void deleteCircle() {
		for (int i=0;i<layer.size();i++) {
			if (layer.get(i) instanceof Circle) {
				layer.remove(i);
				i--;
			}
		}
	}
	public void print() {
		for (int i=0;i<layer.size();i++) {
			System.out.println(layer.get(i).toString());
		}
	}
}
