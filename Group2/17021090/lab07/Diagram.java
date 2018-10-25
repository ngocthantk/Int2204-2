package lab06;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layers = new ArrayList<>();
	
	public void add(Layer l)
	{
		layers.add(l);
	}
	
	public Layer get(int x)
	{
		return layers.get(x);
	}
	
	public void remove(int x)
	{
		layers.remove(x);
	}
	
	public void deleteAllCircle()
	{
		for (Layer l : layers)
		{
			l.deleteCircle();
		}
	}
	
	public void print()
	{
		for (Layer l : layers)
			l.print();
	}
	
	public void sort()
	{
		Layer layer = new Layer();
		for (Layer l : layers)
		{
			for (Shape s : l.getShapes())
				layer.add(s);
		}
		ArrayList<Layer> la = new ArrayList<>();
		for (int i = 0;i<layers.size();i++)
		{
			Layer l1 = new Layer();
			la.add(l1);
		}
		layers = la;
		for (Shape s : layer.getShapes())
		{
			if (s instanceof HexagonT) {
				layers.get(0).add(s);
			} else if (s instanceof SquareT) {
				layers.get(1).add(s);
			} else if (s instanceof TriangleT) {
				layers.get(2).add(s);
			} else if (s instanceof RectangleT) {
				layers.get(3).add(s);
			} else if (s instanceof CircleT) {
				layers.get(4).add(s);
			}
		}
	}
}
