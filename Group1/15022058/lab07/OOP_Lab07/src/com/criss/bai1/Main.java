package com.criss.bai1;

public class Main {
	public static void main(String[] args) {
		Layer a = new Layer();
		// a.shape.add(new Square());
		// a.shape.add(new Square());
		// a.deteleSameShape();
		// System.out.println(a.shape.size());
		a.shape.add(new Circle());
		a.shape.add(new Circle());
		a.shape.add(new Hexagon());
		a.shape.add(new Hexagon());

		Diagram b = new Diagram();
		b.layer.add(a);
		b.changeSameShape();
		System.out.println(b.layer.get(1).shape.size());

	}
}
