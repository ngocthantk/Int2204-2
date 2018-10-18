
package lap6;

public class Lap6 {

    public static void main(String[] args) {
        // write your code here
        Shape rectangle = new Rectangle(30, 60);     
        Shape triangle= new Triangle(10, 10, "Red", 15, 10, 20);
        Shape circle = new Circle(5);
        Shape square = new Square(20);
    
        
        Layer layer = new Layer("layer");
        // gọi hàm từ lớp Layer đến các lớp hình
        layer.addShape(rectangle); 
        layer.addShape(square);
        layer.addShape(triangle);        
        layer.addShape(circle);
            
        Diagram diagram = new Diagram();
        diagram.addLayer(layer);
        diagram.showAllLayer();
        
        // xóa lớp Circle
        diagram.removeAllCircle();
        System.out.print("\n1.");    
        diagram.showAllLayer();
        
        // Xóa lớp Triangle
        diagram.listLayer.get(0).removeAllTriangle();
        System.out.print("\n2.");
        diagram.showAllLayer();

    }
}