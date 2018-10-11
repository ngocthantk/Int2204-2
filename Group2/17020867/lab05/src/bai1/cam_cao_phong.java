package bai1;

//Lop cam cao phong
public class cam_cao_phong extends qua_cam
{
  private int giaBan;
//get gia 
  public int getGiaBan() {
		return giaBan;
	}
//set gia
	public void setGiaBan(int giaban) {
		this.giaBan = giaban;
	}
//get ten 
  public String getName()
  {
      return "Cam Cao Phong";
  }
}
