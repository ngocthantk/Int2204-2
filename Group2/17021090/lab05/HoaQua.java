package lab05;

public class HoaQua {

    private int pricePerKilo;
    private String origin;
    private int calories;
    private boolean rotten;
    
	public HoaQua() {

    }
    //getter and setter
    public int getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(int pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public boolean isRotten() {
		return rotten;
	}
	public void setRotten(boolean rotten) {
		this.rotten = rotten;
	}
}
