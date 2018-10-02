package lab;

public class BMI {
	public static String result(Double weight , Double hight ) {
		Double BMI = weight / hight / hight ;
		if ( BMI < 18.5) {
			return ("Thiếu cân");
		}
		else if (BMI <23) {
			return ("Bình thường");
		}
		else if (BMI <25) {
			return ("Thừa cân");
		}
		else {
			return ("Béo phì");
		}
	}
	}
