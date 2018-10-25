package lab7;

import java.util.ArrayList;

public class Layer {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	boolean visible = true;

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public void deleteTriangle() {
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) instanceof Triangle) {
				shapes.remove(i);
				i--;
			}
		}

	}

	public void deleteCircle() {
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) instanceof Circle) {
				shapes.remove(i);
				i--;
			}
		}

	}
	//xoa hinh giong nhau
	public void deleteSameShape() {
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) instanceof Circle) {
				for (int j = i+1; j < shapes.size(); j++) {
					if (shapes.get(j) instanceof Circle) {
						Circle c1 = (Circle) shapes.get(i);
						Circle c2 = (Circle) shapes.get(j);
						if(c1.isSame(c2)) {
							shapes.remove(j);
						}
					}
				}
			}
			if (shapes.get(i) instanceof Retangle) {
				for (int j = i+1; j < shapes.size(); j++) {
					if (shapes.get(j) instanceof Retangle) {
						Retangle r1 = (Retangle) shapes.get(i);
						Retangle r2 = (Retangle) shapes.get(j);
						if (r1.isSame(r2)) {
							shapes.remove(j);
						}
					}
				}
			}
			if (shapes.get(i) instanceof Square) {
				for (int j = i+1; j < shapes.size(); j++) {
					if (shapes.get(j) instanceof Square) {
						Square c1 = (Square) shapes.get(i);
						Square c2 = (Square) shapes.get(j);
						if (c1.isSame(c2)) {
							shapes.remove(j);
						}
					}
				}
			}
			if (shapes.get(i) instanceof Triangle) {
				for (int j = i+1; j < shapes.size(); j++) {
					if (shapes.get(j) instanceof Triangle) {
						Triangle c1 = (Triangle) shapes.get(i);
						Triangle c2 = (Triangle) shapes.get(j);
						if (c1.isSame(c2)) {
							shapes.remove(j);
						}
					}
				}
			}
		}
	}
}
