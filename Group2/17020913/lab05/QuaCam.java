
public class QuaCam extends  HoaQua {
	public String Tinhchat;
	


	 void ShowInfo() {
		 System.out.println("\t\t\t Gia tien:  " + Giatien );
		 System.out.println("\t\t\t Nguongoc:  " + Nguongoc );
		 System.out.println("\t\t\t  Soluong:  " + Soluong );
		 System.out.println("\t\t\t Mausac:  " + Mausac );
		 System.out.println("\t\t\t Tinhchat:  " + Tinhchat );

		 
	 }


	public String getTinhchat() {
		return Tinhchat;
	}


	public void setTinhchat(String tinhchat) {
		Tinhchat = tinhchat;
	}
};
