package Diagram;

import java.util.ArrayList;

public class Diagram {
	ArrayList<Layer> diagram = new ArrayList<Layer>();
	
	public void deleteCircle() {
		for(Layer layer : this.diagram) {
			layer.deleteCircle();
		}
	}
}
