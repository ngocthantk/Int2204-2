package lab06;

import java.util.ArrayList;

public class Layer {
	private ArrayList<Shape> listLayer= new ArrayList<Shape>();
	private boolean visible;
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Layer() {
		
	}
	public int sizeLayer() {
		return listLayer.size();
	}
	public void addLayer(Shape a) {
		listLayer.add(a);
	}
	
	public void removeShape(int shapeNo) {
		listLayer.remove(shapeNo);
	}
	
	public Shape getShape(int shapeNo) {
		return listLayer.get(shapeNo);
	}
	
	public void removeTriangle() {
		for(int i=0;i<listLayer.size();i++) {
			if(listLayer.get(i)  instanceof Triangle) {
				listLayer.remove(i);
				i--;
			}
		}
	}
	public void removerCircle() {
		for(int i=0;i<listLayer.size();i++) {
			if(listLayer.get(i)  instanceof Circle) {
				listLayer.remove(i);
				i--;
			}
		}
	}
	
	public void removeSameShape() {
		for(int i=0;i<listLayer.size();i++) {
			for(int j=i;j<listLayer.size();j++) {
				if(listLayer.get(i).equals(listLayer.get(j))) {
					listLayer.remove(j);
					j--;
				}
			}
		}
	}
	
}
