package function3;

public class function {
	
	public static String BMI(double weight, double high) {
		double a = weight/(high*high);
		if ( a < 18.5 && a>=0 ) return "thieu can";
		else 
		if ( a>= 18.5 && a<= 23 ) return"binh thuong";
		else 
		if ( a>= 23 && a<= 24.99 ) return "thua can";
		else
		if ( a>= 25 ) return"beo phi";
	else return"";
	}
}
