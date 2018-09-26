package task3;
//xây dựng class hình vuông
public class square {

	private int side;//cạnh

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	public square() {
		this.setSide(5);
	}
	//tính diện tích hình vuông
	public int acreage()
	{
		int acreage=this.getSide()*this.getSide();
		return acreage;
	}

}
