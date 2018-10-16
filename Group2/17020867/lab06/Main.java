package lab06;

public class Main {

	public static void main(String[] args) {
		Diagram d = new Diagram();
		d.addDiagram("circle", 0);
		d.addDiagram("circle", 0);
		d.addDiagram("rectangle", 0);
		d.addDiagram("triangle", 1);
		d.addDiagram("triangle", 1);
		d.addDiagram("circle", 1);
		d.addDiagram("triangle", 2);
		d.addDiagram("triangle", 3);
		d.addDiagram("rectangle", 3);
		d.delCircle();
		d.diagram.get(1).deleteTriangle();
		for(Layer ly : d.diagram) {
			for(Shape s : ly.layer) {
				System.out.print(s.toString() + " ");
			}
		}
	}

}
