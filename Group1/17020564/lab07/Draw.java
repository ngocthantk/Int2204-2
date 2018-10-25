/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author CCNE
 */
public class Draw {

    private JFrame mainMap = new JFrame();
    private Polygon poly;
    public Polygon[] poly1 = new Polygon[10];
    //public Circle[] hinhtron = new Circle[10];
    public Circle hinhtron = new Circle();
    Diagram diagram = new Diagram();
    Layer layer = new Layer();

    public Polygon drawRectangle(Rectangle a) {

        int xPoly[] = {a.getX(), a.getX() + a.getChieudai(), a.getX() + a.getChieudai(), a.getX()};
        int yPoly[] = {a.getY(), a.getY(), a.getY() + a.getChieurong(), a.getY() + a.getChieurong()};;
        poly = new Polygon(xPoly, yPoly, 4);
        return poly;

    }

    public Polygon drawTriangle(Triangle a) {
        int xPoly[] = {a.getX() + a.getX1(), a.getX() + a.getX2(), a.getX() + a.getX3()};
        int yPoly[] = {a.getY() + a.getY1(), a.getY() + a.getY2(), a.getY() + a.getY3()};;
        poly = new Polygon(xPoly, yPoly, 3);
        return poly;
    }

    public void draw() {
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {//dung vong lap de ve cac hinh neu co ton tai
                super.paintComponent(g);

                for (int j = 0; j < layer.lop.size(); j++) {
                    if (layer.lop.get(j) instanceof Circle) {
                        hinhtron = (Circle) layer.lop.get(j);
                        g.setColor(Color.BLUE);
                        g.fillOval(hinhtron.getX(), hinhtron.getY(), hinhtron.getBankinh(), hinhtron.getBankinh());
                        g.drawOval(hinhtron.getX(), hinhtron.getY(), hinhtron.getBankinh(), hinhtron.getBankinh());
                    }
                    if (layer.lop.get(j) instanceof Triangle) {
                        Triangle a = (Triangle) layer.lop.get(j);
                        int xPoly[] = {a.getX() + a.getX1(), a.getX() + a.getX2(), a.getX() + a.getX3()};
                        int yPoly[] = {a.getY() + a.getY1(), a.getY() + a.getY2(), a.getY() + a.getY3()};;
                        poly = new Polygon(xPoly, yPoly, 3);
                        g.setColor(Color.GREEN);
                        g.fillPolygon(poly);
                        g.drawPolygon(poly);
                    }
                    if (layer.lop.get(j) instanceof Rectangle) {
                        Rectangle a = (Rectangle) layer.lop.get(j);
                        int xPoly[] = {a.getX(), a.getX() + a.getChieudai(), a.getX() + a.getChieudai(), a.getX()};
                        int yPoly[] = {a.getY(), a.getY(), a.getY() + a.getChieurong(), a.getY() + a.getChieurong()};;
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

        mainMap.add(p);
        mainMap.setResizable(true);
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainMap.pack();
        mainMap.setVisible(true);
    }

}
