
public class Main {
	public static void main(String[] args) {
		CamCaoPhong cam= new CamCaoPhong();
		cam.ShowInfo();
		System.out.println();
		cam.setGiatien(100);
		cam.setMausac("Da cam");
		cam.setNguongoc("Ha nam");
		cam.setTinhchat("Ngon ");
		cam.setSoluong(1000);
		cam.setHSD("12/23/12222");
		cam.ShowInfo();
	}

}
