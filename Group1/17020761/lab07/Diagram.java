package lab06;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> listDiagram= new ArrayList<Layer>();
	public Diagram () {
		
	}
	public void addDiagram(Layer a) {
		listDiagram.add(a);
	}
	public void removerCircle() {
		for(int i=0;i<listDiagram.size();i++) {
			listDiagram.get(i).removerCircle();
		}
	}
	public void reorder() {
		Layer square = new Layer();
		Layer rectangle = new Layer();
		Layer triangle = new Layer();
		Layer circle = new Layer();
		Layer hexagon = new Layer();
		
		for(int i=0;i<listDiagram.size();i++) {
			for(int j=0;j<listDiagram.get(i).sizeLayer();j++) {
				if(listDiagram.get(i).getShape(j) instanceof Rectangle) {
					if(listDiagram.get(i).getShape(j) instanceof Square) {
						square.addLayer(listDiagram.get(i).getShape(j));
					} else {
						rectangle.addLayer(listDiagram.get(i).getShape(j));
					}
				} 
				if(listDiagram.get(i).getShape(j) instanceof Circle) {
					circle.addLayer(listDiagram.get(i).getShape(j));
				}
				if(listDiagram.get(i).getShape(j) instanceof Triangle) {
					triangle.addLayer(listDiagram.get(i).getShape(j));
				}
				if(listDiagram.get(i).getShape(j) instanceof Hexagon) {
					hexagon.addLayer(listDiagram.get(i).getShape(j));
				}
			}
			
		}
		
	}
}
