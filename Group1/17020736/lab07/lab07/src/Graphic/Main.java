package Graphic;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main
{


    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Rectangle a= new Rectangle(100,50,"Blue",100,100);
                Triangle c= new Triangle(30,30,80,80,40,0,0,0);
                Circle d = new Circle(100,200,50);
                Draw b=new Draw();
                b.layer.lr.add(a);
                b.layer.lr.add(c);
                b.layer.lr.add(d);// them 3 hinh vao draw b
                Diagram dia = new Diagram();
                dia.dg.add(b.layer);
                dia.changeSameShape();
                b.layer=dia.dg.get(3);// chi ve ra hinh tam giac
                b.draw();
            }
        });
    }

}
