/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import javax.swing.JFrame;
 

public class Main extends JFrame {
 
    public Main() {
 
        initUI();
    }
 
    private void initUI() {
    	setTitle("Toa do");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
    	Main ex = new Main();
    	ex.setVisible(true);
    	Layer circleLayer = new Layer();
    	circleLayer.addCircle(300, 300-150, 300-150);
        circleLayer.addCircle(300, 300-150, 300-150);
    	circleLayer.addCircle(400, 300-200, 300-200);
    	circleLayer.addCircle(500, 300-250, 300-250);
    	circleLayer.addCircle(600, 300-300, 300-300);
    	circleLayer.addCircle(600, 300-300, 300-300);
    	Layer triangleLayer = new Layer();
    	triangleLayer.addTriangle(300, 200, 100, 500, 600, 400);
    	triangleLayer.addTriangle(300, 200, 100, 500, 600, 400);
    	triangleLayer.addTriangle(300, 200, 100+100, 500-100, 600+100, 400-100);
    	triangleLayer.addTriangle(300, 200, 100+200, 500-200, 600+200, 400-200);
    	circleLayer.addCircle(600, 300-300, 300-300);
    	Layer retangleLayer = new Layer();
    	retangleLayer.addRetangle(500, 500, 700, 500, 700, 600, 500, 600);
    	retangleLayer.addRetangle(500, 500, 700, 500, 700, 600, 500, 600);
    	retangleLayer.addRetangle(500-100, 500-100, 700, 500-100, 700, 600, 500-100, 600);
    	retangleLayer.addRetangle(500-200, 500-200, 700, 500-200, 700, 600, 500-200, 600);
    	retangleLayer.addRetangle(500-300, 500-300, 700, 500-300, 700, 600, 500-300, 600);
    	Layer squareLayer = new Layer();
    	squareLayer.addSquare(800, 200, 1000, 200, 1000, 400, 800, 400);
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
    	//dg.diagram.get(3).deleteSame();
    	for(Shape s : dg.diagram.get(0).layer) {
    		if(s instanceof Circle) {
    			System.out.println("has Shape!");
    		}
    	}
    	
    }
}

