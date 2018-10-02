public class TestOto{
  public static void main(String[] args){
    Oto oto = new Oto();
	oto.di();
	oto.setHangxe("Toyota");
	oto.setMau("Bac");
	System.out.println("Xe oto " + oto.getHangxe() + " co mau " + oto.getMau());
  }
}