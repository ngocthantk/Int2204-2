package tuan6;
public class Layer {
	private static final int MAX_SHAPE = 100;
	private Shape[] shapes;
	private int countShape;
	
	public Layer() {
		shapes = new Shape[MAX_SHAPE];
		countShape = 0;
	}

	public void addShape(Shape shape) {
		if (countShape >= MAX_SHAPE) {
			return;
		}
		shapes[countShape++] = shape;
	}

	private void deleteShape(int index) {
		if (countShape == 0) {
			return;
		}
		for (int i=index; i<countShape; i++) {
			shapes[i] = shapes[i+1];
		}
		countShape--;
	}
	
	public void deleteShapesByType() {
		for (int i=countShape-1; i>=0; i--) {
			if ((shapes[i] instanceof Triangle)) {
                            deleteShape(i);
                    }
		}
	}
        public void deleteShapesByType1() {
		for (int i=countShape-1; i>=0; i--) {
			if ((shapes[i] instanceof Circle)) {
                            deleteShape(i);
                    }
		}
	}

	public void showInfo() {
		for (int i=0; i<countShape; i++) {
			shapes[i].showInfo();
		}
	}
}
