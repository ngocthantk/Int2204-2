package chap03.oop;

public class developer {
		private String name="developer";
		private String email="developer@gmail.com";
		private int age = 35;
		private int exp = 10;
		private String useLanguage ="php";
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return this.age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getExp() {
			return this.exp;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUse() {
			return this.useLanguage;
		}
		public void setUse(String useLanguage) {
			this.useLanguage = useLanguage;
		}
		public void getInfo() {
			System.out.println("Developer INFO :");
			System.out.println("- Name\t\t: "+this.name);
			System.out.println("- Age\t\t: "+this.age);
			System.out.println("- Email \t: "+this.email);
			System.out.println("- Exp \t: "+this.exp);
			System.out.println("- Language \t: "+this.useLanguage);
		}
}
