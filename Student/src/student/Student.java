package student;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
   
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setMssv(String m){
        id = m;
    }
    public String getMssv(){
        return id;
    }
    public void setGroup(String l){
        group = l;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String k){
        email = k;
    }
    public String getEmail(){
        return email;
    }
    
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.email);
    }   
      
    public void Student(){
//        Student sv1 = new Student();
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    
    public void Student(String n,String sid,String em){
//       Student sv2 = new Student();
       name = n;
       id = sid;
       email = em;
       group = "INT22041";
    }
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}

    
    