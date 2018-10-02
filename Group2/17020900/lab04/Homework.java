package minh.dim;

public class Homework {

	public static int Maxa_b(int a,int b) { // tìm max 2 số a và b
		return Math.max(a, b);
	}
	public static int MaxArray(int a[]) {   // tìm phần tử nhỏ nhất trong mảng a
		int leng = a.length;
		if(leng == 0) {
			return 0;
		} else {
			int min = a[0];
			for(int i = 1;i < leng;i++) {
				if(min > a[i]) {
					min = a[i];
				}
			}
			return min;
		}
		
	}
	public static String NumberBMI(double weight, double height) {   // hàm đánh giá chỉ số BMI
		double BMI = weight/(height*height);
		if(BMI < 18.5) {
			return "Thiếu cân";
		} else if(BMI < 23) {
			return "Bình thường";
		} else if(BMI < 24.99) {
			return "Thừa cân";
		} else {
			return "Béo phì";
		}
	}
	public static void main(String[] args) {
		int[] a = {5,6,7};
		System.out.println(Maxa_b(5,6));
		System.out.println(MaxArray(a));
		System.out.println(NumberBMI(60, 1.65));
	}

}
