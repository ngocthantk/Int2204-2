
package lap6;
/**
 *
 * @author Admin sơ đồ 
*/
import java.util.ArrayList;
import java.util.List;

public class Diagram {
    protected List<Layer> listLayer;

    //constructor
    public Diagram() {
        this.listLayer = new ArrayList<>();
    }

    //method
    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle() {
        for (int i = 0; i < listLayer.size(); i++) {
            this.listLayer.get(i).removeAllCircle();
        }
    }
    public void showAllLayer(){
        this.listLayer.forEach((layer) -> {
            layer.showAllShapes();
        });
    }
}