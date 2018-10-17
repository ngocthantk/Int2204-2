import java.util.*;
class Student{
    private String name;
    private String ID;
    private String group;
    private String email;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void getInfo()
    {
        System.out.println(this.getName() + "    " + this.getID() + "    " + this.getGroup() + "    " + this.getEmail());
    }
    public Student(){
        this.name="Student";
        this.ID ="000";
        this.group ="INT22041";
        this.email ="uet@vnu.edu.vn";
    }
    public Student (String name, String ID ,String email)
    {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.group ="INT22041";
    }
    public Student(Student s){
        this.name = s.name;
        this.ID = s.ID;
        this.email = s.email;
        this.group = s.group;
    }


}
public class StudentManagement {
    public static void main(String[] args) {
        Student StudentOne = new Student();
        StudentOne.getInfo();
        Student StudentTwo = new Student("Hieu", "17020736", "17020736@vnu.edu.vn");
        StudentTwo.getInfo();
        Student studentThree = new Student(StudentOne);
        studentThree.getInfo();
        StudentManagement group = new StudentManagement();
        group.st[0] = new Student();
        group.st[1] = new Student(StudentTwo);
        group.st[2] = new Student();
        group.studentsByGroup();
    }
    public boolean SameGroup (Student StudentOne ,Student StudentTwo) {

        return (StudentOne.getGroup() == StudentTwo.getGroup());

    }
    public Student[] st = new Student[100];
        int total = 0;

    public void studentsByGroup() {
        String nameGroup;
        int k = 0;
        this.total = 0;

        while(this.st[k]!= null) {
            this.total++;
            k++;
        }
        for(int i=0; i< total; i++)
        {
            for(int j =0; j< total-1; j++) {
                if(this.st[i].getGroup().compareTo(st[j].getGroup())>0)
                {
                    Student group;
                    group = st[i];
                    st[i]= st[j];
                    st[j] =group;
                }
            }
        }
        nameGroup = st[0].getGroup();
        System.out.println(nameGroup);
        for(int i=0; i<this.total; i++) {
            if(nameGroup != st[i].getGroup()) {
                nameGroup = st[i].getGroup();
                System.out.println(nameGroup);
            }
            st[i].getInfo();
        }
    }
}
