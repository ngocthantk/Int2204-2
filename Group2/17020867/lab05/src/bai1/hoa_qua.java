package bai1;

//Lop hoa Qua
public class hoa_qua
{
  private String loai;
  private String hinh_dang;
//get loai 
  public String getLoai()
  {
      return this.loai;
  }
//get hinh dang 
  public String getHinhDang()
  {
      return this.hinh_dang;
  }
//set loai 
  public void setLoai(String l)
  {
      this.loai = l;
  }
//set hinh dang 
  public void setHinhDang(String hd)
  {
      this.hinh_dang = hd;
  }
//get ten cua lop
  public String getName()
  {
      return "Hoa Qua";
  }
}

