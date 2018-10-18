package lab04;

public class Lab04 {
       
    public static int maxNum(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }
    public static int minArray(int []numArr){
        int min =  numArr[0];
        for(int i = 0; i < numArr.length; i++){
            if (min > numArr[i]) min = numArr[i]; 
        }
        return min;
    }
}
