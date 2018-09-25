class Student {
	private String name;
	private String maSv;
	private String lop;
	private String email;

	Student(){
		name = "Student";
		maSv = "0000";
		lop = "INT22041";
		email = "uet@vnuedu.vn";	
	}

	Student(String name, String maSv, String email){
		this.name = name;
		this.maSv = maSv;
		this.email = email;
		this.lop = "INT22041";
	}

	Student(Student s){
		name = s.name;
		maSv = s.maSv;
		lop = s.lop;
		email = s.email;
	}




	public String getNname(){
		return name;
	}
	public String getLop(){
		return lop;
	}
	public String getEmail(){
		return email;
	}
	public String getMaSv(){
		return maSv;
	}

	public void setName(String name){
		this.name = name;	
	}
	public void setLop(String lop){
		this.lop = lop;	
	}
	public void setEmail(String name){
		this.email = email;	
	}
	public void setMaSv(String maSv){
		this.maSv = maSv;	
	}

	public void getInfo() {
		System.out.println(name + ", " + lop + ", " + email + ", " +maSv);

	}
}