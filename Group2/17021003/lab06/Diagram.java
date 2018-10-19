/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author CCNE
 */
import java.util.ArrayList;

public class Diagram {
	
	
	public void deleteAllCircle(ArrayList<Shape> shapes) {
		int n = shapes.size();
		for(int i=0; i<n; i++) {
			if(shapes.get(i) instanceof Circle) {
				shapes.remove(i);
				i--;
				n = shapes.size();
			}
		}
	}
	
	
}
