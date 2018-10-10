package tu.phamanh;
public class QuaTao extends HoaQua {
	    private String color;

	    // Constructor
	    public QuaTao() {
	        this.name = "Qua Tao";
	        this.taste = "ngot, xop, thom";
	        this.saleprice = 17;
	        this.color = "green";
	    }

	    public String getColor() {
	        return this.color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }
	    public String toString() 
	    {
	       
	        return super.toString() + " Color:" + this.color;
	    }
	}

