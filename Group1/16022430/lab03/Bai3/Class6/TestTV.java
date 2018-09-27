public class TestTV{
  public static void main(String[] args){
    TV tv = new TV();
	tv.chieu();
	tv.setHangtv("Sony");
	tv.setKichthuoc("40 inch");
	System.out.println("Tv " + tv.getHangtv() + " co kich thuoc " + tv.getKichthuoc());
  }
}