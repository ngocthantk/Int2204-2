public class StudentManagement 
{
	public Student arr[]=new Student[100];
	public boolean sameGroup(Student s1, Student s2){
		return(s1.getGroup().equals(s2.getGroup()));
	}
	public void studentsByGroup(){
		int k=0;
		while(this.arr[k]!=null)k++;
		for(int i=0;i<k;i++){
			for(int j=i+1;j<k;j++){
				if(this.arr[i].getGroup().compareTo(this.arr[j].getGroup())>0){
					Student a;
					a=this.arr[i];
					this.arr[i]=this.arr[j];
					this.arr[j]=a;
				}
			}
		}
		String gan=this.arr[0].getGroup();
		for(int i=0;i<k;i++){	
			if(this.arr[i].getGroup().equals(gan)){
				System.out.print(this.arr[i].getName());
			}
			else{
				System.out.println();
				gan=this.arr[i].getGroup();
				System.out.print(this.arr[i].getName());
			}
		}
	}
	public void removeStudent(String id){
		int k1=0;
		while(this.arr[k1]!=null)k1++;
		int vt=0;
		for(int i=0;i<k1;i++){
			if(this.arr[i].getId().equals(id))
				vt=i;
		}
		for(int i=vt;i<k1;i++){
			this.arr[i]=this.arr[i+1];
		}
		this.arr[k1-1]=null;
	}
	public static void main(String[] args){	
		Student a=new Student();
		a.setName("Cao Xuan Quang");
		a.setId("17020974");
		a.setGroup("INT22042");
		a.setEmail("cxqcxq12345@gmail.com");
		System.out.println(a.getName());
		a.getInfo();
		Student b=new Student("Vu Hai Nam","12356213","gdhsdha@gmail.com");
		Student c=new Student(b);
                StudentManagement kt=new  StudentManagement();
		System.out.print(kt.sameGroup(a,c));
	}
	
}