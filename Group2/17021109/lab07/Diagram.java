package Tuan06;

import java.awt.Graphics;
import java.util.ArrayList;

public class Diagram extends Layer{
	ArrayList<Layer> diagram = new ArrayList<Layer>();
	
	public void addLayer(Layer l) {
		diagram.add(l);
	}
	public void delCircle() {
		for(Layer l: this.diagram) {
			l.deleteAllCircle();
		}
	}
	public void showAllLayers() {
		for(int i=0; i<diagram.size(); i++) {
			System.out.println("======== LAYER " + (i+1) + "========");
			diagram.get(i).showAllShapes();
		}
	}
}
