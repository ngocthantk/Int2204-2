
package Shape;

import java.util. *;

public class Diagram {
    private ArrayList<Layer> di;
    ListIterator it;
    
    public Diagram(){
        di = new ArrayList<>();
        
    }
    public void addLay(Layer lay){
        di.add(lay);
    }
    public void run(){
        it = di.listIterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Layer){
                Layer lay = (Layer) obj;
                if(lay.getVisible()) lay.setVisible(true);//hien layer neu gia tri visible la true
                else lay.setVisible(false);//an layer neu gia tri la false
            }
        }
    }
    public ArrayList<Layer> getDiagram(){
        return di;
    }
    
    
}
