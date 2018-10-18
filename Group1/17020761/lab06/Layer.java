package lab06;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

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
	public void addLayer(Shape a) {
		listLayer.add(a);
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
}
