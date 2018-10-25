package lab7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JComponent;

public class Draw extends JComponent {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.CYAN);

		Shape r = new Retangle(10, 10, 100, 200);
		Shape c = new Circle(100, 100, 100);
		Shape s = new Square(150, 150, 100);
		Shape t = new Triangle(100, 300, 100, 600, 300, 300);
		Shape h = new Hexagon(100, 100, 100);

		Layer l = new Layer();
		l.shapes.add(r);
		l.shapes.add(c);
		l.shapes.add(s);
		l.shapes.add(t);
		l.shapes.add(h);
		
		//l.setVisible(false);
		if (l.isVisible()) {
			// ve hinh chu nhat
			g.drawRect(r.getX(), r.getY(), ((Retangle) r).getWidth(), ((Retangle) r).getLength());
			g.setColor(Color.BLUE);
			// ve hinh tron
			g.drawOval(c.getX() - ((Circle) c).getRadian(), c.getY() - ((Circle) c).getRadian(),
					((Circle) c).getRadian() * 2, ((Circle) c).getRadian() * 2);
			g.setColor(Color.GRAY);
			// ve hinh vuong
			g.drawRect(s.getX(), s.getY(), ((Square) s).getSizeSqr(), ((Square) s).getSizeSqr());
			g.setColor(Color.ORANGE);
			// ve tam giac
			g.drawLine(((Triangle) t).getX(), ((Triangle) t).getY(), ((Triangle) t).getX1(), ((Triangle) t).getY1());
			g.drawLine(((Triangle) t).getX1(), ((Triangle) t).getY1(), ((Triangle) t).getX2(), ((Triangle) t).getY2());
			g.drawLine(((Triangle) t).getX(), ((Triangle) t).getY(), ((Triangle) t).getX2(), ((Triangle) t).getY2());

			// Ve luc giac deu
			g.setColor(Color.RED);
			Polygon p = ((Hexagon) h).createHexagon();
			g.drawPolygon(p);

			// di chuyen hinh
			h.moveTo(200, 200);

			p = ((Hexagon) h).createHexagon();
			g.drawPolygon(p);

		}
	}
}
