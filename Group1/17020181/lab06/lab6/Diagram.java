/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Ha
 */
public class Diagram {
   ArrayList<Layer> diagram = new ArrayList<Layer>();
	public void AddDiagram(String shape, int index) {
		if(this.diagram.size() <= index) {
			Layer l = new Layer();
			this.diagram.add(l);
		}
		Layer browse = this.diagram.get(index);
		browse.addShape(shape);
	}
	public void DeleteCircle() {
		for(Layer l : this.diagram) {
			l.deleteCircle();
		}
	}

    void deleteCircle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
