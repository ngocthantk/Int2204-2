/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Student {
   private String name;
   private String id;
   private String group;
   private String email;
    
   public String getName(){
       return name;
   }
   public void setName(String n){
       this.name = n;
   }
   
   public String getId(){
       return id;
   }
   public void setId(String i){
       this.id = i;
   }
   
   public String getGroup(){
       return group;
   }
   public void setGroup(String g){
       this.group = g;
   }
   
   public String getEmail(){
       return email;
   }
   public void setEmail(String e){
       this.email = e;
   }
   
   public void getInfo(){
       System.out.println(this.name);
       System.out.println(this.id);
       System.out.println(this.group);
       System.out.println(this.email);
    }
  
   public void student(){
       name = "Student";
       id = "000";
       group = "INT22041";
       email = "uet@vnu.edu.vn";
   }
   
   public void student(String n,String sid,String em){
       name = n;
       id = sid;
       email = em;
       group ="INT22041";
   }
   
   public void student(Student s){
       name = s.name;
       id = s.id;
       group = s.group;
       email = s.email;
   }
}
