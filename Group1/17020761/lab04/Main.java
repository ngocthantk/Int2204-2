package chap04.oop;

public class Main {
	public static int findmin(int a[]) {
		int findMin = a[0];
		for(int i=1;i<a.length;i++) {
			if(findMin > a[i])
			{
				findMin =a[i];
			}
		}
		return findMin;
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println(findmin(a));
	}
}
