package com.criss.bai1;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layerList;

	// constructer
	public Diagram() {
		layerList = new ArrayList<Layer>();
	}

	// add a layer to diagram
	public void addLayer(Layer layer) {
		layerList.add(layer);
	}

	// get a layer of diagram
	public Layer getLayer(int i) {
		return layerList.get(i);
	}

	// delete all circle in diagram
	public void deleteCircle() {
		for (int i = 0; i < layerList.size(); i++) {
			this.layerList.get(i).deleteCircle();
		}
	}
}
