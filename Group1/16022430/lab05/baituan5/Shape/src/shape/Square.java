/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author nguyen
 */
class Square extends Rectangle{
    public double size;
	//Ham khoi tao
    public Square(){}
    public Square(double size){
        super(size,size);
        this.size=size;
    }
    public Square(double size, String color ,boolean filled){
        super(size,size);
        this.color = color;
        this.filled = filled;
    }
	//Cac ham setter, getter
    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
        this.size=length;
    }

    @Override
    public String toString() {
        return "Square:"+ "size=" + size + "width=" + width + "length=" + length +"color=" + color + ", filled=" + filled +",Aea="+this.getArea()+",perimeter="+this.getPerimeter()+"";
    }
    
}
