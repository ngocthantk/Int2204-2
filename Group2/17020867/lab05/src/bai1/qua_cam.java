package bai1;

//Lop qua Cam
public class qua_cam extends hoa_qua
{
  private String xuatxu;
//get xuat xu 
  public String getXuatXu()
  {
      return this.xuatxu;
  }
//set xuat xu 
  public void setXuatXu(String x)
  {
      this.xuatxu = x;
  }
//get ten cua lop
  public String getName()
  {
      return "Qua Cam";
  }
}
