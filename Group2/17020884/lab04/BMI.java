package t4;

public class BMI {
	public static String BMIresult(double weight, double height) {
		double bmi = weight/ (height*height);
		if (bmi<18.5) {
			return "Thiếu cân";
		}
		else if (bmi<23) {
			return "Bình thường";
		}
		else if (bmi<25) {
			return "Thừa cân";
		}
		return "Béo phì";
	}
}
