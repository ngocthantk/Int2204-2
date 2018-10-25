package lap07;
import java.util.ArrayList;
import java.util.Vector;
 public class Layer {
    
     protected boolean visible;
     protected ArrayList<Shape> shape;
     
     public Layer() {
        shape = new ArrayList<>();
        visible = true;
    }
     public void addShape(Shape shape) {
        this.shape.add(shape);
    }
     public void setVisible(boolean visible) {
        this.visible = visible;
    }
     public boolean isVisible() {
        return visible;
    }
     public void delTriangle() {
        for (int i = 0; i < shape.size(); i++) {
            if (shape.get(i) instanceof Triangle) {
                shape.remove(i);
                i--;
            }
        }
    }
     public void delCircle() {
        for (int i = 0; i < shape.size(); ++i) {
            if (shape.get(i) instanceof Circle) {
                shape.remove(i);
                i--;
            }
        }
    }
    
     public void showAllShapes() {
        System.out.println();
        this.shape.forEach((shape) -> {
            System.out.println(shape);
        });
    }
 
 }