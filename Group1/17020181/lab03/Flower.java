
public class Flower {
    private String name;
    private String color;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    public Flower() {
        this.name = "Hoa Hồng";
        this.color = "đỏ";
    }
    
    public void Output() {
        System.out.print(name + " ");
        System.out.print(color + " ");
    }
    
    public void dactrungFlower() {
        System.out.println("toa huong thom va rat dep");   
    }
    
    public static void main(String[] args) {
        Flower a = new Flower();
        a.Output();
	a.dactrungFlower();
    }
    
}
