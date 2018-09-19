import java.util.*;

public class StudentManagement{
	ArrayList<Student> students = new ArrayList<Student> (100);

	public boolean sameGroup(Student s1 , Student s2){
		return s1.getGroup().equals(s2.getGroup() );
	}

	public void studentsByGroup(){
		//Xem co nhung group nao
		Vector<String> Group = new Vector<>();
		Map<String , Integer> CheckGroup = new HashMap<>();
		for(Student s:students){
			if(CheckGroup.get(s.getGroup()) == null){
				Group.add(s.getGroup());
				CheckGroup.put(s.getGroup() , 1 );
			}
		}		
		//Duyet tung lop va in ra cac sinh vien trong lop do
		for(String g :Group){
			System.out.println("GROUP :" + g + "////////");
			for(Student s:students){
				if(s.getGroup().equals(g)){
					System.out.println(s.getInfo());
				}
			}
		}
		
	}

	public void removeStudent(String id){
		int i = 0;
		for(Student s:students){
			if( s.getId().equals(id) )break;
			++i;
		}	
		students.remove(i);
	}

	public static void main(String[] args){
		StudentManagement sm = new StudentManagement();

		//thu in ra 1 vai sinh vien va kiem tra chung co cung lop khong 
		Student s1 = new Student();
		System.out.println(s1.getInfo());
		Student s2 = new Student("Asas","123","12@12.com");
		System.out.println(s2.getInfo());
		Student s3 = new Student(s2);		
		s3.setGroup("INT3");
		System.out.println(s3.getInfo());
		System.out.println("s1 va s2 cung lop :" + sm.sameGroup(s1,s2));
		System.out.println("s1 va s3 cung lop :" + sm.sameGroup(s1,s3));
		System.out.println("-----------------------------------------------");
		
		//thu studentsByGroup
		sm.students.add(new Student("Asa","312","1@123.com"));
		sm.students.add(new Student("Ede","123","2@12.com"));
		sm.students.add(new Student("Hm","1","123@g.c"));
		sm.students.add(new Student("xyz","2","12@g.c"));
		sm.students.add(new Student("xxx","1132","12321@asdf.c"));

		sm.students.get(1).setGroup("q123123");
		sm.students.get(2).setGroup("121");

		sm.studentsByGroup();

		System.out.println("-----------------------------------------------");
		//thu removeStudent
		sm.removeStudent("312");//remove Asa
		for(Student s:sm.students){
			System.out.println(s.getInfo());
		}

	}
}
