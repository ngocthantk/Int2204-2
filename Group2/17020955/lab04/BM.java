package javaapplication1;

public class BM {
    public static String BM(double a, double b){
        double result = b/(a*a);
        if(result < 18.5){
            return "Thiếu cân";
            
        }
        else if(result <23){
            return "Bình thường";
        }
        else if(result < 25){
            return "Thừa cân";
        }
        else{
            return "Béo phì";
        }
    }
    
}

