package Apprun;

import javax.swing.JFrame;

import App.Diagram;
import Diagram.Layer;
import Diagram.ToaDo;

public class Main extends JFrame {
	 
    public Main() {
 
        initUI();
    }
 
    private void initUI() {
    	setTitle("Points");
        setSize(1200, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
 
    public static void main(String[] args) {
    	Main ex = new Main();
    	ex.setVisible(true);
    	Layer circleLayer = new Layer();
    	circleLayer.addCircle(300, new ToaDo(150, 150));
    	circleLayer.addCircle(300, new ToaDo(150, 150));
    	circleLayer.addCircle(600, new ToaDo(0, 0));
    	circleLayer.addCircle(600, new ToaDo(0, 0));
    	Layer triangleLayer = new Layer();
    	triangleLayer.addTriangle(300, 200, 100, 500, 600, 400);
    	triangleLayer.addTriangle(300, 200, 100, 500, 600, 400);
    	Layer retangleLayer = new Layer();
    	circleLayer.addCircle(600, new ToaDo(0, 0));
    	retangleLayer.addRectangle(100, 200, new ToaDo(100, 100));
    	retangleLayer.addRectangle(100, 300,  new ToaDo(100, 100));
    	Layer squareLayer = new Layer();
    	squareLayer.addSquare(100,  new ToaDo(100, 200));
    	squareLayer.addSquare(200,  new ToaDo(200, 200));
    	Layer hexagonLayer = new Layer();
    	hexagonLayer.addHexagon(100, 100, 100);
    	Diagram dg = new Diagram();
    	dg.diagram.add(circleLayer);
    	dg.diagram.add(triangleLayer);
    	dg.diagram.add(retangleLayer);
    	dg.diagram.add(squareLayer);
    	dg.diagram.add(hexagonLayer);
    	ex.add(dg);
    	dg.sortShape();
    	dg.diagram.get(3).layer.get(0).move(0, 200);
    	
    }
    
}

