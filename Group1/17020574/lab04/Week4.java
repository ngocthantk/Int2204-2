/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author Dat Anh
 */
public class Week4 {
    public static int findMax(int number1, int number2)
    {
        if(number1 >= number2)
            return number1;
        else
            return number2;
    }

    public static int findMin(int[] inputArray)
    {
        int i;
        int length = inputArray.length;
        int min = inputArray[0];
        for(i = 0; i < length; i++)
        {
            if(inputArray[i] < min)
                min = inputArray[i];
        }
        return min;
    }

    public static String BMI(double height, double weight)
    {
        double BMI = weight / (height * height);
        String output;
        if(BMI < 18.5)
        {
            System.out.println("Thieu can");
            output = "Thieu can";
        }
        else if(BMI > 18.5 && BMI < 23)
        {
            System.out.println("Binh thuong");
            output = "Binh thuong";
        }
        else if(BMI > 23 && BMI < 25)
        {
            System.out.println("Thua can");
            output = "Thua can";
        }
        else
        {
            System.out.println("Beo phi");
            output = "Beo phi";
        }
        return output;
    }
}

