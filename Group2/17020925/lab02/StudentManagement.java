public class StudentManagement 
{

    public boolean sameGroup(Student s1, Student s2) 
    {
        return (s1==s2);
    }

    public Student arr[] = new Student[100];

    public void studentByGroup() 
       {
        boolean check[] = new boolean[100];
        for (int i = 0; i < 3; i++) 
        {
            check[i] = true;
        }
        for (int i = 0; i < 3; i++) 
         {
            if (check[i]) 
               {
                arr[i].getInfo();
                for (int j = i + 1; j < 3; j++) 
                   {
                    if (arr[j].getGroup().equals(arr[i].getGroup())) 
                    {
                        arr[j].getInfo();
                        check[j] = false;
                    }
                }
            }
        }
    }

    public void removeStudent(String id) 
       {
        for (int i = 0; i < 3; i++) 
          {
            if (arr[i].getId().equals(id)) 
            {
                for (int j = i; j < 2; j++) 
                {
                    arr[j] = arr[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) 
   {    
        Student Student1 = new Student();
		Student1.setName("Nghia");
		Student1.setId("17020925");
		Student1.setGroup("IE2");
		Student1.setEmail("nguyenminhnghia321999@gmail.com");
		System.out.println(Student1.getName());
		Student1.getInfo();

                Student Student1 = new Student("Nghia", "17020925", "nguyenminhnghia321999@gmail.com", "INT22042");
                Student Student2 = new Student("Phong", "1700955", "phongvan@gmail.com", "INT22041");
                Student Student3 = new Student("Ngoc", "17020893", "ngoc3d.com", "INT22041");
                StudentManagement Check = new StudentManagement();
                Check.arr[0] = Student1;
                Check.arr[1] = Student2;
                Check.arr[2] = Student3;
                Check.studentByGroup();
                Check.removeStudent("17020925");
    }
}