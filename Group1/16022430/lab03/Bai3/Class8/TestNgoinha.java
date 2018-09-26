public class TestNgoinha{
  public static void main(String[] args){
    Ngoinha ho = new Ngoinha();
	ho.mocua();
	ho.setDiachi("Nui Vo Dang");
	ho.setDientich(12000);
	System.out.println("Phai Vo Dang o tren " + ho.getDiachi() + " rong " + ho.getDientich() + " hecta");
  }
}