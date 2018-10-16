public class TestGiaovien{
  public static void main(String[] args){
    Giaovien gv = new Giaovien();
	gv.giangbai();
	gv.setTen("Truong Tam Phong");
	gv.setMonhoc("Thai cuc quyen");
	System.out.println("Thay " + gv.getTen() + " day mon " + gv.getMonhoc());
  }
}