package lab02;
public class StudentManagement{
	Student[] students = new Student[100];
	int count = 0;
	
	public boolean sameGroup(Student s1, Student s2){
		return s1.getGroup().equalsIgnoreCase(s2.getGroup());
	}
	public void studentsByGroup(){
		boolean[] check = new boolean[count];
		for(int i=0;i<count;i++) {
			if(check[i]==false) {
				System.out.printf("\t\tGROUP: %s \n", students[i].getGroup());
				for(int j=i;j<count;j++) {
					if(sameGroup(students[i], students[j])) {
						System.out.println(students[j].getInfor());
						check[j] = true;
					}
				}
			}
		}
	}
	public void removeStudent(String id){
      	for(int i=0;i<count;i++) {
      		if(students[i].getID().equals(id)) {
      			for(int j=i;j<count-1;j++) {
      				students[j] = students[j+1];
      			}
      			count--;
      			break;
      		}
      	}
}
	
public static void main (String[] args){
	StudentManagement st = new StudentManagement();
	st.students[st.count++] = new Student("Nguyen Thu Hang","17020724","17020724@vnu.edu.vn");
	st.students[st.count++] = new Student ("NTH","9909","nth@vnu.edu.vn");
	st.students[st.count++] = new Student ("xyz","909","xyz@vnu.edu.vn");
	st.students[st.count++] = new Student(st.students[0]);
	st.students[st.count++] = new Student();
	st.students[st.count-1].setID("099");
   	st.studentsByGroup();
    	st.removeStudent("000");
    	System.out.println("*********************AFTER REMOVING*********************");
    	st.studentsByGroup();
}
	
  }                             
                           
