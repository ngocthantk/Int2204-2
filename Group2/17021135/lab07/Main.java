package lap07;

import javax.swing.JFrame;
 

public class Main extends JFrame {
 
    public Main() {
 
        initUI();
    }
 
    private void initUI() {
    	setTitle("points");
        setSize(1500, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
    	Main ex = new Main();
    	ex.setVisible(true);
    	Layer circleLayer = new Layer();
    	circleLayer.addCircle(100, 50, 50);
    	Layer triangleLayer = new Layer();
    	triangleLayer.addTriangle(300, 200, 100, 500, 600, 400);
    	Layer retangleLayer = new Layer();
    	retangleLayer.addRetangle(500, 500, 700, 500, 700, 600, 500, 600);
    	Layer squareLayer = new Layer();
    	squareLayer.addSquare(800, 200, 1000, 200, 1000, 400, 800, 400);
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
    	dg.diagram.get(3).layer.get(0).move(0, 400);
    	for(Shape s : dg.diagram.get(0).layer) {
    		if(s instanceof Circle) {
    			System.out.println("shape");
    		}
    	}
    	
    }
}
