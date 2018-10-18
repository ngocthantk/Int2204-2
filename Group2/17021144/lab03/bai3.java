
// lớp đối tượng con mèo
class cat {
    private int weight;  // khởi tạo các thuộc tính của mèo
    private int height;
    public cat(){ // khởi tạo constructor mặc định
        weight = 2;
        height = 1;
    }
    public cat(int weight, int height){ // khởi tạo constructor nhận tham số.
        this.weight = weight;
        this.height = height;
    }
    public int getW(){ // phương thức getw
        return weight; // trả về giá trị weight;
    }
    public void setW(int weight){ // phương thức setw
        this.weight= weight;  // tham chiếu this gọi đến biến weight;
       
    }
    public int getH(){
        return height;
    }
    public void setH(int height){
        this.height=height;
    }
}
// lớp đối tượng bông hoa.
class flower{
    private String name;  // các thuộc tính flower.
    private String color;
    public flower(){ // khởi tạo constructor mặc định
        name = "cuc";
        color = "vang";
    }
    public flower(String name, String color){ // khởi tạo constructor nhận tham số.
        this.name = name;
        this.color = color;
    }
    public String getName(){ // phương thức getName
        return name; // trả về giá trị name;
    }
    public void setName(String name){ // phương thức setName
        this.name=name;  // tham chiếu this gọi đến biến name;
       
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
// lớp đôi tượng sách
class book{
    private String ten;
    private String tacgia;
    public book(){
        ten = "lap trinh java";
        tacgia = "Trần Thị Minh Châu";
    }
    public book(String ten, String tacgia){
        this.ten = ten;
        this.tacgia = tacgia;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
}
// Lớp đối tượng con chó
class dog {
	private String name;
	private String age;
        
	public void dog() {
		name = "tin";
		age = "7";
        }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}

