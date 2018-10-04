import java.util.Scanner;
public class Phanso {

	private int ts;
	private int ms;
	public int getTs() {
		return ts;
	}
	public void setTs(int ts) {
		this.ts = ts;
	}
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	
	public Phanso(int ts, int ms)
	{
		this.ts = ts;
		this.ms = ms;
	}
	
	public Phanso(Phanso so1, Phanso so2, String operator)
	{
		so1.minimalPhanso();
		so2.minimalPhanso();
		switch(operator)
        {
             case "+":
             {
            	this.add(so1, so2);
            	break;
             }
             case "-":
             {
            	this.sub(so1, so2);
            	break;
             }
             case "*":
             {
            	this.mul(so1, so2);
            	break;
             }
             case "/":
             {
            	this.dev(so1, so2);
            	break;
             }
        }
		
		
	}
	public void print()
	{
		System.out.println(this.getTs()+"/"+this.getMs());
	}
	public void minimalPhanso()
	{
		int min = Math.min(this.getTs(), this.getMs());
		int Ucln=1;
		for(int i = min;i>=1;i--)
		{
			if(this.getTs()%i==0&&this.getMs()%i==0)
                        {
				Ucln=i;
				break;
			}
		}
		this.ts=this.ts/Ucln;
		this.ms=this.ms/Ucln;
		this.print();
	}
	public void add(Phanso so1, Phanso so2)
	{
		this.setTs(so1.ts*so2.ms+so1.ms*so2.ts);
		this.setMs(so1.ms*so2.ms);
		this.minimalPhanso();
		
	}
	public void sub(Phanso so1, Phanso so2)
	{
		this.setTs(so1.ts*so2.ms-so1.ms*so2.ts);
		this.setMs(so1.ms*so2.ms);
		this.minimalPhanso();
		
	}
	public void mul(Phanso so1, Phanso so2)
	{
		this.setTs(so1.ts*so2.ts);
		this.setMs(so1.ms*so2.ms);
		this.minimalPhanso();
		
	}
	public void dev(Phanso so1, Phanso so2)
	{
		this.setTs(so1.ts*so2.ms);
		this.setMs(so1.ms*so2.ts);
		this.minimalPhanso();
		
	}
//so sánh 2 phân số
	public boolean equals(Phanso so1, Phanso so2)
	{
		this.sub(so1, so2);
		if(this.getTs()<0)
		{
			return false;
		}
		return true;
	}

}
