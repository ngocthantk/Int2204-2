<<<<<<< HEAD
package lab04;

public class lab04 {
	public static int max(int a,int b)
    {
        if(b>a)a=b;
        return a;
    }   
    public static int minArr(int arr[],int n)
    {
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)min=arr[i];
        }
        return min;
    }

public static String bmi(double cannang ,double chieucao)
{
    double BMI=cannang/(chieucao*chieucao);
    String ketqua=new String();
    if(BMI<18.5)ketqua="thieu can";
    if(BMI>=18.5 && BMI<23)ketqua="binh thuong";
    if(BMI>=23 && BMI <25)ketqua="thua can";
    if(BMI>=25)ketqua="beo phi";
    return ketqua;
}
}
=======
package lab04;

public class lab04 {
	public static int max(int a,int b)
    {
        if(b>a)a=b;
        return a;
    }   
    public static int minArr(int arr[],int n)
    {
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)min=arr[i];
        }
        return min;
    }

public static String bmi(double cannang ,double chieucao)
{
    double BMI=cannang/(chieucao*chieucao);
    String ketqua=new String();
    if(BMI<18.5)ketqua="thieu can";
    if(BMI>=18.5 && BMI<23)ketqua="binh thuong";
    if(BMI>=23 && BMI <25)ketqua="thua can";
    if(BMI>=25)ketqua="beo phi";
    return ketqua;
}
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
