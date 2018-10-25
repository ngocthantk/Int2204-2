package lab07;

 import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
public class Main extends JFrame
{
	public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        JFrame frame = new JFrame();
        frame.setTitle("Lab7");
        frame.setSize(600, 600);
        frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(new Diagram());
        frame.setVisible(true);
    }
}
