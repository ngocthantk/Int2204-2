package lab06;

import java.util.ArrayList;

public class Diagram {
	ArrayList<Layer> layers = new ArrayList<Layer>();
	
	public void addLayer(Layer l) {
		layers.add(l);
	}
	
	public void deleteAllCircle() {
		for(int i=0; i<layers.size(); i++) {
			layers.get(i).deleteAllCircle();
		}
	}
	
	public void showAllLayers() {
		for(int i=0; i<layers.size(); i++) {
			System.out.println("======== LAYER " + (i+1) + "========");
			layers.get(i).showAllShapes();
		}
	}
}
