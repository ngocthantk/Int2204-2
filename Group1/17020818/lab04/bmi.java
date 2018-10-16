package lab04;

public class bmi {
    public static String chiSoBmi(double weight, double height){
        double bmiNum = weight / (height*height);
        if(bmiNum <= 18.5) return("Thieu can");
        else if(bmiNum > 18.5 && bmiNum <= 22.99)  return("Binh thuong");
        else if(bmiNum > 22.99 && bmiNum <= 24.99) return("Thua can");
        else return("Beo phi");
    }
}