package obj;

public class machinePart {
	private boolean is_broken;
	
	public machinePart() {
		is_broken=false;
	}
	
	public void setStatus(boolean status) {
		is_broken= status;
	}
	
	public boolean getStatus () {
		return is_broken;
	}
}
