
import java.util.Random;
public class DongXu {
    public enum face{ HINH, SO };  // xu có 2 mặt
    private face mat;              // mặt ngửa của đồng xu
    private int gia;                // mệnh giá đồng xu
    public DongXu(){
        this.mat=face.HINH;
        this.gia=1000;
    }
    public void setMat(face mat){
        this.mat=mat;
    }
    public void setGia(int gia){
        this.gia=gia;
    }
    public face getMat(){
        return this.mat;
    }
    public int getGia(){
        return this.gia;
    }
    public void gieoXu(){   // gieo đồng xu bằng lệnh random
        Random r =new Random();
        int n=r.nextInt(2);
        if(n==0){
            this.setMat(face.HINH);
        }
        if(n==1){
            this.setMat(face.SO);
        }
    }
    public void printlnXu(){
        if(this.mat==face.HINH){
            System.out.println("HINH");
        }
        else{
            System.out.println("SO");
        }
    }
    
    public static void main(String[] args) {
       DongXu D=new DongXu();
       D.gieoXu();
       D.printlnXu();
    }
    
}
