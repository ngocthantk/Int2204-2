/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;


import java.util.ArrayList;
public class Diagram {
    ArrayList<Layer> diagram = new ArrayList<>();
	
	public void deleteCircle() {
            this.diagram.forEach((layer) -> {
                layer.deleteCircle();
        });
	}
}
