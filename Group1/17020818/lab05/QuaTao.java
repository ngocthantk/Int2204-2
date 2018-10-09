package lab05;

/**
 *
 * @author CCNE
 */
public class QuaTao extends HoaQua{
    protected String color;
    public QuaTao(String nguonGoc, String color) {
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