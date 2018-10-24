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
      
       Diagram di = new Diagram();
      
       
       
       EventQueue.invokeLater(new Runnable(){
	//EventQueue bat cac su kien tot hon
           @Override
           public void run (){
               LayerNew lay = new LayerNew("MyImage",true);
               LayerNew lay1 = new LayerNew("New Image",true);
               lay.addShape(new Circle(100,100,100,100,"red",true,true));
               lay.addShape(new Triangle(100,100,200,200,300,300,"green",false,true));
               lay.addShape(new Rectangle(300,300,100,100,"blue",false,true));
               lay1.addShape(new Rectangle(150,100,100,100,"pink",false,true));
               di.addLay(lay);
               di.addLay(lay1);
               di.run();
               LayerNew laylay = new LayerNew(true,di,"Shape triangle","triangle");
               laylay.setVisible(true);
           }
       });
    }
}
