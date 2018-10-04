package chap04.oop;

public class maximum {
	public static int maximum(int x,int y) {
		if(x>y) {
			return x;
		}
		return y;
	}
	public static void main(String[] args) {
		System.out.println(maximum(1,2));
	}
}
