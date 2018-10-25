//Create frame
//
package main.execute;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.image.VolatileImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Diagram extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel canvas = new JPanel();
	private ArrayList <Layer> layers = new ArrayList<Layer> ();
	private int canvasWidth =800, canvasHeight=600;
	private long prev = System.currentTimeMillis();
	public Diagram() {
		init();
	}
	
	public void init() {
		
		add(canvas);
		canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		renderImage();
	}
	
	private void renderImage() {
		Thread  thread = new Thread() {
			GraphicsConfiguration gc= canvas.getGraphicsConfiguration();
			VolatileImage vi = gc.createCompatibleVolatileImage(canvasWidth, canvasHeight);
			public void run() {
				while (true) {
					if (vi.validate(gc) == VolatileImage.IMAGE_INCOMPATIBLE) {
						vi = gc.createCompatibleVolatileImage(canvasWidth, canvasHeight);
					}
					
					Graphics g= vi.getGraphics();
					
					g.setColor(getBackground());
					g.fillRect(0, 0, canvasWidth, canvasHeight);
					
					for (Layer layer : layers) {
						if (layer.isVisible()) layer.drawShape(g);
					}
					
					g = canvas.getGraphics();
					g.drawImage(vi, 0, 0, canvasWidth, canvasHeight, null);
					
					g.dispose();
				}
			}
		};
		thread.setName("Looping");
		thread.start();
	}
	
	public void reOrganized() {
		Layer square = new Layer();
		Layer rect = new Layer();
		Layer circle = new Layer();
		Layer hexagon = new Layer();
		Layer tri = new Layer();
		for (Layer layer: layers) {
			for (int i=0 ; i<layer.getElementsSize(); i++) {
				if (layer.getShape(i) instanceof Square) 
					square.addShape(layer.getShape(i));
				else if (layer.getShape(i) instanceof Rectangle) 
					rect.addShape(layer.getShape(i));
				if (layer.getShape(i) instanceof Circle) 
					circle.addShape(layer.getShape(i));
				if (layer.getShape(i) instanceof Hexagon) 
					hexagon.addShape(layer.getShape(i));
				if (layer.getShape(i) instanceof Triangle) 
					tri.addShape(layer.getShape(i));
			}
		}
		layers.clear();
		if (square.getElementsSize()!=0) layers.add(square);
		if (rect.getElementsSize()!=0) layers.add(rect);
		if (circle.getElementsSize()!=0) layers.add(circle);
		if (hexagon.getElementsSize()!=0) layers.add(hexagon);
		if (tri.getElementsSize()!=0) layers.add(tri);
	}
	
	public void addLayer(Layer layer) {
		layers.add(layer);
	}
	public Layer getLayer(int index) {
		return layers.get(index);
	}
	
	public void removeLayer(int index) {
		layers.remove(index);
	}
	
	public void clearAllCircle() {
		for (Layer layer: layers) {
			layer.clearAllCircle();
		}
	}
	
	public void clearAllRect() {
		for (Layer layer: layers) {
			layer.clearAllRect();
		}
	}
	
	public void clearAllSquare() {
		for (Layer layer: layers) {
			layer.clearAllSquare();
		}
	}
	
	public void clearAllTriangle() {
		for (Layer layer: layers) {
			layer.clearAllTriangle();
		}
	}
	
	public void clearAllHexagon() {
		for (Layer layer: layers) {
			layer.clearAllHexagon();
		}
	}
}
