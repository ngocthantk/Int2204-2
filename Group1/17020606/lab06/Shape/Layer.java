/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt. *;
import java.awt.event. *;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing. *;
/**
 *
 * @author Win10
 */
public class Layer extends JPanel implements ActionListener{
    private ArrayList<Shape> lay;
    private Iterator it;//tao 1 con tro trong list
    private String layName;
    public Layer(String name){
        lay = new ArrayList<>();
        layName = name;//dat ten cho layer
        Timer time = new Timer(500,this);//khoi tao thoi gian (delay 0.05s)
        time.start();//cho thoi gian chay
    }
    public void addShape(Shape s){
        lay.add(s);
    }
    public void setLayName(String name){
        layName = name;
    }
    public String getLayName(){
        return layName;
    }
    //cac ham xoa hinh trong arrayList
    public void deleteCircle(){
       it = lay.iterator();
       while(it.hasNext()){
           Object obj = it.next();
          if(obj instanceof Circle){
              lay.remove(obj);
          }
       }
    }
    public void deleteRect(){
       it = lay.iterator();
       while(it.hasNext()){
          Object obj = it.next();
          if(obj instanceof Rectangle){
              lay.remove(obj);
          }
       }
    }
    public void deleteTri(){
       it = lay.iterator();
       while(it.hasNext()){
          Object obj = it.next();
          if(obj instanceof Triangle){
              lay.remove(obj);
          }
       }
    }
    @Override
    public void paintComponent(Graphics g){
        //ham ve do hoa
        super.paintComponent(g);
        Graphics2D g2d =  (Graphics2D) g.create();
        it = lay.iterator();
        while(it.hasNext()){
           Object obj = it.next();
           if(obj instanceof Triangle){
               //ve tam giac
               Triangle tri = (Triangle) obj;//tao 1 ban sao cua object
               g2d.setColor(tri.getCol());//dat mau cho hinh
               Polygon po = new Polygon(new int[] {tri.getX1(), tri.getX2(), tri.getX3()}, new int[] {tri.getY1(),tri.getY2(), tri.getY3()}, 3);
               g2d.drawPolygon(po);
               if(tri.filled){
                  g2d.fill(po);//fill mau cho hinh
               }
           }else if(obj instanceof Rectangle){
               //ve hinh chu nhat
               Rectangle r = (Rectangle) obj;
               g2d.setColor(r.getCol());
               
               g2d.drawRect(r.getX1(), r.getX2(), r.getY1(), r.getY2());
               if(r.filled){
                  g2d.fillRect(r.getX1(), r.getY1(), r.getX2(), r.getY2());
               }
           }else if(obj instanceof Circle){
               //ve hinh tron(oval)
               Circle c = (Circle) obj;
               g2d.setColor(c.getCol());
               g2d.drawOval(c.getX1(),c.getY1(),c.getY1(),c.getY2());
               if(c.filled){
                   g2d.fillOval(c.getX1(),c.getY1(),c.getY1(),c.getY2());
               }
           }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //bat su kien
        step();
        repaint();//cap nhat lai JPanel sau khoang thoi gian 0.05s
    }
    public void step(){
        //ham di chuyen toa do cua cac hinh
        it = lay.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Triangle){
                Triangle tri = (Triangle) obj;
                if(tri.isMoved()) tri.moved();
            }else if(obj instanceof Circle){
                Circle c = (Circle) obj;
                if(c.isMoved) c.moved();
            }else if(obj instanceof Rectangle){
                Rectangle r = (Rectangle) obj;
                if(r.isMoved) r.moved();
            }
        }
    }
}
