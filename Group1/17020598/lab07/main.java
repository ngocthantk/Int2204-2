/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javax.swing.SwingUtilities;

/**
 *
 * @author AnhTam
 */
public class main
{


    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Rectangle a= new Rectangle(100,50,"RED",100,100);
               Triangle c= new Triangle(30,30,80,80,40,0,0,0);
               Circle d = new Circle(100,200,50);
               Draw b=new Draw();
               b.layer.lop.add(a);
               b.layer.lop.add(c);
               b.layer.lop.add(d);
               Diagram dia = new Diagram();
               dia.sodo.add(b.layer);
               dia.changeSameShape();
               b.layer=dia.sodo.get(3);          
               b.draw();            
            }
        });
    }
    
}