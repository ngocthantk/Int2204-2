
public class House {
    private String diachi;
    private String color;
    private int hight;
    
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getHight() {
        return hight;
    }
    public void setHight(int hight) {
        this.hight = hight;
    }
    
    public House() {
        this.diachi = "số 1- Xuân Thủy - Cầu Giấy";
        this.color = "Xanh va Trắng";
        this.hight = 4;
    }
    
    public void Output() {
        System.out.print(diachi + " ");
        System.out.print(" có màu " + color);
        System.out.println(hight + " tầng");
    }
    // in ra dac trung cua Meo
    public void dactrungHouse() {
        System.out.println("đây cửa hàng quần áo ");   
    }
    
    public static void main(String[] args) {
        House a = new House();
        a.Output();
	a.dactrungHouse();
    }
    
}
