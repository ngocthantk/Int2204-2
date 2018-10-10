import static java.lang.Math.pow;


public class test01 {
    public static int GTLN(int a, int b){
        if(a > b) return a;
        else return b;
    }
    public static int GTNN(int a[]){
        int min = a[0];
        for(int i = 1;i < a.length;i++){
            if(a[i] < min) min = a[i];
        }
        return min;
    } 
    public static String BMI(double height, double weight){
        double bmi = weight / (pow(height,2));
        if(bmi < 18.5) return "Thieu can";
        else if(bmi >= 18.5 && bmi <= 22.995) return "Binh thuong";
        else if(bmi > 22.995 && bmi <= 24.99) return "Thua can";
        else  return "Beo phi";
    }
}