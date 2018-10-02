public class TestMaybay{
  public static void main(String[] args){
    Maybay mb = new Maybay();
	mb.bay();
	mb.setTen("Boeing");
	mb.setSokhach(120);
	System.out.println("May bay " + mb.getTen() + " cho " + mb.getSokhach() + " khach");
  }
}