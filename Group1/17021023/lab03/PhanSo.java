
public class PhanSo {
    private int tuso;
    private int mauso;
    
    public void setTuSo(int tu) {
        this.tuso = tu;
    }
    private int getTuSo(){
        return tuso;
    }
    
    private void setMauSo( int mau) {
        this.mauso = mau;
    }
    private int getMauSo() {
        return mauso;
    }
    
    
    public static int UocChung(int a, int b) {
        if ( b == 0) return a;
        else return UocChung(b, a % b);
    }
    
    
    public static void CongPS( int aTu, int aMau, int bTu, int bMau) {
        int UocChung = UocChung(aMau, bMau);
        int MSC = (aMau*bMau)/UocChung;
        int tu = (aTu*(MSC/aMau)) + bTu*(MSC/bMau);
        System.out.println("Ket qua phep cong phan so la: " + tu + "/" + MSC);
    }
    
    public static void TruPS( int aTu, int aMau, int bTu, int bMau){
        int UocChung = UocChung(aMau, bMau);
        int MSC = (aMau*bMau)/UocChung;
        int tu = (aTu*(MSC/aMau)) - bTu*(MSC/bMau);
        System.out.println("Ket qua phep tru phan so la: " + tu + "/" + MSC);   
    }
    
    public static void NhanPS( int aTu, int aMau, int bTu, int bMau){
        int tu = aTu * bTu;
        int mau = aMau * bMau;
        System.out.println("Ket qua phep nhan phan so la: " + tu + "/" + mau);   
    }
    
    public static void ChiaPS( int aTu, int aMau, int bTu, int bMau){
        int tu = aTu * bMau;
        int mau = aMau * bTu;
        System.out.println("Ket qua phep chia phan so la: " + tu + "/" + mau);   
    }
    
    public static boolean equals( int aTu, int aMau, int bTu, int bMau){
        int UocChung = UocChung(aMau, bMau);
        int MSC = (aMau*bMau)/UocChung;
        int Atu = aTu*(MSC/aMau);
        int Btu = bTu*(MSC/bMau);
        boolean result = ( Atu == Btu);
        return result;
    }
    
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.setTuSo(5);
        a.setMauSo(3);
        
        PhanSo b = new PhanSo();
        b.setTuSo(3);
        b.setMauSo(7);
        
        int aTu = a.getTuSo();
        int aMau = a.getMauSo();
        int bTu = b.getTuSo();
        int bMau = b.getMauSo();
        CongPS( aTu, aMau, bTu, bMau);
        TruPS( aTu, aMau, bTu, bMau);
        NhanPS( aTu, aMau, bTu, bMau);
        ChiaPS( aTu, aMau, bTu, bMau);
        boolean result = equals( aTu, aMau, bTu, bMau);
        if( result == true) {
            System.out.println("Hai phan so bang nhau.");
        }
        else {
            System.out.println("Hai phan so khong bang nhau.");
        }
    } 
}
