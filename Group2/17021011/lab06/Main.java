package lab06;

public class Main {
	public static void main(String[] args) {
		Shape c1 = new Circle(new Point(0,0),1);
		Shape c2 = new Circle(new Point(1,2),2);
		Shape c3 = new Circle(new Point(-1,1),3);
		Shape t1 = new Triangle(3,4,5);
		Shape t2 = new Triangle(5,5,5);
		Shape s1 = new Square(5);
		Shape s2 = new Square(10);
		Shape r1 = new Rectangle(2,4);
		Shape r2 = new Rectangle(1,5);
		Shape r3 = new Rectangle(3,6);
		
		Layer l1 = new Layer();
		l1.add(c1);
		l1.add(t2);
		l1.add(t1);
		l1.add(s2);
		l1.add(r2);
		
		Layer l2 = new Layer();
		l2.add(c2);
		l2.add(c3);
		l2.add(s1);
		l2.add(r1);
		l2.add(r3);
		
		Diagram d = new Diagram();
		d.addLayer(l1);
		d.addLayer(l2);
		d.showAllLayers();
		d.deleteAllCircle();
		System.out.println("NEW DIAGRAM");
		d.showAllLayers();
	}
}
