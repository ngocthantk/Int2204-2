package c1fruit;

public class HoaQua {
	private boolean isEatable = true;
	private final boolean growFromTree = true;
	private String growFrom = "";
	
	public HoaQua () {
		isEatable = true;
		growFrom="";
	}
	
	public void setEatable(boolean isEatable) {
		this.isEatable=isEatable;
	}
	
	public boolean getEatable() {
		return isEatable;
	}
	
	public void setTree(String treeName) {
		growFrom = treeName;
	}
	
	public String getTree() {
		return growFrom;
	}
	
	public boolean isGrowFromTree() {
		return growFromTree;
	}
	
}
