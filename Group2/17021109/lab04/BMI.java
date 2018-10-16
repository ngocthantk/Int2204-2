package Labo4;

public class BMI {
	public static String BMI(double chieuCao, double canNang) {
		double a =  canNang/(chieuCao*chieuCao);
		if(a<18.5)						return "Thieu Can";
		else if(a>=18.5 && a<=22.99)	return "Binh Thuong";
		else if(a>=23 && a<=24.99)		return "Thua Can";
		else							return "Beo Phi";
	}		
}
