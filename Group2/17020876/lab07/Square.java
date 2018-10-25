/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package đohoa;

/**
 *
 * @author MyPC
 */
public class Square extends Rectangle{
    private int x, y, canh;
    

    public Square(boolean fill, int x, int y,int canh) {
        super(fill, x, y, canh, canh);
        this.canh = canh;
    }

    Square(boolean b, int x, int y, int canh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
    public boolean ok(Square s){
        if(this.x == s.x && this.y == s.y && this.canh == s.canh)
            return true;
        return false;
    }
    public void move(int x_new, int y_new){
       
        this.x = x_new;
        this.y = y_new;
    }
    
}
