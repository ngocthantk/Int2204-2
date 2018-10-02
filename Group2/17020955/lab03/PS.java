
import java.util.Scanner;

class PS{

    /**
     * @param args the command line arguments
     */
    private int TS, MS;

    PS(int TS, int MS) {
        this.TS = TS;
        this.MS = MS;
    }

    public int getTu() {
        return TS;
    }

    public void setTu(int TS) {
        this.TS = TS;
    }

    public int getMau() {
        return MS;
    }

    public void setMau(int MS) {
        this.MS = MS;
    }

    public int UCLN(int a, int b) {
        if (b==0) return a;
        else return UCLN(b,a%b);
    }
    public void toiGianPS() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }
    public void congPS(PS ps) {
        int a = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int b = ps.getMau() * this.getMau();
        PS PStong = new PS(a, b);
        PStong.toiGianPS();
        System.out.println("Cong : " + PStong.TS + " / " + PStong.MS);
    }

    public void truPS(PS ps) {
        int a = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int b = ps.getMau() * this.getMau();
        PS PShieu = new PS(a, b);
        PShieu.toiGianPS();
        System.out.println("Tru : " + PShieu.TS + " / " + PShieu.MS);
    }

    public void nhanPS(PS ps) {
        int a = this.getTu() * ps.getTu();
        int b = this.getMau() * ps.getMau();
        PS PSnhan = new PS(a, b);
        PSnhan.toiGianPS();
        System.out.println("Nhan : " + PSnhan.TS + " / " + PSnhan.MS);
    }

    public void chiaPS(PS ps) {
        int a = this.getTu() * ps.getMau();
        int b = this.getMau() * ps.getTu();
        PS PSchia = new PS(a, b);
        PSchia.toiGianPS();
        System.out.println("Chia : " + PSchia.TS + " / " + PSchia.MS);
    }

    public boolean equals(Object obj){
       if (this == obj)
       return true;
           if(obj instanceof PS){
               PS ps1 =(PS) obj;
               return (this.TS*ps1.MS == this.MS*ps1.TS);
           }
           else return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tu1 = sc.nextInt();
        int mau1 = sc.nextInt();
        int tu2 = sc.nextInt();
        int mau2 = sc.nextInt();
        PS ps1 = new PS(tu1, mau1);
        PS ps2 = new PS(tu2, mau2);
        if(ps1.MS == 0 || ps2.MS == 0) System.out.println("Error");
        else { 
        ps1.congPS(ps2);
        ps1.truPS(ps2);
        ps1.nhanPS(ps2);
        ps1.chiaPS(ps2);
        PS ps = new PS(9,10);

            System.out.println(ps2.equals(ps1));

        }
    }
}
