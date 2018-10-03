
public class Cat {
    private String name;
    private String color;
    private int age;
    
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
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public Cat() {
        this.name = "cô mèo Bong Bong";
        this.color = "có màu Black and White";
        this.age = 5;
    }
    
    public void Output() {
        System.out.print(name + " ");
        System.out.print(color + " ");
        System.out.println(age + " tuổi");

    }
    // in ra dac trung cua Meo
    public void dactrungCat() {
        System.out.println("mèo kêu meo meo meo");   
    }
    
    public static void main(String[] args) {
        Cat a = new Cat();
        a.Output();
	a.dactrungCat();
    }
    
}
