package NguyenCongNgocTuong;

public class StudentManagement {
	public static void main(String[] args) {
		Student SV = new Student();
		SV.setName("Nguyen Cong Ngoc Tuong");
		SV.setId("17021120");
		SV.setEmail("zero99ck@gmail.com");
		SV.setGroup("INT22041");
		System.out.println(SV.getName());
		System.out.println(SV.getInfo());

		Student SV2 = new Student("Nguyen Huy Viet", "17021130", "vietcc@gmail.com");
		SV2.setGroup("INT22042");
		System.out.println(SV2.getInfo());
		Student SV3 = new Student(SV);
		System.out.println(SV3.getInfo());
		StudentManagement Check = new StudentManagement();
		Check.sameGroup(SV, SV2);
		Check.arr[0] = SV;
		Check.arr[1] = SV2;
		Check.arr[2] = SV3;
		Check.studentsByGroup();
		Check.removeStudent("22041");
		for (int i = 0; i < 2; i++) {
			System.out.println(Check.arr[i].getInfo());
		}

	}

	public boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup().equals(s2.getGroup())) {
			System.out.println("YES");
			return true;
		}
		System.out.println("NO");
		return false;
	}

	public Student arr[] = new Student[100];

	public void studentsByGroup() {
		boolean KT[] = new boolean[100];
		for (int i = 0; i < 3; i++) {
			KT[i] = true;
		}
		for (int i = 0; i < 3; i++) {
			if (KT[i] == true) {
				System.out.println(arr[i].getInfo());
				KT[i] = false;
				for (int j = i + 1; j < 3; j++) {
					if (arr[i].getGroup() == arr[j].getGroup()) {
						System.out.println(arr[j].getInfo());
						KT[j] = false;
					}
				}
			}
		}
	}

	public void removeStudent(String id) {
		for (int i = 0; i < 3; i++) {
			if (id == arr[i].getId()) {
				for (int j = i; j < 3; j++)
					arr[i] = arr[i+1];
			}
		}
	}
}
