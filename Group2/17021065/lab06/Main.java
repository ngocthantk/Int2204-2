package tuan6;

public class Main {

	public static void main(String[] args) {
		Diagram d = new Diagram();
		d.addDiagram("circle", 0);
		d.addDiagram("circle", 0);
		d.addDiagram("retangle", 0);
		d.addDiagram("triangle", 1);
		d.addDiagram("triangle", 1);
		d.addDiagram("circle", 1);
		d.addDiagram("square", 1);
		d.addDiagram("triangle", 2);
		d.addDiagram("square", 2);
		d.addDiagram("triangle", 3);
		d.addDiagram("square", 3);
		d.addDiagram("retangle", 3);
		d.delCircle();
		d.diagram.get(1).deleteTriangle();
		for(int i=0; i<d.diagram.size(); i++) {
			for(int j=0; j<d.diagram.get(i).layer.size(); j++) {
				Shape s = d.diagram.get(i).layer.get(j);
				System.out.print(i + "-" + s.toString() + " ");
			}
		}
	}

}
