/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

public class Square extends Rectangle{
    boolean checkSquare;
    public Square(int x1,int x2,int x3,int x4, int y1,int y2,int y3, int y4){
        super(x1,x2,x3,x4,y1,y2,y3,y4);
        if(this.checkRec()){
            checkSquare=checkSquare();
        }
        else{
            checkSquare=false;
        }
        
    }
    public boolean checkSquare(){
        boolean check=false;
        double bc=this.lenght(this.x[1], this.y[1], this.x[2], this.y[2]);
        double cd=this.lenght(this.x[2], this.y[2], this.x[3], this.y[3]);
        if(bc==cd){
            check=true;
        }
        return check;
    }
}
