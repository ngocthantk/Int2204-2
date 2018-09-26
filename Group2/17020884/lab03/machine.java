package obj;

import java.util.ArrayList;

public class machine {
	private boolean is_running, is_broken;
	private ArrayList<machinePart> parts = new ArrayList<machinePart>();
	
	public machine() {
		is_running= false;
		is_broken= false;
	}
	
	public void setRunning (boolean is_running) {
		this.is_running = is_running;
	}
	
	public void setBrokenStatus (boolean brokenStatus) {
		is_broken = brokenStatus;
		if (is_broken) is_running=false;
	}
	
	public boolean isRunning () {
		return is_running;
	}
	
	public boolean isBroken() {
		return is_broken;
	}
	
	public void addNewPart(machinePart newPart) {
		if (newPart.getStatus()) {
			parts.add(newPart);
		}
		else {
			parts.add(newPart);
			is_running=false;
			is_broken=true;
		}
	}
	
	public void removePart(int i) {
		parts.remove(i);
	}
	
	public void setPart(int pos,machinePart newPart) {
		parts.set(pos, newPart);
	}
}
