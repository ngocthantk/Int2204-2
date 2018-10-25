package bai2;

import java.awt.Color;
import java.awt.Graphics;

public class Paint {
public void paint(Graphics g) {  
        
      //  setBackground(Color.WHITE);  
        g.drawRect(130, 30,100, 80);  
      

        
        g.drawLine(100, 130, 40, 10);
    	g.drawLine(100, 130, 50, 50);
    	g.drawLine(40, 10, 50, 50);        
        
       // drawTriangle(g);

    } 

}
