package exercise1;

//Lop cam cao phong
public class camCaoPhong extends quaCam
{
    private int giaBan;
//get gia ban
    public int getGiaBan() {
		return giaBan;
	}
//set gia ban
	public void setGiaBan(int giaban) {
		this.giaBan = giaban;
	}
// get ten cua lop
    public String getName()
    {
        return "Cam Cao Phong";
    }
}
