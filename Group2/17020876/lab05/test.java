
package Shape;
public class test {
    public static void main(String[] args){
        
    Shape s = new Shape("tim", true);
    Circle c = new Circle(3, "tim", true);
    Rectangle r = new Rectangle(3,4);
    Square sq = new Square(6);
    
    System.out.println("\nShape:" + s.toString());
    System.out.println("\nCircle:" + c.toString());
    System.out.println("\nRectangle:" + r.toString());
    System.out.println("\nSquare:" + sq.toString());
    }
}