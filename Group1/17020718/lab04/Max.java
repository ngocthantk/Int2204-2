package lap04.java;

public class Max {
	public int numberone;
	public int numbertwo;
	public int getNumberone() {
		return numberone;
	}
	public void setNumberone(int numberone) {
		this.numberone = numberone;
	}
	public int getNumbertwo() {
		return numbertwo;
	}
	public void setNumbertwo(int numbertwo) {
		this.numbertwo = numbertwo;
	}
	
	public static int maxtwonumber(int first, int second) {
		if (first>second) return first;
		else return second; 
		
	}
	
}
