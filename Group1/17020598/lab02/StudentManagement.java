/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author AnhTam
 */
public class StudentManagement {
    public static void main (String[] args){
        Student s = new Student();
        s.setName("VU ngoc anh");
        s.setId("1101");
        s.setEmail("Vuanh11-6");
        s.setGroup("ie2");
        s.getInfo();
        Student s1 = new Student();
        s1.getInfo();
		
        Student s2 = new Student("Vu Ngoc Anh" , "000", "Vuanh11061999@gmail.com");
	s2.getInfo();
		
	Student s3 = new Student(s);
	s3.getInfo();
	StudentManagement Group = new StudentManagement();
        Group.sv[0] = new Student();
	Group.sv[1]=new Student(s2);
	Group.sv[2]=new Student();
    }
    
    public Student[] sv = new Student[100];
    
    public boolean sameGroup (Student s1 ,Student s2) {
		 
        return (s1.getGroup().equals(s2.getGroup()));}
}
