/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Square extends Rectangle{
        double side;
        //get side
        public double getSide() {
            return side;
        }   
        //set side
        public void setSide(double side) {
            this.side = side;
        }
        
        
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double width, double length, String color, boolean filled) {
		super(width, length, color, filled);
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
            super.setLength(side);
            super.width=side;
		// TODO Auto-generated constructor stub
	}
	
}
