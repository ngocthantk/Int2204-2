package lab06;

public class Main {
	public static void main(String[] args) {
		Shape c1 = new Circle(1, new Point(0,1));
		Shape c2 = new Circle(2, new Point(1,1));
		Shape c3 = new Circle(3, new Point (1,2));
                Layer L=new Layer();
                L.add(c1);
                L.add(c2);
                L.add(c3);
 
		
		Diagram d = new Diagram();
		d.addLayer(L);
		d.showAllLayers();
		d.deleteAllCircle();
		System.out.println("NEW DIAGRAM");
		d.showAllLayers();
	}
}
