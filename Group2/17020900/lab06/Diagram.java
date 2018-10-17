package minh.dim;

import java.util.ArrayList;

public class Diagram {
	public void deleteAllCircle(ArrayList<Shape> arrShape) {
		int n = arrShape.size();
		for(int i = 0; i<n; i++) {
			if(arrShape.get(i) instanceof Circle) {
				arrShape.remove(i);
				
			}
		}
	}
}
