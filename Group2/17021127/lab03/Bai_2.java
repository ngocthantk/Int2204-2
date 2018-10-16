package tuan2;

public class Bai_2 {
	
	public static void main(String[] args) {
		PS a = new PS(-2,5);
		PS b = new PS(2,-5);
		PS g = new PS();
		g = a.cong(b);
		System.out.println(g.getT()+ " / " + g.getM());
		g = a.tru(b);
		System.out.println(g.getT()+ " / " + g.getM());
		g = a.nhan(b);
		System.out.println(g.getT()+ " / " + g.getM());
		g = a.chia(b);
		System.out.println(g.getT()+ " / " + g.getM());
		System.out.println(a.equals(b));
	}
}
