import java.util.*;

public class Fibonacci {
    private int n;
    
    public int getN() {
	return n;
    }
    public void setN(int n) {
	this.n = n;
    }
    public int find(int n) {
        if (n == 2 || n == 3)
            return 1;
        else 
            return find(n-1) + find(n-2);
    }
    public static void main(String[] args) {
        Fibonacci fi = new Fibonacci();
            fi.setN(6);
            System.out.println("So Fibonacci thu " +  fi.getN() + " la: " + fi.find(fi.getN()));
	}

}