package tuan3.bmi;

public class evaluatedBMI {
	public static double BMI(double w, double h) {
		double bmi = w/(h*h);
		if(bmi<18.5) System.out.println("Thieu can");
		else if(18.5<=bmi && bmi<22.99) System.out.println("Binh thuong");
		else if(23<=bmi && bmi<24.99) System.out.println("Thua can");
		else System.out.println("Beo phi");
		return bmi;
	}
}
