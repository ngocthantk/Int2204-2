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

    public Polygon drawRectangle(Rectangle a) {

        int xPoly[] = {a.getX(), a.getX() + a.getChieudai(), a.getX() + a.getChieudai(), a.getX()};
        int yPoly[] = {a.getY(), a.getY(), a.getY() + a.getChieurong(), a.getY() + a.getChieurong()};;
        poly = new Polygon(xPoly, yPoly, 4);
        return poly;


    }
    
    public Polygon drawTriangle(Triangle a){
        int xPoly[] = {a.getX() +a.getX1(), a.getX() + a.getX2(), a.getX() + a.getX3()};
        int yPoly[] = {a.getY()+a.getY1(), a.getY()+a.getY2(), a.getY() + a.getY3()};;

        poly = new Polygon(xPoly, yPoly, 3);
        return poly;
    }

    public void draw(Rectangle hcn, Triangle htg) {
        Polygon a=this.drawRectangle(hcn);
        Polygon b=this.drawTriangle(htg);
        
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.setColor(Color.RED);
                g.fillPolygon(a);
                g.drawPolygon(a);
                 g.setColor(Color.BLUE);
                g.fillPolygon(b);
                g.drawPolygon(b);
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
