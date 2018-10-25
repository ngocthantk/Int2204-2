package diagram;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main{


    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Rectangle r= new Rectangle(100,50,"RED",100,100);
               Triangle t = new Triangle(10,10,40,10,100,50,20,50);
               Circle c = new Circle(260,100,100);
               DrawShapes b=new DrawShapes();
               b.layer.getShape().add(r);
               b.layer.getShape().add(t);
               b.layer.getShape().add(c);// them 3 hinh vao draw b
               Diagram d = new Diagram();
               d.getLayer().add(b.layer);
               d.changeSameShape();
               b.layer=d.getLayer().get(3);// chi ve ra hinh tam giac             
               b.draw();            
            }
        });
    }
}