package student;
import java.util.Scanner;

public class StudentManagement {
    public boolean sameGroup(Student s1,Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public static void main(String[] args){
        Student sv = new Student();
        sv.setName("Nguyễn Bá Đức");
        sv.setMssv("17020696");
        sv.setGroup("N1");
        sv.setEmail("herohack99@gmail.com");
        System.out.println(sv.getName());
        sv.getInfo();
        
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String sid = input.nextLine();
        String em = input.nextLine();
       
        sv.Student();
        sv.Student(n,sid,em);
    }
}
