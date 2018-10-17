package minh.dim;

import java.util.ArrayList;

public class Layer {
	
	public void deleteAllTriangle(ArrayList<Shape> arrShape) {
		int n = arrShape.size();
		for(int i = 0; i<n; i++) {
			if(arrShape.get(i) instanceof Triangle) {
				arrShape.remove(i);
				
			}
		}
	}
}
