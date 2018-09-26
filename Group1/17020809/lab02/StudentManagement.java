public class StudentManagement {
    public static void main(String[] args) {
       /*
        //6
        Student Student1 = new Student();
        Student1.setName("Huyen");
        Student1.setId("17020809");
        Student1.setGroup("INT22041");
        Student1.setEmail("huyencvper@mail.com");
        System.out.println(Student123.getName());
        Student1.getInfo();
        */
        //7,8:
        Student Student1 = new Student();
        Student1.getInfo();
        Student Student2 = new Student("Huyen","17020809","huyencvper@gmal.com");
        Student2.getInfo();
        Student Student3 = new Student(Student1);
        Student3.getInfo();
        //10
        Student s1 = new Student("sv1","17020809","INT22041","sv1@vnu.edu.vn");
        Student s2 = new Student("sv2","17020810","INT22041","sv2@vnu.edu.vn");
        Student s3 = new Student("sv3","17020876","INT22042","sv3@vnu.edu.vn");
        StudentManagement s = new StudentManagement();
           s.checkGroup(s1,s2);
           s.checkGroup(s1,s3);
           s.checkGroup(s2,s3);
    }
        public void checkGroup(Student s1, Student s2) {
            if(sameGroup(s1,s2))
                System.out.println("Cung nhom");
            else
                System.out.println("Khac nhom");
        }
        //9
        public boolean sameGroup(Student Student1, Student Student2) {
            return(Student1.getGroup().equals(Student2.getGroup()));
        }
        //11
        private Student student[] = new Student[100];
        //12
        
        }
        
        
        
      