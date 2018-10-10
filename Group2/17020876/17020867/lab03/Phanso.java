package Phanso;
public class Phanso {
	private int Tuso,Mauso;
	public Phanso(){
		this.Tuso = 1;
		this.Mauso = 1;
	}
	public void setTu(int tuso){
		this.Tuso = tuso;
	}
	public void setMau(int mauso){
		this.Mauso = mauso;
	}
	public int getTu(){
		return this.Tuso;
	}
	public int getMau(){
		return this.Mauso;
	}
	public void ondinh()
	{
		if (this.getMau()<0) {this.setMau(this.getMau()*(-1)); this.setTu(this.getTu()*(-1));}
	}
	public void cong(Phanso b){
		if (this.getMau() == b.getMau()) {
			this.setTu(this.getTu() + b.getTu());
			this.ondinh();
		}
		else 
		if (this.getMau()!=b.getMau())
		{
			this.setTu( this.getTu()*b.getMau() + this.getMau()*b.getTu() );
			this.setMau( this.getMau() *b.getMau());
			this.ondinh();
		}
	}
	public void tru( Phanso b){
		if (this.getMau() == b.getMau()) {
			this.setTu(this.getTu() - b.getTu());
			this.setMau(this.getMau());
			this.ondinh();
		}
		else 
		if (this.getMau()!=b.getMau())
		{
			this.setMau(this.getMau()*b.getMau());
			this.setTu( this.getTu() * b.getMau()  - b.getTu()*this.getMau() );
			this.ondinh();
		}
	}
	public void nhan( Phanso b){
		this.setMau(this.getMau()*b.getMau());
		this.setTu(this.getTu()*b.getTu());
		this.ondinh();
	}
	public void chia( Phanso b)
	{
		this.setMau(this.getMau()*b.getTu());
		this.setTu(this.getTu()*b.getMau());
		this.ondinh();
	}
	public boolean equals (Object obj){
		if (obj instanceof Phanso)
		{
			Phanso ps1 = (Phanso) obj;
			return ( this.getTu()*ps1.getMau()-this.getMau()*ps1.getTu() == 0);
		}
		else 
			return false;			
				
	}
	public void process ( Phanso b, char operator){
		if (operator == '+')
			{
				this.cong(b);
				System.out.println(this.getTu() + "/" + this.getMau());
			}
		else 
		if (operator == '-')
			{
				this.tru(b);
				System.out.println(this.getTu() + "/" + this.getMau());
			}
		else 
		if (operator == '*')
			{
				this.nhan( b);
				System.out.println(this.getTu() + "/" + this.getMau());
			}
		else 
		if (operator == '/')
			{
				this.chia(b);
				
				System.out.println(this.getTu() + "/" + this.getMau());
			}
	}
		
}
