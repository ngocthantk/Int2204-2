package lab06;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 20);
        Shape triangle1 = new Triangle(5, 5, "Red", 20, 12);
        Shape circle = new Circle(5);
        Shape square = new Square(20);
        Layer layer = new Layer("layer");
        layer.addShape(triangle1);
        layer.addShape(square);
        layer.addShape(circle);
        layer.addShape(rectangle);
        Diagram diagram = new Diagram();
        diagram.addLayer(layer);
        diagram.showAllLayer();
        diagram.removeAllCircle();
        System.out.println("\n==============After moving Circle==============\n");
        triangle1.moveTo(10,10);
        square.moveTo(9, 9);
        diagram.showAllLayer();
        diagram.removeAllTriangle();
        System.out.println("\n==============After moving Triangle==============\n");
        diagram.showAllLayer();
       }
}
