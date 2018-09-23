public class StudentManagement {
    public boolean sameGroup(Student s1,Student s2){
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } 
        else {
            return false;
        }
    }
    public Student arr[]=new Student[100];
    public void studentByGroup(){
        boolean check[]=new boolean[100];
        for (int i=0;i<3;i++){
            check[i]=true;
        }
        for (int i=0;i<3;i++){
            if (check[i]){
                arr[i].getInfo();
                for (int j=i+1;j<3;j++){
                    if (arr[j].getGroup().equals(arr[i].getGroup())){
                        arr[j].getInfo();
                        check[j]=false;
                    }
                }
            }
        }
    }
    public void removeStudent(String id){
        for (int i=0;i<3;i++){
            if (arr[i].getId()==id){
                for (int j=i;j<2;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
    }
	public static void main (String[] args) {
                Student Student1=new Student("Nha","17020940","ducnha99bn@gmail.com","INT22042");
                /*System.out.println(Student3.getName());
                Student3.getInfo();*/
		Student Student2 = new Student("Tuong","17021120","tuongckbn@gmail.com","INT22041");
                Student Student3 = new Student("Tuan","17021109","blanctuan@gmail.con","INT22042");
                StudentManagement Check =new StudentManagement();
                Check.arr[0]=Student1;
                Check.arr[1]=Student2;
                Check.arr[2]=Student3;
                Check.studentByGroup();
                Check.removeStudent("17020940");
                for(int i=0;i<2;i++)
                {
                    Check.arr[i].getInfo();
                }
             /*   if (Check.sameGroup(Student1,Student2)){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
		System.out.println(Student1.getName());*/
	}
