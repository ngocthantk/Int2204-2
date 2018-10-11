public class Main{
	public static void main(String args[]){
		HoaQua hoaqua = new HoaQua();
		QuaCam quacam = new QuaCam();
		QuaTao quatao = new QuaTao();
		CamCaoPhong ccp = new CamCaoPhong();
		CamSanh cs = new CamSanh();
		
		
		System.out.println(quacam.get_mausac());
		System.out.println(quatao.get_mausac());
		System.out.println(ccp.get_mausac());
		System.out.println(ccp.get_nguongoc());
		System.out.println(cs.get_mausac());
		System.out.println(cs.get_nguongoc());
	}
}

class HoaQua{
	protected String mausac;
	protected int giaban;
	protected String nguongoc;
}

class QuaCam extends HoaQua{
	public QuaCam(){
		this.mausac = "Cam";
	}
	
	public String get_mausac(){
		return this.mausac;
	}
}

class QuaTao extends HoaQua{
	public QuaTao(){
		this.mausac = "Do";
	}
	public String get_mausac(){
		return this.mausac;
	}
}

class CamCaoPhong extends QuaCam{
	CamCaoPhong(){
		super();
		this.nguongoc = "Hoa Binh";
		this.giaban = 50000;
	}
	public String get_mausac(){
		return super.mausac;
	}
	public String get_nguongoc(){
		return this.nguongoc;
	}
	public int get_giaban(){
		return this.giaban;
	}
}

class CamSanh extends QuaCam{
	CamSanh(){
		super();
		this.nguongoc = "Trung Quoc";
		this.giaban = 20000;
	}
	public String get_mausac(){
		return super.mausac;
	}
		public String get_nguongoc(){
		return this.nguongoc;
	}
	public int get_giaban(){
		return this.giaban;
	}
}
