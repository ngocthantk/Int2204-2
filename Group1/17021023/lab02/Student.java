public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return group;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public String getInfor(){
        System.out.println("Ten: " + name);
        System.out.println("Ma sinh vien: " + id);
        System.out.println("Lop hoc: " + group);
        System.out.println("Email: " + email);

    }

    public String StudentS1(){
        Student a = new Student();

        a.name = "name";
        a.id = "000";
        a.group = "INT20041";
        a.email = "uet@n=vun.edu.vn";
    }

    public String StudenS2(String n, String i, String e){
        Student b = new Student();

        b.name = n;
        b.id = i;
        b.email = e;
        b.group = "INT20041";
    }

    public StringS(Student s){

    }
}



