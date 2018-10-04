package lab;

import java.util.Arrays;

public class Min {
	public static int findMin(int arr[]) {
		Arrays.sort(arr);
		return arr[0];
	}
}
