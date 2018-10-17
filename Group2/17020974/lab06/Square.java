/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admincxq
 */
public class Square extends Retangle{
    
    public Square(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }
    @Override
    public boolean check(){
        if(A.khoangcach(B)==A.khoangcach(D))
            return true;
        return false;
    }
}
