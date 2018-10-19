
package lab6;


import java.util.ArrayList;

public class Layer {
	
	public void deleteAllTriangle(ArrayList<Shape> shapes) {
		int n = shapes.size();
		for(int i=0; i<n; i++) {
			if(shapes.get(i) instanceof Triangle) {
				shapes.remove(i);
				i--;
				n = shapes.size();
			}
		}
	}
	
	
	
}

