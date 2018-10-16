package blanctuan;


public class StudentManagement {
	
	public static void main(String[] args) {
		
		Student sv1 = new Student();
		
		sv1.setName("PhanVanA");
		sv1.setEmail("17021109@vnu.edu.vn");
		sv1.setGroup("INT22041");
		sv1.setId("17021109");
		sv1.getInfo();
		
		Student sv2 = new Student();
		
		sv2.getInfo();
		
		Student sv3 = new Student("PhanVanB","17021107","17021109@vnu.edu.vn");
		sv3.getInfo();
		
		Student sv4 = new Student(sv3);
		sv4.getInfo();
		System.out.println("------------------------");
		
		StudentManagement check = new StudentManagement();
		System.out.println(check.sameGroup(sv1, sv2)+"\n");
		
		StudentManagement danhsach = new StudentManagement();
		danhsach.array[0]=sv1;
		danhsach.array[1]=sv2;
		danhsach.array[2]=sv3;
		danhsach.array[3]=sv4;
		danhsach.studentsByGroup();
		System.out.println("------------------------");
		
		danhsach.removeStudent("17021109");
		
		
	}
	
	public boolean sameGroup(Student s1, Student s2) {
		if(s1.getGroup().equals(s2.getGroup()))	
			return true;
		else return false;
		}
	
	public Student array[] =  new Student[100];
	
	public void studentsByGroup() {
		boolean check[]=new boolean[4];
        for (int i=0;i<4;i++){
            check[i]=true;
        }
        for (int i=0;i<4;i++){
            if (check[i]){
            	
                array[i].getInfo();
                for (int j=i+1;j<4;j++){
                    if (array[j].getGroup() == array[i].getGroup()){
                        array[j].getInfo();
                        check[j]=false;
                    }
                }
            }
        }
	}
	public void removeStudent(String id) {
        	for(int i=0; i<4; i++) {
        		
        		if(array[i].getId().equals(id)) {
        			for(int j=i; j<3; j++) {
        				array[j]=array[j+1];
        			}
        			i--;
        		}
        	}
        }
	}
