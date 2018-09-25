public class StudentManagement {
    public static void main (String[] args) {
/*
        Student me = new Student();
        me.setName("Leo thi thu ha");
        me.setId("17020181");
        me.setGroup("INT22042");
        me.setEmail("lethuha2410@gmail.com");
        System.out.println("Ten sv: " + me.getName());
        me.getInfo
*/
        Student sv1 = new Student();
	sv1.getInfo();
                
	Student sv2 = new Student (" Ha", " 17020181"," leothuha2410@gmail.com");
	sv2.getInfo();
                
	Student sv3 = new Student (sv1);
	sv3.getInfo();

        Student s1 = new Student("sv1", "17020181", "K62CC-INT22042", "sv1@vnu.edu.vn");
	Student s2 = new Student("sv2", "17020182", "K62CC-INT22042", "sv2@vnu.edu.vn");
	Student s3 = new Student("sv3", "17020183", "K62CA-INT22042", "sv3@vnu.edu.vn");
	
        StudentManagement s = new StudentManagement();
	s.KtraGroup(s1, s2);	
        
        
    }
    
    public boolean sameGroup(Student sv1, Student sv2) {
        return sv1.getGroup().equals(sv2.getGroup());
    }
    
    public void KtraGroup(Student s1, Student s2) {
        if (sameGroup(s1, s2) == true) {
            System.out.print("lop " + s1.getName());
            System.out.print(" Cung ");
            System.out.print("lop "+ s2.getName());
            System.out.println();
        }
        else {
            System.out.print("lop " + s1.getName());
            System.out.print(" Khac ");
            System.out.print("lop "+ s2.getName());
            System.out.println();
        }
    }
        
    private Student students[] = new Student[100];
}
            
            
	
