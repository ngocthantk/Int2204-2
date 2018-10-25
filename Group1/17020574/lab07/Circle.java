
package Shape;




public class Circle extends Shape{
   
    private final double  pi = 3.14;
    private int  x1,y1;
    private int x2,y2;
    
    public Circle(int x1, int x2, int y1, int y2){
        //khoi tao co tham so
        this.x1 = x1;
	this.y1 = y1;
        this.x2 = x2;
	this.y2 = y2;
    }
    public Circle(int x1, int x2, int y1, int y2, String color, boolean filled, boolean move){
        
        super(color, filled, move);
        this.x1 = x1;
	this.y1 = y1;
        this.x2 = x2;
	this.y2 = y2;
    }
    public void moved(){
        //ham dich chuyen hinh
        x1+=5;
        x2+=5;
    }
    public void setPoint1(int x1, int y1){
        this.x1 = x1; this.y1 = y1;
    }
     public void setPoint2(int x2, int y2){
        this.x2= x2; this.y2 = y2;
    }
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }
}
