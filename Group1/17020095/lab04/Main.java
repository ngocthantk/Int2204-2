package tuan4;

public class Main {
	public static void main(String args[]) {
		
	}
	
	static int max(int a,int b) {
		return (a > b)?a:b;
	}
	
	static int min( int a[] ) {
		int m = a[0];
		for(int i:a) {
			if(m > i)m = i;
		}
		return m;
	}
	
	static String bmi( double w , double h ) {
		double BMI = w /(h*h);
		if(BMI < 18.5) {
			return "Thieu can";
		}
		else if(BMI < 23) {
			return "Binh thuong";
		}
		else if(BMI < 25) {
			return "Thua can";
		}
		else {
			return "Beo phi";
		}
	}
}
