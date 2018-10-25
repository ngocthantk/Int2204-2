
package Shape;
import java.awt. *;
public class mainRun {
    public static void main(String[] args) {
      
       Diagram di = new Diagram();
      
       
       
       EventQueue.invokeLater(new Runnable(){
	//EventQueue bat cac su kien tot hon
           @Override
           public void run (){
               Layer lay = new Layer("MyImage",true);
               Layer lay1 = new Layer("New Image",true);
               lay.addShape(new Circle(150,150,100,100,"green",true,true));
               lay.addShape(new Triangle(200,200,200,200,300,300,"green",false,true));
               lay.addShape(new Rectangle(300,300,100,100,"black",false,true));
               lay1.addShape(new Rectangle(150,100,100,100,"red",false,true));
               di.addLay(lay);
               di.addLay(lay1);
               di.run();
               Layer laylay = new Layer(true,di,"Shape triangle","triangle");
               laylay.setVisible(true);
           }
       });
    }
}
