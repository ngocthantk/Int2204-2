package Lab07;

import java.awt.Graphics;
import javax.swing.JFrame;
 

public class Main extends JFrame {
 
    public Main() {
 
        initUI();
    }
 
    private void initUI() {
    	setTitle("Points");
        setSize(1200, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
    	Main m = new Main();
    	m.setVisible(true);
        //Tròn
    	Layer c = new Layer();
    	c.addCircle(300, 150, 150);
    	c.addCircle(300, 150, 150);
    	c.addCircle(600, 300, 300);
        //Tam giác
    	Layer t = new Layer();
    	t.addTriangle(300, 200, 100, 500, 600, 400);
    	t.addTriangle(300, 200, 100, 500, 600, 400);
    	t.addTriangle(300, 200, 300, 300, 800, 200);
        //Chữ nhật
    	Layer r = new Layer();
    	r.addRectangle(500, 500, 700, 500, 700, 600, 500, 600);
    	r.addRectangle(500, 500, 700, 500, 700, 600, 500, 600);
    	r.addRectangle(200, 200, 700, 200, 700, 600, 200, 700);
        //Vuông
    	Layer sq = new Layer();
    	sq.addSquare(800, 200, 1000, 200, 1000, 400, 800, 400);
    	sq.addSquare(800, 200, 1000, 200, 1000, 400, 800, 400);
        //Lục giác
    	Layer hex = new Layer();
    	hex.addHexagon(100, 100, 100);
    	Diagram d = new Diagram();
    	d.diagram.add(c);
    	d.diagram.add(t);
    	d.diagram.add(r);
    	d.diagram.add(sq);
    	d.diagram.add(hex);
    	m.add(d);
    	d.sortShape();
    	d.diagram.get(3).layer.get(0).move(0, 400);
    	//dg.diagram.get(3).deleteSame();
    	for(Shape s : d.diagram.get(0).layer) {
    		if(s instanceof Circle) {
    			System.out.println("has Shape!");
    		}
    	}
    	
    }
}
