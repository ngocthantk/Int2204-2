/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PS;

/**
 *
 * @author CCNE
 */
public class PS {
    private int ts;
    private int ms;
	public int getts() {
		return ts;
	}
	public void setts(int ts) {
		this.ts = ts;
	}
	public int getms() {
		return ms;
	}
	public void setms(int ms) {
		this.ms = ms;
	}
	
	public PS(int ts, int ms)
	{
		this.ts=ts;
		this.ms=ms;
	}
	
	public PS(PS numberOne, PS numberTwo, String operator)
	{
		numberOne.toigian();
		numberTwo.toigian();
		switch(operator)
        {
             case "+":
             {
            	this.add(numberOne, numberTwo);
            	break;
             }
             case "-":
             {
            	this.sub(numberOne, numberTwo);
            	break;
             }
             case "*":
             {
            	this.mul(numberOne, numberTwo);
            	break;
             }
             case "/":
             {
            	this.dev(numberOne, numberTwo);
            	break;
             }
        }
		
		
	}
	//Tạo phần hiển thị phân số ra màn hình
	public void print()
	{
		System.out.println(this.getts()+"/"+this.getms());
	}
	//Tối giản phân số
	public void toigian()
	{
		int min = Math.min(Math.abs(this.getts()),Math.abs(this.getms()) );
		int Ucln=1;
		for(int i = min;i>=1;i--)
		{
			if(this.getts()%i==0&&this.getms()%i==0)
			{
				Ucln=i;
				break;
			}
		}
		this.ts=this.ts/Ucln;
		this.ms=this.ms/Ucln;
		this.print();
	}
	//phép cộng
	public void add(PS numberOne, PS numberTwo)
	{
		this.setts(numberOne.ts*numberTwo.ms+numberOne.ms*numberTwo.ts);
		this.setms(numberOne.ms*numberTwo.ms);
		this.toigian();
		
	}
	//phép trừ
	public void sub(PS numberOne, PS numberTwo)
	{
		this.setts(numberOne.ts*numberTwo.ms-numberOne.ms*numberTwo.ts);
		this.setms(numberOne.ms*numberTwo.ms);
		this.toigian();
		
	}
	//phép nhân
	public void mul(PS numberOne, PS numberTwo)
	{
		this.setts(numberOne.ts*numberTwo.ts);
		this.setms(numberOne.ms*numberTwo.ms);
		this.toigian();
		
	}
	//phép chia
	public void dev(PS numberOne, PS numberTwo)
	{
		this.setts(numberOne.ts*numberTwo.ms);
		this.setms(numberOne.ms*numberTwo.ts);
		this.toigian();
		
	}
 
        //so sánh 2 phân so
        public boolean equals(Object obj)
        {
            if(obj instanceof PS)
            {
                PS a=(PS) obj;
                double x=(double)this.ts/(double)this.ms;
                double y=(double)a.ts/(double)a.ms;
                return x==y;
            }
            else return false;
        }
}      
