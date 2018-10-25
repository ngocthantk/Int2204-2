package diagram;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Ba Duc
 */
public class DrawShapes extends JFrame{
    private JFrame jf = new JFrame();
    private Polygon poly;
    Diagram diagram = new Diagram();
    Layer layer = new Layer();
    
    public Polygon drawRectangle(Rectangle r) {

        int xPoly[] = {r.getX(), r.getX() + r.getLength(), r.getX() + r.getLength(), r.getX()};
        int yPoly[] = {r.getY(), r.getY(), r.getY() + r.getWidth(), r.getY() + r.getWidth()};;
        poly = new Polygon(xPoly, yPoly, 4);
        return poly;

    }
    
    public Polygon drawTriangle(Triangle t) {
        int xPoly[] = {t.getX() + t.getX1(), t.getX() + t.getX2(), t.getX() + t.getX3()};
        int yPoly[] = {t.getY() + t.getY1(), t.getY() + t.getY2(), t.getY() + t.getY3()};;
        poly = new Polygon(xPoly, yPoly, 3);
        return poly;
    }

     public void draw() {
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {//dung vong lap de ve cac hinh neu co ton tai
                super.paintComponent(g);

                for (int j = 0; j < layer.getShape().size(); j++) {
                    if (layer.getShape().get(j) instanceof Circle) {
                        Circle c = (Circle) layer.getShape().get(j);
                        g.setColor(Color.BLUE);
                        g.fillOval(c.getX(), c.getY(), (int) c.getRadius(),(int) c.getRadius());
                        g.drawOval(c.getX(), c.getY(),(int) c.getRadius(),(int) c.getRadius());
                    }
                    if (layer.getShape().get(j) instanceof Triangle) {
                        Triangle t = (Triangle) layer.getShape().get(j);
                        int xPoly[] = {t.getX() + t.getX1(), t.getX() + t.getX2(), t.getX() + t.getX3()};
                        int yPoly[] = {t.getY() + t.getY1(), t.getY() + t.getY2(), t.getY() + t.getY3()};;
                        poly = new Polygon(xPoly, yPoly, 3);
                        g.setColor(Color.GREEN);
                        g.fillPolygon(poly);
                        g.drawPolygon(poly);
                    }
                    if (layer.getShape().get(j) instanceof Rectangle) {
                        Rectangle r = (Rectangle) layer.getShape().get(j);
                        int xPoly[] = {r.getX(), r.getX() + r.getLength(), r.getX() + r.getLength(), r.getX()};
                        int yPoly[] = {r.getY(), r.getY(), r.getY() + r.getWidth(), r.getY() + r.getWidth()};;
                        poly = new Polygon(xPoly, yPoly, 4);
                        g.setColor(Color.RED);
                        g.fillPolygon(poly);
                        g.drawPolygon(poly);
                    }

                }

            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };

        jf.add(p);
        jf.setResizable(true);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

}
    
   
