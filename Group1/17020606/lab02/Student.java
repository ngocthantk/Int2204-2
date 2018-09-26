public class Student {
    private String name , id, group, email;
    //cac phuong thuc khoi tao (o duoi)
    public Student(){
        //phuong thuc khoi tao khong tham so
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }
    public Student(String name, String id, String email){
        //khoi tao co tham so
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K59CB";
    }
    public Student(Student s){
        //khoi tao sao chep
        name = s.GetName();
        id = s.GetID();
        email = s.GetEmail();
        group = s.GetGroup();
    }
    //cac phuong thuc Set gia tri(O duoi)
    public void SetName(String name){
        this.name = name;
    }
    public void SetID(String id){
        this.id = id;
    }
    public void SetGroup(String group){
        this.group = group;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    //cac phuong thuc Get gia tri(o duoi)
    public String GetName(){
        return name;
    }
    public String GetID(){
        return id;
    }
    public String GetGroup(){
        return group;
    }
    public String GetEmail(){
        return email;
    }
    public String GetInfo(){
        return "Name: " + name + " ID: " + id + " Group: " + group + " Email: " + email;
        
    }
}
