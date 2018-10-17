package lab06;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layers = new ArrayList<>();
	
	public void add(Layer l)
	{
		layers.add(l);
	}
	
	public void print()
	{
		for (Layer l : layers)
			l.print();
	}
	
	public void deleteAllCircle()
	{
		for (Layer l : layers)
		{
			l.deleteCircle();
		}
	}
}
