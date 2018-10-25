package tuan6;
public class Test {
	public static void main(String[] args) {
		Diagram d = new Diagram();
	
		System.out.println("Add two layers with their shapes into diagram:");
		Layer l0 = new Layer();
		Layer l1 = new Layer();
		d.addLayer(l0);
		d.addLayer(l1);
		
		l0.addShape(new Triangle(0, 0, 2, 0, 1, 1));
		l0.addShape(new Circle(0, 0, 4));
		l0.addShape(new Triangle(-2, -2, -2, 0 , 0, 0));
		l0.addShape(new Square(0, 1, 1, 1, 1, 0, 0, 0));
		l1.addShape(new Square(-1, 1, 1, 1, 1, -1, -1, -1));
		l1.addShape(new Circle(2, 2, 4));
		l1.addShape(new Triangle(-1, -1, 1, -1 , 0, 0));
		l1.addShape(new Rectangle(0, 2, 4, 2, 0, 4, 0, 0));
		
		d.showInfo();
		
		System.out.println("\n\n");
		System.out.println("Delete all triangles of layer l0:");
		l0.deleteShapesByType();
		d.showInfo();
		
		System.out.println("\n\n");
		System.out.println("Delete all circles of diagram:");
		d.deleteShapesByType();
		d.showInfo();
	}

}
