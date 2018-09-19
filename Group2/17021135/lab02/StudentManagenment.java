/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Le Quang Vu
 */
public class StudentManagenment {
    private Student[] students = new Student[100];
    private int n=0;
    public void studentByGroup(){
       boolean[] check = new boolean[n];
       for(int i=0; i<n;i++) {
           if(check[i]==false) {
               System.out.println("GROUP: " + students[i].getLopHoc());
               for(int j=i;j<n;j++) {
                   if(sameGroup(students[j], students[i])) {
                       System.out.println(students[j].getInfo());
                       check[j] = true;
                   }
               }
           }
       }
    }
    public void removeStudent(String id){
        for(int i=0;i<n;i++){
            if(students[i].getMasv().equals(id)) 
            {
                for(int j=i;j<n-1;j++)
                {
                students[i]=students[i+1];
                }
                n--;
                i--;
        }
    }
    }
   public static void main(String args[]) {
       Student S1 = new Student();
       S1.setHoTen("LeQuangVu");
       S1.setLopHoc("INT22044");
       S1.setMasv("17021135");
       S1.setEmail("lim15051999@gmail.com");
       System.out.println(S1.getInfo());
       
       Student S2 = new Student();
       System.out.println(S2.getInfo());
       Student S3 = new Student("LeQuangVu","17021135","uet@vnu.edu.vn");
       System.out.println(S3.getInfo());
       Student S4 = new Student(S3);
       System.out.println(S4.getInfo());
       StudentManagenment group = new StudentManagenment();
       group.students[group.n++] = S1;
       group.students[group.n++] = S2;
       group.students[group.n++] = S3;
       group.students[group.n++] = S4;
       System.out.println(group.sameGroup(S1, S2));
       group.removeStudent("1702135");
       group.studentByGroup();
    }
   public boolean sameGroup(Student s1,Student s2){
       return s1.getLopHoc().equals(s2.getLopHoc());
   }
}
