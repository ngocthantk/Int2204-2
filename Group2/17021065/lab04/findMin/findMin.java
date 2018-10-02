package tuan3.findMin;

public class findMin {
	public static int min(int arr[], int size) {
		int min = arr[0];
		for(int i=0; i<size; i++) {
			if(arr[i]<=min) min = arr[i];
		}
		return min;
	}
}
