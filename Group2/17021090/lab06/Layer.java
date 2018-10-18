package lab06;

import java.util.ArrayList;

public class Layer  {
	private ArrayList<Shape> shapes = new ArrayList<>();
	
	public void add(Shape shape)
	{
		shapes.add(shape);
	}
	
	public void print()
	{
		for (Shape s : shapes)
			System.out.println(s.toString());
	}
	
	public void deleteTriangle()
	{
		ArrayList<Shape> temp = new ArrayList<>();
		for (Shape s : shapes)
			if (!(s instanceof Triangle))
				temp.add(s);
		shapes = temp;
	}
	
	public void deleteCircle()
	{
		ArrayList<Shape> temp = new ArrayList<>();
		for (Shape s : shapes)
			if (!(s instanceof Circle))
				temp.add(s);
		shapes = temp;
	}
}
