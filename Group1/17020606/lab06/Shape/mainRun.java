/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;
import java.awt. *;
/**
 *
 * @author Win10
 */
public class mainRun {
    public static void main(String[] args) {
       Layer lay = new Layer("MyImage");
       lay.addShape(new Circle(100,100,100,100,"red",true,true));
       lay.addShape(new Triangle(100,100,200,200,300,300,"yellow",true,true));
       lay.addShape(new Rectangle(300,300,100,100,"blue",false,true));
       Diagram di = new Diagram();
       di.addLay(lay);
       EventQueue.invokeLater(new Runnable(){
	//EventQueue bat cac su kien tot hon
           @Override
           public void run (){
               di.process();
               di.setVisible(true);
           }
       });
    }
}
