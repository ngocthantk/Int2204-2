package obj;

public class PowerBank {
	private int power;
	
	public PowerBank() {
		power=100;
	}
	public void getPowerLevel () {
		System.out.println("Have " + power + "% left");
	}
	public void charging () {
		power = 100;
	}
	public void use (int percent) {
		if (percent<=power) power -=percent;
		else System.out.println("Out of power");
	}
}
