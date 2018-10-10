package lab05;

public class QuaCam extends HoaQua{
	protected String color;
    public QuaCam(String nguonGoc, String color) {
        super(nguonGoc);
        setColor(color);
    }
   
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
