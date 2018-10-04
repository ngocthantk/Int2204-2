package chap04.oop;

public class BMI {
	public static String BMIresult(double weigh,double tall) {
		double x = weigh / (tall*tall);
		if(x < 18.5) {
			return "Thiếu cân" ;
		} 
		if(x >= 18.5 && x <23) {
			return "Bình thường";
		}
		if(x>=23 && x < 25) {
			return "Thừa cân";
		}
		return "Béo phì";
	}
	public static void main(String[] args) {
		System.out.println(BMIresult(55,1.75));
	}
}
