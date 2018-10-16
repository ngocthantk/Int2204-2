public class StudentManagement{

	int max = 0;		
	Student[] sv = new Student [100];

	public static void main( String[] args){
		Student hs = new Student();
		hs.setName("Nguyen Huy Viet");
		hs.setId("17021127");
		hs.setGroup("INT22041");
		hs.setEmail("17021127@vnu.edu.vn");
		hs.getInfo();
		
		Student hs1 = new Student();
		hs1.getInfo();
		
		
		Student hs2 = new Student(hs);
		hs2.getInfo();
		StudentManagement g = new StudentManagement();
		
		boolean aa = g.sameGroup(hs1, hs2);
		System.out.println(aa);

		g.sv[g.max++] = new Student("Nguyen Huy Viet", "17021127","17021127@vnu.edu.vn");
		g.sv[g.max++] = new Student("Nguyen Viet Huy", "17022177","17022177@vnu.edu.vn");
		g.sv[g.max++] = new Student("Viet Nguyen Huy", "17021217","17021217@vnu.edu.vn");
		g.sv[0].setGroup("INT22041");
		g.sv[1].setGroup("INT22042");
		g.sv[2].setGroup("INT22041");		
		g.studentsByGroup();	
		String id = "17022177";
		g.removeStudent(id);
	}
	
	public boolean sameGroup(Student s1, Student s2){
		String ss1, ss2;
		ss1 = s1.getGroup();
		ss2 = s2.getGroup();
		if(ss1.equals(ss2)) 
		 { 
			
			return true;
		 }
		
		return false;

	}


	public void studentsByGroup(){
		boolean check[]=new boolean[100];
  
        	for (int i=0; i<max; i++){
            		if (check[i] == false){
                		sv[i].getInfo();
                		for (int j=i+1;j<max;j++){
                   	 		if (sv[j].getGroup() == sv[i].getGroup()){
                      			  sv[j].getInfo();
                        		  check[j]=true;
                    }
                }
            }
        }
	}
	public void removeStudent(String id){
        for (int i = 0; i < max; i++){
			
			if (sv[i].getId() == id){
				max--;
				for(int j = i; j < max; j++){
					sv[j] = sv[j+1];
					
				}
			break;
			}
			
		}
	for (int i = 0; i < max; i++){
			sv[i].getInfo();
		 }
    }
}
	