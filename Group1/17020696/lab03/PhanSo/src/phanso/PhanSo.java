/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author Nguyen Ba Duc
 */
public class PhanSo {
    // Tạo đối tượng phân số có 2 thuộc tính là tử số và mẫu số
    private int ts;
    private int ms;
    
    // Hàm setTs đưa giá trị vào cho tử số
    public void setTs(int a){
        ts = a;
    }
    // Hàm getTs đưa giá trị ra cho tử số
    public int getTs(){
        return ts;
    }
    
    //Hàm setMs đưa giá trị vào cho mẫu số
    public void setMs(int b){
        ms = b;
    }
    
    //Hàm getMs đưa giá trị ra cho mẫu số
    public int getMs(){
        return ms;
    }
    
    // Hàm tạo phân số
    public void phanSo(int x,int y){
       this.ts = x;
       this.ms = y;
    }
    
    // Hàm tìm ước chung lớn nhất
    public int UCLN(int a,int b){
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
    // Tối giản phân số
    public void toiGianPhanSo(){
        int i = UCLN(this.ts,this.ms);
        this.setTs(this.getTs() / i);
        this.setMs(this.getMs() / i);
    }
    
    //In phân số
    public void inPhanSo(){
        int n;
        if(ts % ms == 0){
            n = ts/ms;
            System.out.print(n);
        }
        else {
            System.out.print(ts + "/" + ms);
        }
    }
    
    //Hàm tính tổng 2 phân số
    public PhanSo congPhanSo(PhanSo a){
        int x = (a.getTs() * this.getMs()) + (a.getMs() * this.getTs());
        int y =  a.getMs() * this.getMs();
        PhanSo ps = new PhanSo();
        ps.setMs(y);
        ps.setTs(x);
        ps.toiGianPhanSo();
        return ps;
    }
    
    //Hàm trừ 2 phân số
    public PhanSo truPhanSo(PhanSo a){
        int x = (a.getTs() * this.getMs()) - (a.getMs() * this.getTs());
        int y = a.getMs() * this.getMs();
        PhanSo ps = new PhanSo();
        ps.setTs(x);
        ps.setMs(y);
        ps.toiGianPhanSo();
        return ps;
    }
    
    // Hàm nhân 2 phân số
    public PhanSo nhanPhanSo(PhanSo a){
        int x = a.getTs() * this.getTs();
        int y = a.getMs() * this.getMs();
        PhanSo ps =new PhanSo();
        ps.setTs(x);
        ps.setMs(y);
        ps.toiGianPhanSo();
        return ps;
    }
    
    // Hàm chia 2 phân số
    public PhanSo chiaPhanSo(PhanSo a){
        int x = a.getTs() * this.getMs();
        int y = a.getMs() * this.getTs();
        PhanSo ps = new PhanSo();
        ps.setTs(x);
        ps.setMs(y);
        ps.toiGianPhanSo();
        return ps;
    }
    
    // Hàm so sánh hai phân số
    public boolean equals(Object obj){
       if(obj instanceof PhanSo){
           PhanSo other = (PhanSo) obj;
           return other.getTs() * this.getMs() == other.getMs() * this.getTs();
       }
       return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a.phanSo(5,-6);
        b.phanSo(-5,6);
       
        //a.congPhanSo(b);
        //a.truPhanSo(b);
        //a.nhanPhanSo(b);
        //a.chiaPhanSo(b);
        System.out.println(a.equals(b));
    }
    
}
