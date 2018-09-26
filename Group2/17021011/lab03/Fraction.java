package oop;

public class Fraction {
	private int numerator;
    private int denominator;
    
    // Constructor
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }
    
    // Getter, setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero!");
        }
        this.denominator = denominator;
    }
    
    // Calculates gcd of two numbers
    public int gcd(int numenator, int denominator) {
    	if(denominator == 0) return numenator;
    	return gcd(denominator, numenator%denominator);
    }
    
    // Reduce the fraction to lowest form
    public void reduce() {
    	int gcd = gcd(numerator,denominator);
    	numerator /= gcd;
    	denominator /= gcd;
    }
    
    // Operations
    public Fraction add(Fraction other) {
    	int nume = this.numerator*other.getDenominator()+(this.denominator*other.getNumerator());
    	int deno = this.denominator*other.getDenominator();
    	return new Fraction(nume,deno);
    }
    public Fraction subtract(Fraction other) {
    	int nume = this.numerator*other.getDenominator()-(this.denominator*other.getNumerator());
    	int deno = this.denominator*other.getDenominator();
    	return new Fraction(nume,deno);
    }
    public Fraction multiply(Fraction other) {
    	int nume = this.numerator*other.getNumerator();
    	int deno = this.denominator*other.getDenominator();
    	return new Fraction(nume,deno);
    }
    public Fraction divide(Fraction other) {
    	int nume = this.numerator*other.getDenominator();
    	int deno = this.denominator*other.getNumerator();
    	return new Fraction(nume,deno);
    }
    // Returns string representation of the fraction
    public String toString() {
    	if(this.denominator == 1) return "" + this.numerator;
    	if(this.denominator < 0) {
    		this.denominator *= -1;
    		this.numerator *= -1;
    	}
    	return this.numerator + "/" + this.denominator;
    }
    
    public boolean equals(Object obj) {
    	if(!(obj instanceof Fraction)) return false;
    	Fraction f = (Fraction)obj;
    	if((this.numerator != f.numerator) || (this.denominator != f.denominator)) return false;
    	return true;
    }
    
    public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(50,100);
		System.out.println("f1 equals f2 ? " + f1.equals(f2));
		System.out.println("Fraction 1: " + f1.toString());
		System.out.println("Fraction 2: " + f2.toString());
		Fraction f3 = f1.add(f2);
		System.out.println(f1.toString() + " + " + f2.toString() + " = " + f3.toString());
		f3 = f1.subtract(f2);
		System.out.println(f1.toString() + " - " + f2.toString() + " = " + f3.toString());
		f3 = f1.multiply(f2);
		System.out.println(f1.toString() + " * " + f2.toString() + " = " + f3.toString());
		f3 = f1.divide(f2);
		System.out.println(f1.toString() + " : " + f2.toString() + " = " + f3.toString());
	}
}
