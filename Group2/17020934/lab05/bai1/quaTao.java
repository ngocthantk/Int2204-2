/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuann_000
 */
public class quaTao extends hoaQua{
    private String chungLoai;
    private String muiVi;
    @Override
    public String getTenHoaQua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public quaTao(String chungLoai, String muiVi){// Hàm khỏi tạo
        super();
        this.chungLoai= chungLoai;
        this.muiVi = muiVi;
    }
    public String getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }

    public String getMuiVi() {
        return muiVi;
    }

    public void setMuiVi(String muiVi) {
        this.muiVi = muiVi;
    }
    
    
}
