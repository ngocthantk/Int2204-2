package obj;

public class Guitar {
	private boolean is_played;
	private char[] tune;
	
	public Guitar() {
		tune= new char[6];
		tune[0]='E'; //standard tuning
		tune[1]='A';
		tune[2]='D';
		tune[3]='G';
		tune[4]='B';
		tune[5]='e';
		is_played=false;
	}
	
	public void play() {
		is_played=true;
	}
	
	public void stop() {
		is_played=false;
	}
	
	public boolean status() {
		return is_played;
	}
	
	public void getTune() {
		for (int i=0;i<6;i++)
			System.out.println(tune[i]);
	}
	
	public void tune(char s6, char s5, char s4, char s3, char s2, char s1 ) {
		tune[0]=s6;
		tune[1]=s5;
		tune[2]=s4;
		tune[3]=s3;
		tune[4]=s2;
		tune[5]=s1;
	}
	
}
