package lab06 ;



import javax.swing.JFrame;


public class test extends JFrame {
	private Diagram d = new Diagram();
	public Diagram getD() {
		return d;
	}
	public void setD(Diagram d) {
		this.d = d;
	}
	public test() {
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Circle c = new Circle(100, 200, 200);
    	Rectangle r = new Rectangle(100, 100, 700, 200);
    	Square s = new Square(100,100,300);
    	Triangle t = new Triangle(100, 100, 50, 50, 250, 50);
    	Hexagon h = new Hexagon(100, 200, 200);
    	Layer l = new Layer();
    	l.getLayer().add(c);
    	l.getLayer().add(c);
    	l.getLayer().add(c);
    	l.getLayer().add(c);
    	l.getLayer().add(r);
    	l.getLayer().add(h);
    	l.getLayer().add(h);
    	l.getLayer().add(h);
    	l.getLayer().add(s);
    	l.getLayer().add(t);
    	l.getLayer().add(t);
    	l.deleteSameShap();
    	d.getLayers().add(l);
    	this.add(d);
  
	}
        
}