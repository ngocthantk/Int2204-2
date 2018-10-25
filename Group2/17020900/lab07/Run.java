package minh.dim;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Run extends JFrame {
	public Run() {
		 
        window();
    }
 
    private void window() {
    	
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
    	Run ex = new Run();
    	ex.setVisible(true);
    	Layer circleLayer = new Layer();
    	
    	circleLayer.themCircle(500, 200-200, 200-200);
    	Layer triangleLayer = new Layer();
    	
    	
    	Layer retangleLayer = new Layer();
    	
    	
    	Layer squareLayer = new Layer();
    	
    	squareLayer.themSquare(700, 250, 100, 200, 100, 200, 700, 300);
    	Layer hexagonLayer = new Layer();
    	hexagonLayer.themHexagon(100, 100, 100);
    	Diagram diagram = new Diagram();
    	diagram.diagram.add(circleLayer);
    	diagram.diagram.add(triangleLayer);
    	diagram.diagram.add(retangleLayer);
    	diagram.diagram.add(squareLayer);
    	diagram.diagram.add(hexagonLayer);
    	ex.add(diagram);
    	diagram.xetShape();
    	diagram.diagram.get(3).layer.get(0).add(0, 400);
    	
    	
    	
    }
}
