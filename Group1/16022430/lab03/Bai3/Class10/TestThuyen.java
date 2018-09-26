public class TestThuyen{
  public static void main(String[] args){
    Thuyen boat = new Thuyen();
	boat.boi();
	boat.setKichthuoc("Rong 2m, dai 8m");
	boat.setCannang(1000);
	System.out.println("Thuyen co kich thuoc " + boat.getKichthuoc() + " va nang " + boat.getCannang() +"kg");
  }
}