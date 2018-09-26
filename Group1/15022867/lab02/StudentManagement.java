/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author CCNE
 */
public class StudentManagement {
    public static void main(String[] args) {
        StudentManagement giangvien= new StudentManagement();
       Student thaokhi = new Student();
       thaokhi.setName("thao");
       thaokhi.setId("17022867");
       thaokhi.setGroup("K62CC");
       thaokhi.setEmail("doanthao37@gmail.com");
       System.out.println(thaokhi.getName());
       System.out.println(thaokhi.getInfo());
       Student thaokhi1 = new Student("hihi","123","thao@gmail.com");
       Student thaokhi2 = new Student(thaokhi);
       Student thaokhi3 = new Student();
       thaokhi3.setName("thao3");
       thaokhi3.setId("17022867");
       thaokhi3.setGroup("INT22041");
       thaokhi3.setEmail("doanthao37@gmail.com");
       Student thaokhi4 = new Student();
       thaokhi4.setName("thao4");
       thaokhi4.setId("17022867");
       thaokhi4.setGroup("INT22041");
       thaokhi4.setEmail("doanthao37@gmail.com");
        Student thaokhi5 = new Student();
       thaokhi5.setId("17022867");
       thaokhi5.setGroup("INT22042");
       thaokhi5.setEmail("doanthao37@gmail.com");
       System.out.println (giangvien.sameGroup(thaokhi4, thaokhi5));
       System.out.println (giangvien.sameGroup(thaokhi3, thaokhi4));
    }
private Student[] students = new Student[100];
public boolean sameGroup(Student s1,Student s2){
    if (s1.getGroup() == s2.getGroup()) return true;
    else return false;
}
}
