package tuan3;

public class evaluatedBMI {
	public static String BMI(double w, double h) {
		double bmi = w/(h*h);
		if(bmi<18.5) return "Thieu can";
		else if(18.5<=bmi && bmi<23) return "Binh thuong";
		else if(23<=bmi && bmi<25) return "Thua can";
		else return "Beo phi";
	}
}
