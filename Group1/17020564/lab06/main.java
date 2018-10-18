package javaapplication17;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class main
{


    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Rectangle a= new Rectangle(300,200,"RED",50,50);
               Triangle c= new Triangle(30,30,80,80,40,0,0,0);
               Draw b=new Draw();
               b.draw(a, c);

               
               
               
               
            }
        });
    }
    
}
