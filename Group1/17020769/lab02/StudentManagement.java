public class StudentManagement{
   public static void main(String[] args){
       Student a = new Student();
       a.setName("Hoang");
       a.setId("17020769");
       a.setGroup("ie2"); 
       a.setEmail("hoangie2k62@gmail.com");
       a.getInfo();

       Student b = new Student();
       b.setName("Student");
       b.setId("000");
       b.setGroup("INT22041"); 
       b.setEmail("uet@vnu.edu.vn");
       b.getInfo();
  
       Student c = new Student("hoang","17020769","IE2");
       c.getInfo();
     
       Student d = new Student(c);
       d.getInfo();
   } 
}