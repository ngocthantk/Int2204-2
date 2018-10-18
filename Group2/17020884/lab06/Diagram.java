//Create frame
//
package main.execute;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.VolatileImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Diagram{
	
	private JFrame frame = new JFrame();
	private JPanel canvas = new JPanel();
	private ArrayList <Layer> layers = new ArrayList<Layer> ();
	private int canvasWidth =400, canvasHeight=200;
	private int gameWidth=400, gameHeight=200;
	
	private void resizeCanvas() {

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		gameWidth =screen.width;
		gameHeight=screen.height;
	}
	
	private void zoomIn() {
		resizeCanvas();
		GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		frame.setUndecorated(true);
		device.setFullScreenWindow(frame);
	}
	
	public Diagram() {
		init();
	}
	
	public void init() {
		
		frame.add(canvas);
		zoomIn();
		frame.pack();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
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
					
					g.setColor(Color.GRAY);
					g.fillRect(0, 0, canvasWidth, canvasHeight);
					
					for (Layer layer : layers) {
						layer.drawShape(g);
					}
					
					g = canvas.getGraphics();
					g.drawImage(vi, 0, 0, gameWidth, gameHeight, null);
					
					g.dispose();
				}
			}
		};
		thread.setName("Looping");
		thread.start();
	}
		
	public Image loadImage(String path) {
		ImageIcon ii =  new ImageIcon(path);
		Image image = ii.getImage();
		return image;
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
	
}
