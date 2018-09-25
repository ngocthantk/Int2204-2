package javatest;

public class PS {
	private int numberator ;
	private int denominator ;
	
	public PS (int numbertator , int denominator ) {
		this.numberator = numbertator ;
		this.denominator= denominator ;
	}
	public PS (){
		this.numberator=1;
		this.denominator=1;
	}
	public int getNumberator() {
		return numberator;
	}
	public void setNumberator(int numberator) {
		this.numberator = numberator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public PS plus (PS ps) {
		int numberator = this.numberator*ps.getDenominator()+ ps.getNumberator()*this.denominator;
		int denominator = this.denominator*ps.getDenominator();
		PS ps1=new PS(numberator,denominator);
		return ps1;
	}
	public PS subtraction (PS ps) {
		int numberator = this.numberator*ps.getDenominator()-this.denominator*ps.getNumberator();
		int denominator =this.denominator*ps.getDenominator();
		PS ps1=new PS(numberator,denominator);
		return ps1;
	}
	public PS multiplication (PS ps ) {
		int numberator = ps.getNumberator()*this.getNumberator();
		int denominator = ps.getDenominator()*this.getDenominator();
		PS ps1=new PS(numberator,denominator);
		return ps1;
	}
	public PS devide (PS ps) {
		int numberator = this.numberator*ps.getDenominator();
		int denominator = this.denominator*ps.getNumberator();
		PS ps1=new PS(numberator,denominator);
		return ps1;
	}
	public boolean equals (Object obj ) {
		if (this == obj) 
			return true ;
		if(obj instanceof PS) {
			PS ps1 = (PS) obj ;
			return (this.numberator*ps1.denominator == this.denominator*ps1.numberator);
		}
		else return false;
	}
	public static void main (String[] args) {
		PS ps1=new PS(-3,5);
		PS ps2=new PS(3,-5);
		PS ps =ps1.subtraction(ps2);
		System.out.println(ps.getNumberator()+"/" +ps.getDenominator());
		System.out.println(ps1.equals(ps2));
	}
}
