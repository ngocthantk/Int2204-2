public class TestSinhvien{
  public static void main(String[] args){
    Sinhvien sv = new Sinhvien();
	sv.lambai();
	sv.setTen("nguyen van dung");
	sv.setMsv("16022430");
	System.out.println("Sinh vien " + sv.getTen() + " co ma sinh vien la " + sv.getMsv());
  }
}