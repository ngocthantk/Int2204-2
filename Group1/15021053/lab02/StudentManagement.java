/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author CCNE
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
        Student[] students = new Student[100];
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManagement giaovien = new StudentManagement();
        Student duong = new Student();
        duong.setName("Duong");
        duong.setId("15021053");
        duong.setGroup("INT22041");
        duong.setEmail("daoduongvt971@gmail.com");
        System.out.println(duong.getName());
        System.out.println(duong.getInfo());
        Student student1 = new Student();
        student1.setId("000001");
        System.out.println(student1.getInfo());
        Student student2 = new Student(duong);
        student2.setId("000002");
        System.out.println(student2.getInfo());
        Student sinhvienkhaclop = new Student(duong);
        sinhvienkhaclop.setId("000003");
        sinhvienkhaclop.setGroup("INT22042");
        System.out.println("sinh vien cung lop: " 
                +giaovien.sameGroup(duong, student2));
        System.out.println("sinh vien khac lop: " 
                +giaovien.sameGroup(duong, sinhvienkhaclop));
        student1.setGroup("INT22045");
        giaovien.students[0] = duong;
        giaovien.students[2] = student1;
        giaovien.students[1] = student2;
        giaovien.students[4] = sinhvienkhaclop;
        giaovien.students[3] = new Student();
        giaovien.studentByGroup();
        giaovien.removeStudent("000003");
        System.out.println("sau thay doi: ");
        giaovien.studentByGroup();
    }
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public void studentByGroup(){
        int i =0, n;
        while(students[i] != null ){
            i++;
        }
        n = i;
        System.out.println(n);
        for(i = 0;i< n-1 ;i++){
            for(int j = i;j<n; j++ ){
                if (students[i].getGroup().compareTo(students[j].getGroup()) < 1){
                    Student tmp = new Student(students[i]);
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
        }
        for(i = 0;i< n ;i++){
            System.out.println(students[i].getInfo());
        }
    }
    public void removeStudent(String id){
        int i =0, n;
        while(students[i] != null ){
            i++;
        }
        n = i;
        i = 0;
        while(!students[i].getId().equals(id)&& i< n){
            i++;
        }
         if(students[i].getId().equals(id)){
                for(int j = i; j< n-1;j++)
                students[j] = students[j+1];
            }
        students[n-1] = null;
    }
}
