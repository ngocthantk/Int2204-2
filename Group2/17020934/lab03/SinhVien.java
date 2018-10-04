/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenClass;

/**
 *
 * @author tuann_000
 */
public class SinhVien {
    private String Mssv,Name;
    private NgayThangNam NgaySinh;

   // Hàm Setter
    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNgaySinh(NgayThangNam NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    // Hàm Getter
     public String getMssv() {
        return Mssv;
    }

    public String getName() {
        return Name;
    }

    public NgayThangNam getNgaySinh() {
        return NgaySinh;
    }

}
