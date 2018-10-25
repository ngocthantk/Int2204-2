package Graphic;
import java.util.ArrayList;
public class Layer extends Diagram {
    ArrayList<Shape> lr = new ArrayList<Shape>();
    protected boolean visible;
    public int deleteTriangle() {
        for (int i = 0; i < lr.size(); i++) {
            if (lr.get(i) instanceof Triangle) {
                lr.remove(i);
                i--;
            }
        }
        return lr.size();
    }
    public int deleteCircle() {
        for (int i = 0; i < dg.size(); i++) {
            for (int j = 0; j < dg.get(i).lr.size(); j++) {
                if (dg.get(i).lr.get(j) instanceof Circle) {
                    dg.get(i).lr.remove(j);
                    j--;
                }

            }
        }
        return dg.size();
    }
    public void deletesame(){
        for (int i = 0; i < lr.size()-1; i++) {
            for (int j = i+1; j < lr.size(); j++){
                if(lr.get(i)==lr.get(j)){
                    lr.remove(j);
                    j--;
                }
            }
        }
    }
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
