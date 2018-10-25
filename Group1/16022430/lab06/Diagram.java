package tuan6;
public class Diagram {
	private static final int MAX_LAYER = 100;
	private Layer[] layers;
	private int countLayer;
	
	public Diagram() {
		layers = new Layer[MAX_LAYER];
		countLayer = 0;
	}
	
	public void addLayer(Layer layer) {
		if (countLayer >= MAX_LAYER) {
			return;
		}
		layers[countLayer++] = layer;
	}
	
	public void deleteShapesByType() {
		for(int i=0; i<countLayer; i++) {
			layers[i].deleteShapesByType1();
		}
	}
	
	public void showInfo() {
		for(int i=0; i<countLayer; i++) {
			System.out.println("---------------");
			System.out.println("Layer " + i + ":");
			layers[i].showInfo();
		}
	}
}
