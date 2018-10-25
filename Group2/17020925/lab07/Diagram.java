package Lab07;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Diagram extends JPanel {
	ArrayList<Layer> diagram = new ArrayList<Layer>();
	public void drawAll(Graphics g) {
			for(Layer l : this.diagram) {
				if(l.visible) {
					for(Shape s : l.layer) {
						s.drawShape(g);
					}
				}
			}
	}
	public void sortShape() {
		if(this.diagram.size()<6) {
			for(int i=0; i<6-this.diagram.size(); i++) {
				Layer l = new Layer();
				this.diagram.add(l);
			}
		}
		for(int i=0; i<this.diagram.size(); i++) {
			Layer lr = this.diagram.get(i);
			for(int j=0; j<lr.layer.size(); j++) {
				if(lr.layer.get(j) instanceof Circle && i!=0) {
					this.diagram.get(0).layer.add(lr.layer.get(j));
					lr.layer.remove(j);
				}
				if(lr.layer.get(j) instanceof Triangle && i!=1) {
					this.diagram.get(1).layer.add(lr.layer.get(j));
					lr.layer.remove(j);
				}
				if(lr.layer.get(j) instanceof Rectangle && i!=2) {
					this.diagram.get(2).layer.add(lr.layer.get(j));
					lr.layer.remove(j);
				}
				if(lr.layer.get(j) instanceof Square && i!=3) {
					this.diagram.get(3).layer.add(lr.layer.get(j));
					lr.layer.remove(j);
				}
				if(lr.layer.get(j) instanceof Hexagon && i!=4) {
					this.diagram.get(4).layer.add(lr.layer.get(j));
					lr.layer.remove(j);
				}
			}
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawAll(g);
	}
}
