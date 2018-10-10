package lab004;

public class BMI {
	public static String sodo(double a, double b) {
		double x;
		x=a/(b*b);
		String l="tinh trang";
		if(x>0&&x<18.5) {
			l= "thieu can";
		}
		else if((x>18.5)&&(x<23)) {

			l= "binh thuong";
		}
		else if ((x>18.5)&&(x<24.99)) {
			l= "thua can";
		}
		else if(x>25) {
			l= "beo phi";
		}
		else if(x<0) {
			l= "So lieu sai";
		}
		return l;
		
	}

}
