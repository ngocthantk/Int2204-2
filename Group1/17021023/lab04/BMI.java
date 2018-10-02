
public class BMI {
    public static String bmi( double weight, double hight) {
    
        String thieucan = "Thieu can";
        String binhthuong = "Binh thuong";
        String thuacan = "Thua can";
        String beophi = "Beo phi";
        double BMI = weight / (hight*hight);
         
        if (BMI < 18.5) return thieucan;
        else if ((BMI >= 18.5) && (BMI <= 22.995)) return binhthuong;
        else if ((BMI > 22.995) && (BMI <= 24.99)) return thuacan;
        else return beophi;
    }
}
