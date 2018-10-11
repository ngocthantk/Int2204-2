package lap05.java;

public class Hoaqua {
	public String xuatsu;
	public Hoaqua() {
		this.xuatsu = "Viet Nam" ;
	
	}
	public String getXuatsu() {
		return xuatsu;
	}
	public void setXuatsu(String xuatsu) {
		this.xuatsu = xuatsu;
	}
	public static void main(String arg[] ) {
		Hoaqua  hq = new Hoaqua();
		QuaCam qc = new QuaCam() ;
		QuaTao qt = new QuaTao();
		CamSanh cs = new CamSanh() ;
		CamCaoPhong ccp = new CamCaoPhong(); 
		System.out.println(hq.xuatsu);
		System.out.println(qc.mausac);
		System.out.println(qt.xuatsu);
		System.out.println(ccp.giaban);
		System.out.println(cs.mausac);
		
			
	}
	
	
}
