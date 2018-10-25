/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Diagram extends JFrame {

    ArrayList<Layer> sodo = new ArrayList<Layer>();

    public void deleteCircleOfDiagram() {
        for (int i = 0; i < sodo.size(); i++) {
            sodo.get(i).deleteCircle();
            int x = sodo.size();
            if (x == 0) {
                sodo.remove(i);

            }
        }

    }

    public Diagram(ArrayList<Layer> d) {
        this.sodo = d;
        this.setSize(1500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(0, this.sodo.size(), 3, 3));

        this.changeSameShape();
        this.setVisible(true);

    }

    public void changeSameShape() {
        Layer c = new Layer();
        Layer t = new Layer();
        Layer r = new Layer();
        Layer h = new Layer();
        Layer s = new Layer();
        for (int i = 0; i < sodo.size(); i++) {
            for (int j = 0; j < sodo.get(i).lop.size(); j++) {
                if (sodo.get(i).lop.get(j) instanceof Circle) {
                    c.lop.add(sodo.get(i).lop.get(j));
                }
                if (sodo.get(i).lop.get(j) instanceof Rectangle) {
                    if (sodo.get(i).lop.get(j) instanceof Square){
                        s.lop.add(sodo.get(i).lop.get(j));
                    }
                    else{
                        r.lop.add(sodo.get(i).lop.get(j));
                    }
                }

                if (sodo.get(i).lop.get(j) instanceof Triangle) {
                    t.lop.add(sodo.get(i).lop.get(j));
                }
                if (sodo.get(i).lop.get(j) instanceof Hexagon) {
                    h.lop.add(sodo.get(i).lop.get(j));
                }
                
            }
        }
        this.sodo.clear();
        this.sodo.add(0, c);
        this.sodo.add(1, t);
        this.sodo.add(2, r);
        this.sodo.add(3, h);
        this.sodo.add(4, s);
        for (Layer l : this.sodo) {
            this.add(l);
        }
        this.setLayout(new GridLayout(0, 5, 3, 3));
    }

    public static void main(String args[]) {
        ArrayList<Shape> s = new ArrayList<Shape>();
        Triangle t1 = new Triangle(0, 50, 70, 0, 60, 80);
        Triangle t2 = new Triangle(0, 50, 30, 0, 30, 58);
        Rectangle r3 = new Rectangle(1, 200, 200, 1, 1, 1, 150, 150);
        Circle c4 = new Circle(30, 100, 10);
        Square s5=new Square(0,200,200,0,0,0,200,200);
        s.add(t2);
        s.add(t1);
        s.add(r3);
        s.add(c4);
        s.add(s5);
        Layer l = new Layer(s);
        ArrayList<Shape> s2 = new ArrayList<Shape>();
        Triangle t01 = new Triangle(100, 50, 70, 0, 60, 80);
        Triangle t02 = new Triangle(0, 58, 36, 0, 37, 59);
        Rectangle r03 = new Rectangle(20, 100, 100, 20, 20, 20, 200, 200);
        Rectangle r06 = new Rectangle(50, 200, 200, 50, 50, 50, 300, 300);
        Hexagon h04=new Hexagon(100,100,100);
        Hexagon h05=new Hexagon(120,100,50);
        Circle c07 =  new Circle(50,150,60);
        Circle c08 = new Circle(80,100,120);
        s2.add(t01);
        s2.add(t02);
        s2.add(r03);
        s2.add(h04);
        s2.add(h05);
        s2.add(r06);
        s2.add(c07);
        s2.add(c08);
        Layer l2 = new Layer(s2);
        ArrayList<Layer> k = new ArrayList<Layer>();
        k.add(l);
        k.add(l2);
        Diagram D = new Diagram(k);

    }
}
