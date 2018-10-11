/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
class Square extends Rectangle{
    protected double size;
    //Ham khoi tao
    public Square(){
    
    }
    public Square(double size){
        this.width = size;
        this.length = size;
    }
    public Square(double size, String color ,boolean filled){
        this.width = size;
        this.length = size;
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
        this.width = length;
    }

    @Override
    public String toString() {
        return "Square{" + "size = " + size + '}';
    }
    
}
