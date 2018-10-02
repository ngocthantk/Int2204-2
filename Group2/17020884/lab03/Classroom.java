package obj;

import java.util.ArrayList;

public class Classroom {
	private ArrayList<Student> students = new ArrayList<Student>();
	private Teacher teacher;
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void addNewStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(int i) {
		students.remove(i);
	}
	
	public void getTeacherInfo() {
		teacher.getInfo();
	}
	
	public void getStudentInfo() {
		for (Student x: students) {
			x.getInfo();
			System.out.println("----------------");
		}
	}
}
