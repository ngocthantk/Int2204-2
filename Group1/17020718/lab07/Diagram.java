package lap07;

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
}