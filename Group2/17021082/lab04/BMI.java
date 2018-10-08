public class BMI {
    public static String findBMI (double h, double w)
    {
        double BMI = w/(h*h);
        String s = "";
        if (BMI < 18.5)
            s = "Thieu can";
        if (BMI >= 18.5 && BMI <23)
            s = "Binh thuong";
        if (BMI >= 23 && BMI <25)
            s = "Thua can";
        if (BMI >= 25)
            s = "Beo phi";
        return s;
    }
}