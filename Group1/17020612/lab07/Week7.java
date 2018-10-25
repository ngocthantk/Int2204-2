/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;


import java.util.ArrayList;
import javax.swing.SwingUtilities;
public class Week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Rectangle a= new Rectangle(120,50,"RED",100,100);
               Triangle c= new Triangle(30,30,90,90,50,0,0,0);
               Circle d = new Circle(100,200,50);
               Draw b=new Draw();
               b.layer.lop.add(a);
               b.layer.lop.add(c);
               b.layer.lop.add(d);// them 3 hinh vao draw b
               Diagram dia = new Diagram();
               dia.sodo.add(b.layer);             
               b.draw();            
            }
        });
    }
    
}
