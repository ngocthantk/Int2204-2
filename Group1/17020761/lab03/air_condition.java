package chap03.oop;

public class air_condition {
		private String firm="Nagakawa";
		private String madeIn="Japan";
		private String rate = "400$";
		private String capacity = "9000btu/h";// cong suat suoi
		public String getFirm() {
			return this.firm;
		}
		public String getMadeIn() {
			return this.madeIn;
		}
		public String getRate() {
			return this.rate;
		}
		public void setFirm(String a) {
			this.firm = a;
		}
		public void setMadeIn(String a) {
			this.madeIn = a;
		}
		public void setRate(String a) {
			this.rate = a;
		}
		public String getCapacity() {
			return this.capacity;
		}
		public void setCapacity(String a) {
			this.capacity = a;
		}
		
		public void getInfo() {
			System.out.println("Air_condition Info : ");
			System.out.println("Firm\t\t : " + this.firm);
			System.out.println("Made In \t :" + this.madeIn);
			System.out.println("Rate \t\t : " + this.rate);
			System.out.println("Capacity \t :" + this.capacity);
		}
}
