package exercise1;


import junit.framework.TestCase;

public class test extends TestCase {
//test cho qua tao
	public void test1(){
		quaTao a = new quaTao();
		assertEquals("Hoa Qua", a.getName());
    }
//test cho qua cam cao phong	
	public void test2(){
		camCaoPhong b = new camCaoPhong();
    	b.setGiaBan(10);
		assertEquals(10, b.getGiaBan());
		assertEquals("Cam Cao Phong", b.getName());
    }
//test cho cam sanh	
	public void test3(){
		camSanh c = new camSanh();
    	c.setSoLuong(1000);
		assertEquals(1000, c.getSoLuong());
		assertEquals("Cam Sanh", c.getName());
    }
//test cho hoa qua	
	public void test4(){
		hoaQua d = new hoaQua();
    	d.setHinhDang("Da dang");
    	d.setLoai("Qua");
		assertEquals("Da dang", d.getHinhDang());
		assertEquals("Qua", d.getLoai());
    }
//test cho qua cam	
	public void test5(){
		quaCam e = new quaCam();
    	e.setXuatXu("My");
		assertEquals("My", e.getXuatXu());
    }
	
}