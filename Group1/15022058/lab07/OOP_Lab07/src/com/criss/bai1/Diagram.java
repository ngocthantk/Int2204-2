package com.criss.bai1;

import java.util.ArrayList;

public class Diagram {

	public ArrayList<Layer> layer = new ArrayList<Layer>();

	// xoa hinh tron trong layer
	public int deleteCricle() {

		int result = 0;
		for (int i = 0; i < layer.size(); i++) {
			result = result + layer.get(i).deteleteCircle();
		}
		return result;
	}

	public void changeSameShape() {
		ArrayList<Layer> layer2 = new ArrayList<Layer>();
		for (int i = 0; i < layer.size(); i++) {
			for (int j = 0; j < layer.get(i).shape.size(); j++) {

				if (layer.get(i).shape.get(j) instanceof Circle) {
					int k = 0;

					for (int g = 0; g < layer2.size(); g++) {
						if (layer2.get(i).shape.get(0) instanceof Circle) {
							layer2.get(i).shape.add(layer.get(i).shape.get(j));
							k++;
						}
					}

					if (k == 0) {
						layer2.add(new Layer());
						if (layer2.size() > 0)
							layer2.get(layer2.size() - 1).shape.add(layer.get(i).shape.get(j));
						else
							layer2.get(0).shape.add(layer.get(i).shape.get(j));
					}

				}

				if (layer.get(i).shape.get(j) instanceof Hexagon) {
					int k = 0;

					for (int g = 0; g < layer2.size(); g++) {
						if (layer2.get(i).shape.get(0) instanceof Hexagon) {
							layer2.get(i).shape.add(layer.get(i).shape.get(j));
							k++;
						}
					}

					if (k == 0) {
						layer2.add(new Layer());

						layer2.get(layer2.size() - 1).shape.add(layer.get(i).shape.get(j));
					}
				}
			}
			layer.clear();
			System.out.println(layer2.size());
			for (int o = 0; o < layer2.size(); o++) {
				layer.add(layer2.get(o));

			}
		}

	}

	public void deteleSamShape() {
		for (int i = 0; i < this.layer.size(); i++)
			this.layer.get(i).deteleSameShape();

	}
}
