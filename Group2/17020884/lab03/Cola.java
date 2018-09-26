package obj;

public class Cola {
	private int status;
	
	public Cola() {
		status=100;
	}
	public void getStatus () {
		System.out.println("Have " + status + "% left");
	}
	public void refill () {
		status=100;
	}
	public void drink (int percent) {
		if (percent<=status) status -=percent;
		else System.out.println("Can't drink more than what is left");
	}
}
