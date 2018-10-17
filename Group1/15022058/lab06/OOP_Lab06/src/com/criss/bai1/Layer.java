package com.criss.bai1;

import java.util.*;

public class Layer {
	private ArrayList<Shape> shapeList;

	// constructer
	Layer() {
		shapeList = new ArrayList<Shape>();
	}

	// delete all circle in layer
	public void deleteCircle() {
		int i = 0;
		while (i < shapeList.size()) {
			Shape tmp = shapeList.get(i);
			if (tmp instanceof Circle)
				shapeList.remove(i);
			else
				i++;
		}
	}

	// delete all triangle in layer
	public void deleteTriangle() {
		int i = 0;
		while (i < shapeList.size()) {
			Shape tmp = shapeList.get(i);
			if (tmp instanceof Triangle)
				shapeList.remove(i);
			else
				i++;
		}
	}

	// check if there is circle left
	public boolean isThereCircleLeft() {
		int i = 0;
		while (i < shapeList.size()) {
			Shape tmp = shapeList.get(i);
			if (tmp instanceof Circle)
				return true;
			else
				i++;
		}
		return false;
	}

	// check if there is triangle left
	public boolean isThereTriangleLeft() {
		int i = 0;
		while (i < shapeList.size()) {
			Shape tmp = shapeList.get(i);
			if (tmp instanceof Triangle)
				return true;
			else
				i++;
		}
		return false;
	}

	// check if there is rectangle left
	public boolean isThereRectangleLeft() {
		int i = 0;
		while (i < shapeList.size()) {
			Shape tmp = shapeList.get(i);
			if (tmp instanceof Rectangle)
				return true;
			else
				i++;
		}
		return false;
	}

	// check if there is square left
	public boolean isThereSquareLeft() {
		int i = 0;
		while (i < shapeList.size()) {
			Shape tmp = shapeList.get(i);
			if (tmp instanceof Square)
				return true;
			else
				i++;
		}
		return false;
	}

	// add a shape to layer
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
}
