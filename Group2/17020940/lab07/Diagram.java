package lab06;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Diagram extends JPanel{
	private ArrayList<Layer> layers = new ArrayList<>();
	
	public ArrayList<Layer> getLayers() {
		return layers;
	}

	public void setLayers(ArrayList<Layer> layers) {
		this.layers = layers;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (Layer l : layers) {
			if (l.isVisible()) {
				for (Shape s : l.getLayer()) {
					if (s instanceof Circle && ! (s instanceof Hexagon)) {
						g2.draw(new Ellipse2D.Double(((Circle) s).getP().getX()-((Circle) s).getRadius(), ((Circle) s).getP().getY()-((Circle) s).getRadius(),((Circle) s).getRadius()*2,((Circle) s).getRadius()*2));
					}
					if (s instanceof Rectangle && !(s instanceof Square)) {
						g2.draw(new Rectangle2D.Double(((Rectangle) s).getP().getX(), ((Rectangle) s).getP().getY(), ((Rectangle) s).getW(), ((Rectangle) s).getH()));
					}
					if (s instanceof Square ) {
						g2.draw(new Rectangle2D.Double(((Square) s).getP().getX(), ((Square) s).getP().getY(), ((Square) s).getW(), ((Square) s).getH()));
					}
					if (s instanceof Triangle) {
						if (((Triangle) s).isTriangle()) {
							g2.draw(new Line2D.Double(((Triangle) s).getA(), ((Triangle) s).getB()));
							g2.draw(new Line2D.Double(((Triangle) s).getB(), ((Triangle) s).getC()));
							g2.draw(new Line2D.Double(((Triangle) s).getC(), ((Triangle) s).getA()));
						}
					}
					if (s instanceof Hexagon) {
						g2.draw(new Line2D.Double(((Hexagon) s).getP1(), ((Hexagon) s).getP2()));
						g2.draw(new Line2D.Double(((Hexagon) s).getP2(), ((Hexagon) s).getP3()));
						g2.draw(new Line2D.Double(((Hexagon) s).getP3(), ((Hexagon) s).getP4()));
						g2.draw(new Line2D.Double(((Hexagon) s).getP4(), ((Hexagon) s).getP5()));
						g2.draw(new Line2D.Double(((Hexagon) s).getP5(), ((Hexagon) s).getP6()));
						g2.draw(new Line2D.Double(((Hexagon) s).getP6(), ((Hexagon) s).getP1()));
					}
				}
			}
		}
	}
	public void move() {
		Layer circle = new Layer();
		Layer rectangle = new Layer();
		Layer square = new Layer();
		Layer triangle = new Layer();
		Layer hexagon = new Layer();
		for (int i=0;i<layers.size();i++) {
			for (int j=0;j<layers.get(i).getLayer().size();j++) {
				if((layers.get(i).getLayer().get(j) instanceof Circle) &&!(layers.get(i).getLayer().get(j) instanceof Hexagon)) {
						circle.getLayer().add(layers.get(i).getLayer().get(j));
				}
				if(layers.get(i).getLayer().get(j) instanceof Rectangle &&!(layers.get(i).getLayer().get(j) instanceof Square)) {
					rectangle.getLayer().add(layers.get(i).getLayer().get(j));
				}
				if(layers.get(i).getLayer().get(j) instanceof Square ) {
					square.getLayer().add(layers.get(i).getLayer().get(j));
				}
				if(layers.get(i).getLayer().get(j) instanceof Hexagon) {
					hexagon.getLayer().add(layers.get(i).getLayer().get(j));
				}
				if(layers.get(i).getLayer().get(j) instanceof Triangle) {
					triangle.getLayer().add(layers.get(i).getLayer().get(j));
				}
			}
		}
		layers.clear();
		layers.add(circle);
		layers.add(rectangle);
		layers.add(square);
		layers.add(hexagon);
		layers.add(triangle);
	}
}
