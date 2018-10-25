package lab07;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{

	Diagram diagram = new Diagram();
	
	Layer layer = new Layer();
	@FXML
	private  AnchorPane layout = new AnchorPane();
	
	static AnchorPane root;
	@FXML
	private Button button;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		root = layout;
		Circles circle1 = new Circles(100,100,50);
		circle1.draw();
		layer.add(circle1);
		Circles circle2 = new Circles(500,300,100);
		circle2.draw();
		layer.add(circle2);
		Rectangles rect1 = new Rectangles(300,400,100,200);
		rect1.draw();
		layer.add(rect1);
		Hexagons hexagon = new Hexagons(100,500,100);
		hexagon.draw();
		layer.add(hexagon);
		Squares square1 = new Squares(100,300,100);
		square1.draw();
		layer.add(square1);
		Triangles tri1 = new Triangles(300,400,100,0,400,0);
		tri1.draw();
		layer.add(tri1);
		diagram.add(layer);
		diagram.sort();
		diagram.print();
	}
	
}
