package bai2;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;  
  
public class Main extends Canvas{  
      
    public void paint(Graphics g) { 
        setBackground(Color.WHITE);      
        Shape re=new Rectangle(10, 20, 80,100,true);
        Shape sq=new Square(50, 50, 100,true);
        Shape tr=new Triangle(100, 20, 200, 40, 200, 300,true);
        Shape ci=new Circle(10,10,185,true);
        Layer lay=new Layer();
        lay.layer.add(re);
        lay.layer.add(sq);
        lay.layer.add(tr);
        lay.layer.add(ci);
        Shape re1=new Rectangle(10, 20, 80,100,true);
        Shape sq1=new Square(50, 50,100,true);
        Shape tr1=new Triangle(100, 20, 200, 40, 200, 300,true);
        Shape ci1=new Circle(100,100,105,true);
        Hexagon he=new Hexagon(250, 250, 50, true);
        he.draw(g);
        Layer lay1=new Layer();
        lay1.layer.add(re1);
        lay1.layer.add(sq1);
        lay1.layer.add(tr1);
        lay1.layer.add(ci1);
        Diagram di =new Diagram();
        di.dia.add(lay);
        di.dia.add(lay1);
        di.sort();//chuyen tung loai hinh vao tung layer
        di.dr(g);//ve cac hinh
        //layer.deleteCompe : xoa cac hinh trung nhau trong cung 1 layer
        //Diagram.delete : xoa cac hinh tron trong Diagram
    } 
        public static void main(String[] args) {  
        Main m=new Main(); 
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);        
        f.setVisible(true);  
    }     
} 

