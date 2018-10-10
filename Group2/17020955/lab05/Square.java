/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5_1;

/**
 *
 * @author TranTienPhong
 */
public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        
        super(side,side);
         
    }
    public Square(double side, String color, Boolean filled ){
        this.width= width;
        this.setLength(side);
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getSide(){
        return this.getWidth();
        
    }
   public void getSide(double side){
       this.setWidth(side);
       this.setLength(side);
        
    }
   
   @Override
   
   public void setWidth(double side){
      setWidth(side);
      
   }
   @Override
   public void setLength(double side){
       setLength(side);
   }
   public String toString(){
       return this.color+ this.filled + this.getWidth();
   }
       
   
      
   
   
   
      
   }
   
    

