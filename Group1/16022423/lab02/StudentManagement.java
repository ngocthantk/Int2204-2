class StudentManagement{
	public static void main(String[] args) {
		Student me = new Student();
		Student clone;

		//Cau 6
		me.setName("Tien Anh");
		me.setMaSv("123123");
		me.setLop("K61N");
		me.setEmail("abc.@gmail.com");
		me.getInfo();



		//Cau 8
		me = new Student();
		me.getInfo();


		me = new Student("ABC", "123", "asfdsaf@asdf");
		me.getInfo();

		clone = new Student(me);
		clone.getInfo();	
	}
}