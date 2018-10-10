package lab05;

public class Main {
	public static void main(String[] args) {
		CaoPhongOrange cp = new CaoPhongOrange("10/08/2018");
		SanhOrange s = new SanhOrange("06/08/2018");
		Apple a = new Apple();
		cp.showInfo();
		s.showInfo();
		a.showInfo();
	}
}
