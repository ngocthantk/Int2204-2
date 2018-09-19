import java.util.Scanner;

public class StudentManagement {
	protected static int n = 3; //n = 100;
	protected static String[] name = new String[n], id = new String[n], group = new String[n], email = new String[n], sameG = new String[n], byGroup = new String[n];
	protected static boolean[] is_sameG = new boolean[n];
	static Student[] sv = new Student[n];
	
	private static Scanner inp;
    public static boolean sameGroup(Student s1, Student s2){
        if (s1.getGroup() == s2.getGroup()) return true;
        return false;
    }
	public static void studentByGroup(){
		int k = 1;
		for (int i=1; i<n; i++) {
    		is_sameG[i] = true;
    	}
    	for (int i=1; i<n; i++){
    		if(is_sameG[i]) {
	    		byGroup[k] = sv[i].getGroup();
	    		is_sameG[i] = false;
	    		for (int j=i+1; j<n; j++) {
	    			if(sv[i].getGroup() == sv[j].getGroup()) {
	    				is_sameG[j] = false;
	    			}
	    		}
	    		k++;
    		}
		}
    	for (int i=1; i<k; i++) {
    		System.out.printf("Group %s: \nSinh vien %s info: \nName: %s\nId: %s\nEmail: %s\n", byGroup[i], i, sv[i].getName(), sv[i].getId(), sv[i].getEmail());
    	}
	}
	public static void removeStudent(String id) {
		int i = 1;
		while(i < n) {
			if (sv[i].getId() == id) {
				for (int j=i; j<n-1; j++) {
					sv[j] = sv[j+1];
				}
				i--;
				sv[n-1] = null;
				n--;
			}
			i++;
		}
	}
	public static void main(String[] argv) {
		System.out.print("Info of me: \n");
		Student me = new Student("Huy", "17020802", "INT2204_2", "hstarpp292@gmail.com");
		me.getInfo();
		inp = new Scanner(System.in);
		for (int i=1; i<n; i++) {
			System.out.printf("\nEnter sv%s info: \n", i);
			System.out.printf("Enter name: \n", i);
			name[i] = inp.nextLine();
			System.out.printf("Enter id: \n", i);
			id[i] = inp.nextLine();
			System.out.printf("Enter group: \n", i);
			group[i] = inp.nextLine();
			System.out.printf("Enter email: \n", i);
			email[i] = inp.nextLine();
		}
		for (int i=1; i<n; i++) {
			sv[i] = new Student(name[i], id[i], group[i], email[i]);
			System.out.printf("sv%s Info: \n", i);
			sv[i].getInfo();
		}	
	
		studentByGroup();
	}
}
