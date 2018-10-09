package Fruit;
import java.util.Date;
public class CamSanh extends QuaCam{
      private Date ngaynhap;

    public CamSanh(Double soluong) {
        super(soluong);
    }
       public Date getNgaynhap()
        {
            return ngaynhap;
        }
       public void set(Date ngaynhap)
       {
            this.ngaynhap = ngaynhap;
       }
}