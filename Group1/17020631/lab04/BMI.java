package lab04;

public class BMI {
	public static String kiemTra(float chieuCao,float canNang)
	{
		String c="";
		float bmi=canNang/(chieuCao*chieuCao);
		if(bmi<18.5f) c="thieu can";
		else if(bmi>18.5f &&bmi<23f) c="binh thuong";
		else if(bmi>23&&bmi<24.99) c="thua can";
		else c="beo phi";
		return c;
	}
}
