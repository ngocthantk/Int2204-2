/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author TranTienPhong
 */

public class Shape {
    protected String color = "red";
    protected Boolean filled = true;
    protected Toado tam;
    public  Shape(){}
public  Shape(String color, Boolean filled, Toado tam ) {
    this.color = color;
    this.filled = filled;
}

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }
    public void dichuyen(double dodai, String huong) {
        switch(huong){
            case("bac"):
                tam.setY(tam.getY() + dodai);
                break;
                case("nam"):
                tam.setY(tam.getY() -dodai);
                break;
                case("dong"):
                tam.setX(tam.getX() + dodai);
                break;
                case("tay"):
                tam.setX(tam.getX() - dodai);
                break;
                
                
                
        }
    }
    
public void info() {
 System.out.println("");
}

 

    Object elementAt(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void remove(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
