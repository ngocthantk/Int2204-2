public class Student {
    
     private String name ;
     private String id ;
     private String group ;
     private String email ;
   
     public String getName(){
        return name;
     }
     public void setName(String n){
        this.name = n ;
     }
     public String getId(){
        return id;
     }
     public void setId(String n){
        this.id = n ;
     }
     public String getGroup(){
        return group;
     }
     public void setGroup(String n){
        this.group = n ;
     }
     public String getEmail(){
        return email;
     }
     public void setEmail(String n){
        this.group = n ;
     }
    
     Student(){}
     Student(String n , String sid , String em){
         name = n ; 
         id = sid ;
         email = em ;
         group = "INT22041";
    }
    Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
 
    void getInfo(){
       System.out.println(name + " " + id + " " + group +" " +email);
    }
}