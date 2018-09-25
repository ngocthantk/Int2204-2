public class StudentManagement{
	public Student students[] = new Student[100];
	public boolean sameGroup(Student s1, Student s2){                   // compare two element
		return s1.getGroup().equals(s2.getGroup());
	}
	public void studentByGroup(){						// sort and print
		int k=0;
		while(this.students[k]!=null){
			k++;
		}
		for(int i=0; i<k; i++){
			for(int j=0; j<k; j++){
				if(this.students[i].getGroup().compareTo(this.students[j].getGroup()) > 0){
					Student a;
					a=this.students[i];
					this.students[i]=this.students[j];
					this.students[j]=a;
				}
			}
		}
		String g=this.students[0].getGroup();
		System.out.println(g+":");
		for(int i=0; i<k; i++){
			if(this.students[i].getGroup().equals(g)){
				System.out.println(this.students[i].getName());
			}else{
				g=this.students[i].getGroup();
				System.out.println(g);
				System.out.println(this.students[i].getName());
			}	
		}
	}
	public void removeStudent(String id){					// delete a element
		int k=0;
		int pos=0;
		while(this.students[k]!=null){
			k++;
		}
		for(int i=0; i<k; i++){
			if(this.students[i].getID().equals(id)){
				pos=i;
			}
		}
		for(int i=pos; i<k; i++){
			this.students[i]=this.students[i+1];
		}
		this.students[k-1]=null;
	}
	public static void main(String[] args){
		Student s = new Student();
		s.setName("Dang Tran Toan");
		s.setID("17020165");
		s.setGroup("INT22042");
		s.setEmail("sieogiti7272@gmail.com");
		String n = s.getName();
		System.out.println(s.getName());
		s.getInfo();
		
		Student s1 = new Student();
		Student s2 = new Student("Nguyen Van A", "10014869", "new@yahoo.com.vn");
		Student s3 = new Student(s2);
		s1.getInfo();
	 	s2.getInfo();
		s3.getInfo();	
		
		StudentManagement sm = new StudentManagement();
		System.out.println(sm.sameGroup(s1, s2));
		System.out.println(sm.sameGroup(s1, s3));
	}
}