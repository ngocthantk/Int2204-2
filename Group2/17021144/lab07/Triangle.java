package lap07;

import java.awt.Color;
/**
 *
 * @author Admin tam giác
 */
 public class Triangle extends Shape {
    private int[] Tx = new int[3];
    private int[] Ty = new int[3];
    public Triangle(){
       super();
    }
    public Triangle(Color color, boolean filled, int x0, int y0, int x1, int y1, int x2, int y2, int x, int y) {
        super(x, y, filled, color);
        this.Tx[0] = x0;
        this.Tx[1] = x1;
        this.Tx[2] = x2;
        this.Ty[0] = y0;
        this.Ty[1] = y1;
        this.Ty[2] = y2;
    }
     public int[] getTx() {
        return Tx;
    }
     public void setTx(int[] tx) {
        this.Tx = Tx;
    }
     public int[] getTy() {
        return Ty;
    }
     public void setTy(int[] Ty) {
        this.Ty = Ty;
    }
     public void moveTri(int x, int y) {
        this.Tx[0] = Tx[0] + x;
        this.Tx[1] = Tx[1] + x;
        this.Tx[2] = Tx[2] + x;
        this.Ty[0] = Ty[0] + y;
        this.Ty[1] = Ty[1] + y;
        this.Ty[2] = Ty[2] + y;
    }
    @Override
    public String toString(){
      
    return "Triangle: \n" +  " (" + Tx[0] +","+ Ty[0] +
                             "), (" + Tx[1] +","+ Ty[1] +
                             "), (" + Tx[2] +","+ Ty[2] +")";
                           
    }
}