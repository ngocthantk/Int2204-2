public class TestConmeo{
  public static void main(String[] args){
    Conmeo cm = new Conmeo();
	cm.keu();
	cm.setCannang(10);
	cm.setTen("Oggy");
	System.out.println(cm.getTen() + " nang " +cm.getCannang() + "kg");
  }
}