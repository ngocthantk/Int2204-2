public class baiTap {
    // hàm tình giá trị lớn nhất của 2 số
    public static int valueMax(int a, int b){
        if ( a  > b ) return a;
        else return b;
    }

    //hàm tính giá trị nhỏ nhất của 1 mảng nguyên
    public static int valueMin(int a[], int n){
        int min = a[0];
        for (int i=0 ; i < n ; i++){
            if ( a[i] < min ){
                min = a[i];
            }
        }
        return min;
    }

    // hàm tình chỉ số BMI
    public static String chiSoBMI(double high, double weight){
        double BMI = weight/(high*high);
        if (BMI < 18.5 ) return "thieu can";
        if (BMI >= 18.5 && BMI < 23 ) return "binh thuong";
        if (BMI >= 23 && BMI < 25 ) return "thua can";
        return "beo phi";
    }


    public static void main(String[] args) {
        int a=5, b=6;
        System.out.println(valueMax(a,b));

        int A[] = new int[5];
        A[0]=1;
        A[1]=2;
        A[2]=3;
        A[3]=4;
        A[4]=5;
        System.out.println(valueMin(A,5));

        System.out.println(chiSoBMI(170,64));
    }
}
