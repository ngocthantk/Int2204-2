package minh.dim;

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
		public void xetShape() {
			if(this.diagram.size()<6) {
				for(int i=0; i<6-this.diagram.size(); i++) {
					Layer l = new Layer();
					this.diagram.add(l);
				}
			}
			for(int i=0; i<this.diagram.size(); i++) {
				Layer layer = this.diagram.get(i);
				for(int j=0; j<layer.layer.size(); j++) {
					if(layer.layer.get(j) instanceof Circle && i!=0) {
						this.diagram.get(0).layer.add(layer.layer.get(j));
						layer.layer.remove(j);
					}
					if(layer.layer.get(j) instanceof Triangle && i!=1) {
						this.diagram.get(1).layer.add(layer.layer.get(j));
						layer.layer.remove(j);
					}
					if(layer.layer.get(j) instanceof Retangle && i!=2) {
						this.diagram.get(2).layer.add(layer.layer.get(j));
						layer.layer.remove(j);
					}
					if(layer.layer.get(j) instanceof Square && i!=3) {
						this.diagram.get(3).layer.add(layer.layer.get(j));
						layer.layer.remove(j);
					}
					if(layer.layer.get(j) instanceof Hexagon && i != 4) {
						this.diagram.get(4).layer.add(layer.layer.get(j));
						layer.layer.remove(j);
					}
				}
			}
		}
		protected void input(Graphics graphics) {
				super.paintComponent(graphics);
				drawAll(graphics);
		}
}
