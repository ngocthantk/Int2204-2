package rectangular;
public class rectangular {

	private int length;//dài
	private int width;//rộng
	private int height;//cao
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public rectangular() {
		this.setLength(6);
		this.setWidth(4);
		this.setHeight(5);
	}
	//tính thể tích
	public int volume()
	{
		int volume=this.getHeight()*this.getLength()*this.getWidth();
		return volume;
	}

	public static void main(String[] args) {
		rectangular a = new rectangular();
		System.out.println(a.volume());

	}


}
