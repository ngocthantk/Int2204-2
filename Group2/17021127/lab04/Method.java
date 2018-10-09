package lab4;

public class Method {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minarr(int a[], int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static String BMI(double weight, double height) {
        double bmi = weight / (height * height);
        String s = "";
        if (bmi < 18.5) {
            s = "Thiếu cân";
        }
        if ((18.5 <= bmi) && (bmi < 23)) {
            s = "Bình thường";
        }
        if ((bmi >= 23) && (bmi < 25)) {
            s = "Thừa cân";
        }
        if (bmi > 25) {
            s = "Béo phì";
        }
        return s;
    }

}
