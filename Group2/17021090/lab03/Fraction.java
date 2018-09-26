
public class Fraction {
	private int x,y;
	//Contructors for Fraction
	Fraction(int x, int y)
	{
		if (y == 0)
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		this.x = x;	
		this.y = y;
	}
	Fraction()
	{
		x = 0;
		y = 1;
	}
	
	//Set Methods
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	//Get methods
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	//return Fraction after reduce
	public Fraction reduce()
	{
		BT1 bt1 = new BT1();
		int gcd = Math.abs(bt1.GCD(x, y));
		x/=gcd;y/=gcd;
		return this;
	}
	
	//Plus two Fractions
	public Fraction plus(Fraction f)
	{
		return new Fraction(x*f.y+f.x*y,y*f.y).reduce();
	}
	
	//Minus two Fractions
	public Fraction minus(Fraction f)
	{
		return new Fraction(x*f.y-f.x*y,y*f.y).reduce();
			
	}
	//Multiply two Fractions
	public Fraction multi(Fraction f)
	{
		return new Fraction(x*f.x,y*f.y).reduce();
	}
	//Devide two Fractions
	public Fraction devide(Fraction f)
	{
		return new Fraction(x*f.y,y*f.x).reduce();
	}
	//Print a Fraction
	public void print()
	{
		System.out.println("x = " + x +", y = " + y);
	}
	//Compare two Fractions
	@Override
	public boolean equals(Object obj) {
	    if(!(obj instanceof Fraction))
	        return false;
	    Fraction f = ((Fraction)obj);
	    this.reduce();
	    f.reduce();
	    return ((x == f.x && y == f.y) || ( x == -f.x && y == -f.y));
	}
	public static void main(String[] args)
	{
		Fraction a = new Fraction(3,-5);
		Fraction b = new Fraction(-3,5);
		a.plus(b).print();
		a.minus(b).print();
		a.multi(b).print();
		a.devide(b).print();
		System.out.println(a.equals(b));
	}
}
