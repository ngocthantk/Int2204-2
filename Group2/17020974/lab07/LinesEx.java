/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admincxq
 */
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {
        Graphics2D g2d=(Graphics2D)g;
	Shape c1 = new Circle(30,30);
	Shape t1 = new Triangle(20,60,40,20,20,60);
	Shape s2 = new Square(0,30,30,0,0,0,30,30);
	Shape r2 = new Retangle(20,100,100,20,0,0,50,50);
	Layer l1 = new Layer();
	l1.add(c1);
	l1.add(t1);
	l1.add(s2);
	l1.add(r2);
	g2d.drawRect(20,0,80,50);
	g2d.drawRect(0,0,30,30);
	g2d.drawArc(30, 30,100,100,360, 360);

	g2d.drawLine(20,20,40,60);
	g2d.drawLine(40,60,20,60);
	g2d.drawLine(20,60,20,20);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class LinesEx extends JFrame {

    public LinesEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Lines");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                LinesEx ex = new LinesEx();
                ex.setVisible(true);
            }
        });
    }
}
