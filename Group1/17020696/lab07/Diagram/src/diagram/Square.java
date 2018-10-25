/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Square extends Rectangle{

    public Square(int x, int y, String color, int width, int length) {
        super(x, y, color, width, length);
    }
    
 

    
    @Override
    public void setWidth(int side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(int side){
        super.setLength(side);
        super.setWidth(side);
    }
}
