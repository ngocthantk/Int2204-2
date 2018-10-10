package Labo4;

public class Arrmin {
			public static int min(int []a) {
			int min = a[0];
			for(int i = 0; i < a.length; i++) {		
				if(min>a[i]) {
					min = a[i];
				}
			}
			return min;
		}
	}


