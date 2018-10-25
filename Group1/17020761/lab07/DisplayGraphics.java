package lab06;
import java.awt.*;  
import javax.swing.JFrame;  
  
public class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) {    
        setBackground(Color.WHITE);  
        Diagram a = new Diagram();
        Layer layer = new Layer();
		Layer layernull = new Layer();
		Layer layervisible = new Layer();
		a.addDiagram(layer);
		a.addDiagram(layernull);
		a.addDiagram(layervisible);
		layer.addLayer(new Square(20,20,20,100,100,100,100,20));
		g.drawLine(20, 20, 20, 100);
		g.drawLine(20, 100, 100, 100);
		g.drawLine(100, 100, 100, 20);
		g.drawLine(20, 20, 100, 20);
    }  
        public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(800,800);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}