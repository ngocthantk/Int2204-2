package lab06;

import java.util.ArrayList;

public class Layer {
	private ArrayList<Shape> layer ;
	private boolean visible ;
	public Layer() {
		layer = new ArrayList<>();
		visible = true;
	}
	public Layer(ArrayList<Shape> layer,boolean t) {
		this.layer = layer;
		visible = t ;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public ArrayList<Shape> getLayer() {
		return layer;
	}
	public void setLayer(ArrayList<Shape> layer) {
		this.layer = layer;
	}
	public void deleteSameShap() {
		for (int j=0;j<layer.size();j++) {
			int i=j+1;
			while (i<layer.size()) {
				if (layer.get(j).sameShap(layer.get(i))) {
					layer.remove(i);
				}
				else {
					i++;
				}
			}
		}
	}
}
