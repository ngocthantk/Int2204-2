
public class Friend {
    private String name;
    private String boyOrgirl;
    private int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBoyOrGirl() {
        return boyOrgirl;
    }
    public void setBoyOrGirl(String boyOrgirl) {
        this.boyOrgirl = boyOrgirl;
    }
    
    public Friend(){
        this.name = "Nguyen Ky Duyen";
        this.boyOrgirl = "girl";
        this.age = 19;
    }
    
    public void Output() {
        System.out.print(boyOrgirl + " ");
        System.out.print(name + " ");
        System.out.println(age + " tuổi");

    }
    public void dactrungFriend() {
        System.out.println("cô ấy học ở Học viện Ngân hàng");
    }
    
    public static void main(String[] args) {
        Friend me = new Friend();
        me.Output();
        me.dactrungFriend();
        
    }
}
