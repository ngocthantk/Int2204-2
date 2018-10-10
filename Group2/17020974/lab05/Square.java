/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author admincxq
 */
public class Square extends Rectangle{
    public Square(){}
    public Square(double size){
        super(size,size);
    }
    public Square(double size,String color, boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
        return super.getLength();
    }
    public void setSize(double size){
        super.setLength(size);
    }
    @Override
    public void setWidth(double size) {
        super.setWidth(size);
        super.setLength(size);
    }
    @Override
    public void setLength(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    @Override
    public String toString(){
        return getSize()+" "+super.getArea()+" "+super.getPerimeter();
    }
}
