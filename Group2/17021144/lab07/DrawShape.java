package lap07;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
// vẽ hình

public class DrawShape extends JPanel {
    Layer x = new Layer();
    Diagram dia = new Diagram();
    
// Hàm khởi tạo các hình
    public void Create() {
        Circle circ = new Circle(80, 80, 70, true, Color.PINK);
        Rectangle rect = new Rectangle(70, 120, 250, 200, true, Color.ORANGE);
        Square sq = new Square(80, 400, 80, true, Color.cyan);
        Triangle tria = new Triangle(Color.green, true, 550, 400, 500, 300, 150, 400, 0, 0);
        Hexagon hexa = new Hexagon( Color.ORANGE, true, 10, 10, 530, 515, 455, 430, 455, 505, 480, 523, 523, 480, 437, 437);
        dia.addLayer(x);
        x.addShape(circ);
        x.addShape(rect);
        x.addShape(sq);
        x.addShape(tria);
        x.addShape(hexa);

    }
/////
    @Override
    public void paint(Graphics gra) {
        super.paint(gra);
        this.setBackground(Color.YELLOW);
      // vẽ hình đồng thời kiểm tra hình trùng nhau
     for (int i = 0; i < x.shape.size(); i++) {
            if (x.shape.get(i).isFilled()) {
                // nếu chưa có hình tròn thì vẽ
                if (x.shape.get(i) instanceof Circle) {
                    gra.setColor(x.shape.get(i).color);
                    gra.fillOval(x.shape.get(i).x, x.shape.get(i).y, (int) x.shape.get(i).getRadius(), (int) x.shape.get(i).getRadius());
                }
                // nếu chưa có hình chữ nhật thì vẽ
                 if (x.shape.get(i) instanceof Rectangle) {
                    gra.setColor(x.shape.get(i).color);
                    gra.fillRect(x.shape.get(i).x, x.shape.get(i).y, (int) x.shape.get(i).getWidth(), (int) x.shape.get(i).getLength());
                }
                // nếu chưa có hình vuông thì vẽ
                if (x.shape.get(i) instanceof Square) {
                    gra.setColor(x.shape.get(i).color);
                    gra.fillRect(x.shape.get(i).x, x.shape.get(i).y, (int) x.shape.get(i).getSide(), (int) x.shape.get(i).getSide());
                }
                // nếu chưa có hình tam giác thì vẽ
                if (x.shape.get(i) instanceof Triangle) {
                    gra.setColor(x.shape.get(i).color);
                    gra.fillPolygon(x.shape.get(i).getTx(), x.shape.get(i).getTy(), 3);
                }
                // nếu chưa có hình lục giác thì vẽ
                if (x.shape.get(i) instanceof Hexagon) {
                    gra.setColor(x.shape.get(i).color);
                    gra.fillPolygon(x.shape.get(i).getHX(), x.shape.get(i).getHY(), 6);
                }
            }
        }
    }
// hàm main
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("lap07");
        frame.setTitle("do hoa  hinh");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawShape draw = new DrawShape();
        draw.Create();
        frame.add(draw);
        frame.setVisible(true);
     }
 }