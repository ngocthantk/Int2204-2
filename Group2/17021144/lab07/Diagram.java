package lap07;
import java.util.ArrayList;


public class Diagram {
     ArrayList<Layer> layer;
     
     public Diagram() {
        layer = new ArrayList<>();
    }
     public void addLayer(Layer lay) {
        this.layer.add(lay);
    }
     public void printLayer() {
        for (int i = 0; i < layer.size(); ++i) {
            layer.get(i).showAllShapes();
        }
    }
     public void delTriangle() {
        for (int i = 0; i < layer.size(); ++i) {
            layer.get(i).delTriangle();
        }
    }
     public void delCircle() {
        for (int i = 0; i < layer.size(); ++i) {
            layer.get(i).delCircle();
        }
    }
    
 }