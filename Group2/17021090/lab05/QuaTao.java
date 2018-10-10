package lab05;

public class QuaTao extends HoaQua {

    private boolean wormsArePresent;
    
    public QuaTao(boolean hasWorms) {
    		wormsArePresent = hasWorms;
    }
    //getter and setter

	public boolean isWormsArePresent() {
		return wormsArePresent;
	}

	public void setWormsArePresent(boolean wormsArePresent) {
		this.wormsArePresent = wormsArePresent;
	}

}
