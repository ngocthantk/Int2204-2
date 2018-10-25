package tu.phamanh;

import javax.swing.JFrame;
 
public class ClassMain extends JFrame {
 
    public ClassMain() {
 
        initUI();
    }
 
    private void initUI() {
    	setTitle("Points");
        setSize(1600, 1200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
    	ClassMain tmp = new ClassMain();
    	tmp.setVisible(true);
    	Layer circleLayer = new Layer();
    	circleLayer.addCircle(300, 240, 240);
    	circleLayer.addCircle(400, 150, 150);
    	circleLayer.addCircle(500, 0, 0);
    	
    	Layer triangleLayer = new Layer();
    	triangleLayer.addTriangle(400, 200, 100, 700, 600, 400);
    	triangleLayer.addTriangle(300, 200, 600, 500, 100, 400);
    	
    	Layer retangleLayer = new Layer();
    	retangleLayer.addRetangle(200, 200, 200, 600, 1000, 600, 1000, 200);
    	retangleLayer.addRetangle(300, 300, 700, 300, 700, 600, 300, 600);
    	
    	Layer squareLayer = new Layer();
    	squareLayer.addSquare(400, 200, 400, 600, 800, 200, 800, 600);
    	squareLayer.addSquare(600, 400, 600, 1000, 1200, 1000, 1200, 400);
    	Layer hexagonLayer = new Layer();
    	hexagonLayer.addHexagon(300, 300, 300);
    	Diagram dg = new Diagram();
    	dg.diagram.add(circleLayer);
    	dg.diagram.add(triangleLayer);
    	dg.diagram.add(retangleLayer);
    	dg.diagram.add(squareLayer);
    	dg.diagram.add(hexagonLayer);
    	tmp.add(dg);
    	dg.sortShape();
    	dg.diagram.get(3).layer.get(0).move(0, 400);
    	//dg.diagram.get(3).deleteSame();
    	for(Shape s : dg.diagram.get(0).layer) {
    		if(s instanceof Circle) {
    			System.out.println("has Shape!");
    		}
    	}
    	
    }
}
