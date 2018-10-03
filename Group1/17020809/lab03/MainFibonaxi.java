import java.util.Scanner;

public class MainFibonaxi {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		Fibonaxi number =new Fibonaxi();
		number.setN(n);
		System.out.println(number.find());
		
	}

}
