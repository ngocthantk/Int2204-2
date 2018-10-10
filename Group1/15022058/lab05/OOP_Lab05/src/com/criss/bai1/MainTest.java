package com.criss.bai1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
	@Test
    public void test_bai1(){
        QuaTao qua1 = new QuaTao();
        qua1.setMauSac("red");
        qua1.setGiaTien(1000);
        assertEquals("red",qua1.getMauSac());
        assertEquals(1000,qua1.getGiaTien());

        CamSanh qua2 = new CamSanh();
        qua2.setGiaTien(5000);
        qua2.setHinhDangVo("sần sùi");
        assertEquals(5000,qua2.getGiaTien());
        assertEquals("sần sùi",qua2.getHinhDangVo());

        CamCaoPhong qua3 = new CamCaoPhong();
        qua3.setHinhDangVo("trơn nhẵn");
        qua3.setNguonGoc("Hòa Bình");
        assertEquals("sần sùi",qua3.getHinhDangVo());
        assertEquals("Nam Định",qua3.getNguonGoc());

        HoaQua qua4 = new HoaQua();
        qua4.setTen("Hoa Quả");
        qua4.setGiaTien(2000);
        qua4.setSoLuong(100);
        qua4.setNgayNhapHang("09/10/2018");
        qua4.setNguonGoc("Nghệ an");
        assertEquals("Nam Dinh",qua4.getNguonGoc());
        assertEquals(100,qua4.getSoLuong());
        assertEquals(2000,qua4.getGiaTien());
        assertEquals("Hoa Quả",qua4.getTen());
        assertEquals("18/07/2018",qua4.getNgayNhapHang());

        QuaCam qua5 =new QuaCam();
        qua5.setMauSac("orange");
        assertEquals("orange",qua5.getMauSac());
    }
}

