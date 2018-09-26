package obj;
public class MyDate{
	private int d,m,y;
	public MyDate() {
		d=1;
		m=1;
		y=2014;
		System.out.println("A new day created");
	}
	public MyDate(int d,int m, int y)
	{
		this.d =d;
		this.m =m;
		this.y =y;
	}
	public MyDate(MyDate date)
	{
		this.d =date.getDay();
		this.m =date.getMonth();
		this.y =date.getYear();
	}
	public int getYear()
	{
		return y;
	}
	public int getMonth()
	{
		return m;
	}
	public int getDay()
	{
		return d;
	}
	public void setYear(int y) {
		this.y=y;
	}
	public void setMonth(int m) {
		this.m=m;
	}
	public void setDay(int d) {
		this.d=d;
	}
	public String dayOfWeek() {
		
		String[] Day = new String[7];
		Day[0]= new String("Sunday");
		Day[1]= new String("Monday");
		Day[2]= new String("Tueday");
		Day[3]= new String("Wednesday");
		Day[4]= new String("Thusday");
		Day[5]= new String("Friday");
		Day[6]= new String("Saturday");
		int y0, m0 , d0, x;
		y0 = y - (14-m)/12;
		x = y0 + y0/4 - y0/100 + y0/400;
		m0 = m + 12*((14-m)/12) -2;
		d0 = (d+x +31*m0/12) % 7;
		return Day[d0];
	}
}
