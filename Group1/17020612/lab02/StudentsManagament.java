/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsManagament;

/**
 *
 * @author PC
 */
public class StudentsManagament {
    public static void main(String[] args) {
        Student myself = new Student();
        myself.setEmail("chinhpv1306@gmail.com");
        myself.setGroup("INT22042");
        myself.setId("17020612");
        myself.setName("Pham Van Chinh");
        myself.getInfo();
       
        Student studentOne = new Student();
		studentOne.getInfo();
		
		Student studentTwo = new Student("chinh" , "000", "chinh1306@gmail.com");
		studentTwo.getInfo();
		
		Student studentThree = new Student(studentOne);
		studentThree.getInfo();
		
        StudentsManagament group = new StudentsManagament();
		group.ds[0] = new Student();
		group.ds[1] = new Student(studentTwo);
	        group.ds[2] = new Student();
                group.ds[1].setGroup("INT22042");
                System.out.println(group.sameGroup(group.ds[1], group.ds[2]));
                group.studentsByGroup();
    }
    public boolean sameGroup (Student studentOne ,Student studentTwo) {
		 
		return (studentOne.getGroup().equals(studentTwo.getGroup()));
	
	}
    public Student[] ds = new Student[100];
	   int total =0;
	
    public  void studentsByGroup() {
	   	
		    String nameGroup;
			int k=0;
			this.total =0;
			  
			  while(this.ds[k]!=null) {
				  
				  this.total++;
				  k++;
			  }
			for(int i=0;i<total;i++) 
			{
			    for(int j =0;j<total -1;j++) {
				     if(this.ds[i].getGroup().compareTo(ds[j].getGroup())<0)
				{
					Student group;
					group=ds[i];
					ds[i]=ds[j];
					ds[j] =group;
                                }
		           }
			}
			nameGroup = ds[0].getGroup();
			System.out.println(nameGroup);
			for(int i=0;i<this.total;i++) {
				if(!nameGroup.equals(ds[i].getGroup())) {
					nameGroup =ds[i].getGroup();
					System.out.println(nameGroup);
				}
			ds[i].getInfo();
			}
	}

	public void removeStudent(String id) {
    	int i=0;
    	System.out.println(this.total);
       while(i<this.total) {
    	   if(id.equals(this.ds[i].getId())) {
    		   for(int j=i;j<this.total-1;j++)
    		   {
    			   ds[j]= ds[j+1];
    		   }
    		   
    		   this.total= this.total-1;
    		   ds[this.total] = null;
    		   i--;
    		   
    		   }
    	   i++;
      }
    }
}
