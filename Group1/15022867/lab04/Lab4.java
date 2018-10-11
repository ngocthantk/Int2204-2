
package lab4;

/**
 *
 * @author CCNE
 */
public class Lab4 {
    public static int max(int a, int b){
        if(a<b) return b;
     else return a;
    }
    public static int min(int []a){
        int  min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]< min){
                min = a[i];
            }
        }
            return min;
        }
    public static String BMI( double cannang, double chieucao){
        double BMI = cannang/(chieucao*chieucao);
        	BMI = (double)Math.round(BMI*100)/100;
        if(BMI >= 18.5 && BMI <= 22.99){
            return "Binh thuong";
        }
        else if(BMI < 18.5){
            return "Thieu can";
        }
        else if(BMI >=23 && BMI <= 24.99){
            return "Thua can";
        }
        else{
            return "Beo phi";
        }
    }   
}

   
   
    

