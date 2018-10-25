
 
import java.awt.Polygon;
import java.security.acl.Group;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

 

public class Main extends Application {
 
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Pane root = new Pane();
        
        // toa do cac diem
        Node A = new Node(150.5, 30.5);
        Node B = new Node(150.5, 150.5);
        Node C = new Node(30.5, 30.5);
        Node local1 = new Node(30.5, 30.5);
        Node local2 = new Node(100, 100);
        Node E = new Node(100, 100);
        Node F = new Node(300, 100);
        Node G = new Node(300, 200);
        Node H = new Node(100, 200);
     
        
        
        Triangle tri = new  Triangle("red", A, B, C,local1);
        Rectangle rec = new  Rectangle("black", E, F, G, H, local2);
        Circle circle = new Circle("red", new Node(500, 500), 50);

        
        rec.drawRec(gc);
        tri.drawTri(gc);
        circle.drawCircle(root);
        
        
        
       
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 1000, 1000, Color.WHITESMOKE);
        stage.setTitle("JavaFX 2D Shapes");
        stage.setScene(scene);
        stage.show();
    }


 
 
    public static void main(String[] args) {
        launch(args);

    }
 
}