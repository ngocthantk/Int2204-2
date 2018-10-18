package lab06;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layers = new ArrayList<>();
	public void delete() {
		for (int i = 0 ; i< layers.size();i++) {
			layers.get(i).deleteCircle();
			layers.get(i).deleteTriangle();
		}
	}
}
