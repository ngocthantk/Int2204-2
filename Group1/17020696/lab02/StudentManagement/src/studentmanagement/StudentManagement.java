
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
public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    
    /*public static void studentByGroup(){
        
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        s.setName("Nguyễn Bá Đức");
        s.setId("17020696");
        s.setGroup("INT22041");
        s.setEmail("herohachk99@gmail.com");
        
        s.getInfo();
        
        Student s1 = new Student();
        s1.student();
        s1.getInfo();
        
        Student s2 = new Student();
        s2.student("Nguyen Van A","110","110@gmail.com");
        s2.getInfo();
        
        Student s3 = new Student();
        s3.student(s3);
        s3.getInfo();
        
        Student s4 = new Student();
        s4.student("Nguyen Van B","112","112@gmail.com");
        s4.getInfo();
        
        Student s5 = new Student();
        s5.student("Nguyen Van C","113","113@gmail.com");
        s5.getInfo();
        
        Student s6 = new Student();
        s6.setName("Nguyen Van D");
        s.setId("114");
        s.setGroup("INT22042");
        s.setEmail("114@gmail.com");
        
        System.out.println("s5 va s6 cung nhom:" + sameGroup(s4,s5));
        System.out.println("s5 va s6 cung nhom:" + sameGroup(s4,s6));
        System.out.println("s5 va s6 cung nhom:" + sameGroup(s5,s6));
    }
    
    Student[] sv = new Student[100];
    
}
