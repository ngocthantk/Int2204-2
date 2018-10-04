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
public class MuonSach {
    private SinhVien sv;
    private NgayThangNam NgayMuon;
    private String MaSach;
    // Hàm Setter
    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setNgayMuon(NgayThangNam NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }
    //Hàm Getter

    public SinhVien getSv() {
        return sv;
    }

    public NgayThangNam getNgayMuon() {
        return NgayMuon;
    }

    public String getMaSach() {
        return MaSach;
    }
    
    
}
