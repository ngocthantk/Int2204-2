/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author CCNE
 */
public class MinArr {
  public static int MinArr(int a[]){
  int min=a[0];
  for(int i=0;i<a.length;i++)
    {
        if (a[i]<a[0])
            {
                min = a[i];
            }
    }
return min;

}

    
}
