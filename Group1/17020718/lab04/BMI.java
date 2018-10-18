package lap04.java;



public class BMI {
	public static String evaluate (double weight1, double height1) {
		double bmi = weight1 / (height1 * height1) ;
		String s = "";
		if (bmi<18.5) s = "Thiếu cân" ;
		if ((18.5<=bmi)&&(bmi<23)) s = "Bình thường" ;
		if ((bmi>=23)&&(bmi<25)) s =  "Thừa cân" ;
		if (bmi>25) s = "Béo phì" ;
		return s;
	}
}
