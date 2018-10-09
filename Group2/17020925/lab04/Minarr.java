package minarr;

public class Minarr {
    public static int gtnn(int a[])
    {   int k = a.length;
        int min = a[0];
        
        for(int i=0;i<a.length;i++)
        {
            if (min>=a[i])
            {
                min = a[i];
            }
        }
        return min;
    }
    
}
