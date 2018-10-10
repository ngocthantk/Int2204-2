package bmi;

public class BMI {

    public static String bm(double can, double cao)
    {
        double cs = can/(cao*cao);
        String s= "";
        if(cs <18.5)
        {
            s = "Thiếu cân";
        }
        if(cs>=18.5&&cs<23)
        {
            s = "Bình thường";
        }
        if(cs>=23 && cs<=25)
        {
            s = "Thừa cân";
        }
        if(cs>25)
        {
            s = "Béo phì";
        }
        return s;
    }
    
}
