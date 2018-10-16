package junit;

public class Junit {
    
  // kiểm tra số lớn nhất   
    public static int max(int a, int b)
    {
        if(a>b) return a;
        else return b;
    }

    
  // kiểm tra số nhỏ nhất
    public static int min(int[] a){
        int m = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<m) m = a[i];
        }
        return m;
    }
    
    // chuong trình tính chỉ số BMI
    public static String MBI(double w, double h)
    {
        double mbi = (w/(h*h)); // tính chỉ số mbi.
       if(mbi<18.5){
         return "Thieu can";
      }else if(mbi>=18.5 && mbi<23){
        return "Binh thuong";
      }else if(mbi>=23 && mbi<25){
          return "Thua can";
      }else if(mbi>=25){
          return "Beo phi";
      }
        return null;
    }
    
   
}
