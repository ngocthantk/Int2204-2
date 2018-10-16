package lab04;

public class Lab04 {
    public static int Max(int a, int b){
        if (a > b) return a ;
        else return b;
    }
    public static long findMin( long[] A){
        int i;
        int length = A.length;
        long min = A[0];
        for (i = 0; i < length; i++){
            if (A[i] <= min) min = A[i];
        }
        return min;
    }
    public static String BMI(double weight, double height ){
        double BMI;
        BMI = weight/(height*height);
        if (BMI < 18.5) return "Thieu Can";
        else if (18.5 <= BMI && BMI < 23) return "Binh Thuong";
        else if (23 <= BMI && BMI <= 24.99 ) return "Thua Can";
        return "Beo Phi";
    }
}
 
    
