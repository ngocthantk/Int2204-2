public class Main{
	public static void main(String[] args){
		PS x = new PS(-6,5);
		PS y = new PS(6,-5);
		System.out.println(x.cong(y).getTS() + "/"  + x.cong(y).getMS() );
		System.out.println(x.equals(y));
	}
}

class PS{
	private int tuso , mauso;


	public PS(){
		this.tuso = 0;
		this.mauso = 1;
	}
	public PS(int tuso,int mauso){
		this.tuso = tuso;
		this.mauso = mauso;
	}

	public void setTS(int tuso){
		this.tuso = tuso;
	}
	public void setMS(int mauso){
		this.mauso = mauso;
	}

	public int getTS(){
		return tuso;
	}
	public int getMS(){
		return mauso;
	}

	public int ucln(int a,int b){
		return (b != 0)?ucln(b,a%b):a;
	}

	public PS cong(PS x){
		Main m = new Main();
		int u = ucln(x.getMS() , this.mauso);

		int ts = this.tuso*x.getMS()/u + x.getTS()*this.mauso/u;
		int ms = this.mauso*x.getMS()/u ;
		return new PS( ts , ms );
	}

	public PS tru(PS x){
		Main m = new Main();
		int u = ucln(x.getMS() , this.mauso);

		int ts = this.tuso*x.getMS()/u - x.getTS()*this.mauso/u;
		int ms = this.mauso*x.getMS()/u ;
		return new PS( ts , ms );
	}

	public boolean equals(Object obj){
		if(obj instanceof PS){
			PS other = (PS) obj;
			if( this.tru(other).getTS() == 0){
				return true;
			}
			else return false;
		}
		else {
			return false;
		}
	}
}
