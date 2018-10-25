package lab06;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class draw extends JPanel{
	Rectangle r=new Rectangle();
	Square s=new Square();
	Circle c=new Circle();
	Triangle t= new Triangle();
	public void veHinhChuNhat(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.setColor(new Color(31, 21, 1));
	    g2d.fillRect(r.tam.x,r.tam.y,r.Chieudai, r.Chieurong);
	}
	public void veHinhVuong(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.setColor(new Color(31, 21, 1));
	    g2d.fillRect(s.tam.x,s.tam.y, s.canh, s.canh);
	}
	public void veHinhTron(Graphics g) {
		g.drawOval(c.I.x, c.I.y, c.ban_kinh, c.ban_kinh);
	}
	public void veHinhTamGiac(Graphics g) {
		 super.paint(g);
		//All triangle corner x coordinate  
		 int[]x={t.A.x,t.A.y,t.C.x};
		//All triangle corner y coordinate  
		 int[]y={t.B.x,t.B.y,t.C.y};
		//Set color base on RGB  
		 //You can get RGB value for your color at "Color picker" at above  
		 //R=255  
		 //G=192  
		 //B=0  
		 //So after this all you draw will use this color  
		 g.setColor(new Color(255,192,0));
		//Draw triangle in JPanel 
		 g.fillPolygon(x,y,3);
	}
}
