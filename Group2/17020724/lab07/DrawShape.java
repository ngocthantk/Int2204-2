package lab07;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 @SuppressWarnings("serial")
public class DrawShape extends JPanel {
    Layer x = new Layer();
    Diagram dia = new Diagram();
    
    public void khoitao() {
        Circle circ = new Circle(80, 50, 70, true, Color.CYAN);
        Circle circ1 = new Circle(80, 50, 70, true, Color.red);
        Rectangle rect = new Rectangle(50, 80, 50, 180, true, Color.yellow);
        Square sq = new Square(80, 50, 300, true, Color.GREEN);
        Triangle tria = new Triangle(Color.white, true, 300, 400, 400, 300, 250, 300, 0, 0);
        Hexagon hexa = new Hexagon(470, 445, 395, 370, 395, 445, 420, 463, 463, 420, 377, 377, Color.red, true, 0, 0);
        dia.addLayer(x);
        x.addShape(circ);
        x.addShape(circ1);
        x.addShape(rect);
        x.addShape(sq);
        x.addShape(tria);
        x.addShape(hexa);
    }
    public void paint(Graphics gra) {
        super.paint(gra);
        this.setBackground(Color.pink);
        	for(int i = 0; i < x.shape.size(); i++) {
        		if(x.shape.get(i).isFilled()) {
        			if(x.shape.get(i) instanceof Circle) {
        				gra.setColor(x.shape.get(i).color);
        				gra.fillOval(x.shape.get(i).x, x.shape.get(i).y, (int) x.shape.get(i).getRadius(), (int) x.shape.get(i).getRadius());
        			}
        			if(x.shape.get(i) instanceof Rectangle) {
        				gra.setColor(x.shape.get(i).color);
        				gra.fillRect(x.shape.get(i).x, x.shape.get(i).y, (int) x.shape.get(i).getWidth(), (int) x.shape.get(i).getLength());
        			}
        			if(x.shape.get(i) instanceof Square) {
        				gra.setColor(x.shape.get(i).color);
        				gra.fillRect(x.shape.get(i).x, x.shape.get(i).y, (int) x.shape.get(i).getSide(), (int) x.shape.get(i).getSide());
        			}
        			if(x.shape.get(i) instanceof Triangle) {
        				gra.setColor(x.shape.get(i).color);
        				gra.fillPolygon(x.shape.get(i).getTx(), x.shape.get(i).getTy(), 3);
        			}
        			if(x.shape.get(i) instanceof Hexagon) {
        				gra.setColor(x.shape.get(i).color);
        				gra.fillPolygon(x.shape.get(i).getHX(), x.shape.get(i).getHY(), 6);
        			}
        		}
        	}
    	}
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setTitle("Lab 07 by NTH");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawShape draw = new DrawShape();
        draw.khoitao();
        frame.add(draw);
        frame.setVisible(true);
     }
 }