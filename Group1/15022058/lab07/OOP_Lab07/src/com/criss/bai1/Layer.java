package com.criss.bai1;

import java.util.ArrayList;

public class Layer {
	ArrayList<Shape> shape = new ArrayList<Shape>();
	private boolean visible;

// xoa hinh chu nhat
	public int deteleteTriange() {
		int result = 0;

		System.out.println();
		for (int i = 0; i < this.shape.size(); i++) {
			if (shape.get(i) instanceof Triangle) {
				shape.remove(i);
				result++;

				i--;
			}

		}
		return result;
	}

// xoa hinh tron
	public int deteleteCircle() {
		int result = 0;

		for (int i = 0; i < this.shape.size(); i++) {
			if (shape.get(i) instanceof Circle) {
				shape.remove(i);
				result++;
				i--;

			}
		}
		return result;
	}

	public void deteleSameShape() {
		for (int i = 0; i < this.shape.size(); i++) {

			if (this.shape.get(i) instanceof Square) {
				Square a = (Square) this.shape.get(i);
				for (int j = 0; j < this.shape.size(); j++) {
					if (this.shape.get(j) instanceof Square && j != i) {
						Square b = (Square) this.shape.get(j);
						System.out.println(a.isSameSquare(b));
						if (a.isSameSquare(b)) {
							this.shape.remove(j);
							j--;
						}
						;
					}

				}
			}

			if (this.shape.get(i) instanceof Hexagon) {
				Hexagon a = (Hexagon) this.shape.get(i);
				for (int j = 0; j < this.shape.size(); j++) {
					if (this.shape.get(j) instanceof Hexagon && j != i) {
						Hexagon b = (Hexagon) this.shape.get(j);

						if (a.isSameHexagon(b)) {
							this.shape.remove(j);
							j--;
						}
						;
					}

				}
			} else if (this.shape.get(i) instanceof Circle) {
				Circle a = (Circle) this.shape.get(i);
				for (int j = 0; j < this.shape.size(); j++) {
					if (this.shape.get(j) instanceof Circle && j != i) {
						Circle b = (Circle) this.shape.get(j);
						if (a.isSameCircle(a)) {
							this.shape.remove(j);
							j--;
						}
						;
					}
				}
			}
			if (this.shape.get(i) instanceof Triangle) {
				Triangle a = (Triangle) this.shape.get(i);
				for (int j = 0; j < this.shape.size(); j++) {
					if (this.shape.get(j) instanceof Triangle && j != i) {
						Triangle b = (Triangle) this.shape.get(j);

						if (a.isSameTriangle(b)) {
							this.shape.remove(j);
							j--;
						}
						;
					}
				}
			} else if (this.shape.get(i) instanceof Rectangle) {
				Rectangle a = (Rectangle) this.shape.get(i);
				for (int j = 0; j < this.shape.size(); j++) {
					if (this.shape.get(j) instanceof Rectangle && j != i) {
						Rectangle b = (Rectangle) this.shape.get(j);

						if (a.isSameRectangle(b)) {
							this.shape.remove(j);
							j--;
						}
						;
					}
				}

			}
		}

	}

// get thuoc tinh  Visibl
	public boolean isVisible() {
		return visible;
	}

//set thuoc tinh Visiblle
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
