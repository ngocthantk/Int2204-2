package lab7;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Diagram extends JPanel {
	ArrayList<Layer> layers = new ArrayList<Layer>();
	
	//sap xep hinh cung loai vao 1 layer
	public void sortShape() {
		if(this.layers.size()<6) {
			for(int i=0; i<6-this.layers.size(); i++) {
				Layer l = new Layer();
				this.layers.add(l);
			}
		}
		for(int i = 0; i < this.layers.size(); i++) {
			Layer l = this.layers.get(i);
			
			for(int j = 0; j < l.shapes.size(); j++) {
				if(l.shapes.get(j) instanceof Circle ) {
					this.layers.get(0).shapes.add(l.shapes.get(j));
					l.shapes.remove(j);
				}
				if(l.shapes.get(j) instanceof Triangle ) {
					this.layers.get(1).shapes.add(l.shapes.get(j));
					l.shapes.remove(j);
				}
				if(l.shapes.get(j) instanceof Retangle) {
					this.layers.get(2).shapes.add(l.shapes.get(j));
					l.shapes.remove(j);
				}
				if(l.shapes.get(j) instanceof Square ) {
					this.layers.get(3).shapes.add(l.shapes.get(j));
					l.shapes.remove(j);
				}
				if(l.shapes.get(j) instanceof Hexagon ) {
					this.layers.get(4).shapes.add(l.shapes.get(j));
					l.shapes.remove(j);
				}
			}
		}
	}
}
