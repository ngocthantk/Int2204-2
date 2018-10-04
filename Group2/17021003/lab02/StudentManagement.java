public class StudentManagement {
// 6 //
public static void main(String[] args){
Student Student0 = new Student();
Student0.setName("SON");
Student0.setId("17021003");
Student0.setGmail("Phamcongsonts27@gmail.com");
Student0.setGroup("INT22041");
System.out.println (Student0.getName());
Student0.getInfo();
//8//
Student Student1 =new Student ();
Student1.getInfo();
Student Student2 = new Student ("Son","17021003","vvv@gmail.com");
Student2.getInfo();
Student Student3 = new Student (Student0);
Student3.getInfo();
//10//
Student s1 = new Student ("A","000","a1@gmail.com","INT22041");
Student s2 = new Student ("B","001","b1@gmail.com","INT22041");
Student s3 = new Student ("C","002","c1@gmail.com","INT22042");
StudentManagement s = new StudentManagement();
s.checkGroup(s1,s2);
s.checkGroup(s3,s2);
s.checkGroup(s1,s3);

}
public void checkGroup (Student s1, Student s2)
{
if (sameGroup(s1,s2))
System.out.println ("Cung lop");
else
System.out.println ("Khac lop"); 
}

//9//
public boolean sameGroup(Student s1, Student s2)
{return s1.getGroup().equals(s2.getGroup());}
//11//
public static Student arr[] = new Student[100];
//12//


}