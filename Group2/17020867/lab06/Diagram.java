package lab06;

import java.util.ArrayList;

public class Diagram {
	ArrayList<Layer> diagram = new ArrayList<Layer>();
	public void addDiagram(String shape, int index) {
		if(this.diagram.size() <= index) {
			Layer l = new Layer();
			this.diagram.add(l);
		}
		Layer find = this.diagram.get(index);
		find.addShape(shape);
	}
	public void delCircle() {
		for(Layer l : this.diagram) {
			l.deleteCircle();
		}
	}
}
