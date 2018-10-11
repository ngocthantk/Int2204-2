package Fruit;

public class CamCaoPhong extends QuaCam{
     private int gia;

    public CamCaoPhong(Double soluong) {
        super(soluong);
    }
     public int getgia()
     {
        return gia;
     }
     public void setGia(int gia)
     {
         this.gia = gia;
     }
}