/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util. *;

/**
 *
 * @author Win10
 */
public class Diagram {
    private ArrayList<LayerNew> di;
    ListIterator it;
    
    public Diagram(){
        di = new ArrayList<>();
        
    }
    public void addLay(LayerNew lay){
        di.add(lay);
    }
    public void run(){
        it = di.listIterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof LayerNew){
                LayerNew lay = (LayerNew) obj;
                if(lay.getVisible()) lay.setVisible(true);//hien layer neu gia tri visible la true
                else lay.setVisible(false);//an layer neu gia tri la false
            }
        }
    }
    public ArrayList<LayerNew> getDiagram(){
        return di;
    }
    
    
}
