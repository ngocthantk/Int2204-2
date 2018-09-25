package chap03.oop;

public class operatorFraction {
	public static void main(String[] args) {
		Fraction x = new Fraction(4,5);
		Fraction y = new Fraction(2,3);
		x.sumF(y).getIf();
		x.minusF(y).getIf();
		x.mutiplyF(y).getIf();
		x.divisionF(y).getIf();
	}
}
