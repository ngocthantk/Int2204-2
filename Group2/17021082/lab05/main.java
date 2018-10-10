public class main {
    public static void main(String[] args) {
        Shape s = new Shape("can", true);
        Circle c = new Circle(2);
        Rectangle r = new Rectangle(3,4);
        Square sq = new Square(7.5);
        System.out.println("\nShape:" + s.toString());
        System.out.println("\nCircle:" + c.toString());
        System.out.println("\nRectangle:" + r.toString());
        System.out.println("\nSquare:" + sq.toString());
    }  
}
