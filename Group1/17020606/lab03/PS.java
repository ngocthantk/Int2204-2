public class PS {
    private  int tu, mau;
    public PS(int tu, int mau){
        //ham khoi tao thong thuong
        this.tu = tu; this.mau = mau;
        this.ToiGian();
    }
    public PS(PS ps1, PS ps2, int n){
        //ham khoi tao trong truong hop thuc hien phep tinh  phan so
        //tham so ps1, ps2 la 2 phan so, tham so n thuc hien phep tinh
        switch(n){
            case 0:
                this.tu = ps1.getTu()*ps2.getMau() + ps1.getMau()*ps2.getTu();
                this.mau = ps1.getMau()*ps2.getMau();
                //TH n = 0 thi phep khoi tao se la phep cong 2 phan so
                this.ToiGian();//sau khi khoi tao can phai toi gian phan so
                break;
            case 1:
                this.tu = ps1.getTu()*ps2.getMau() - ps1.getMau()*ps2.getTu();
                this.mau = ps1.getMau()*ps2.getMau();
                //Th n = 1 thi phep khoi tao la phep tru 2 phan so
                this.ToiGian();
                break;
            case 2:
                this.tu = ps1.getTu()*ps2.getTu();
                this.mau = ps1.getMau()*ps2.getMau();
                //Th n = 2 thi phep khoi tao la phep nhan 2 phan so
                this.ToiGian();
                break;
            case 3:
                this.tu = ps1.getTu()*ps2.getMau();
                this.mau = ps1.getMau()*ps2.getTu();
                //Th n = 3 thi phep khoi tao la phep chia 2 phan so
                this.ToiGian();
                break;
            default:
                this.tu = 0; this.mau = 0;
                break;
        }
    }
    public int getTu(){
        return tu;
    }
    public int getMau(){
        return mau;
    }
    
    public boolean equals(PS other){
        //ham so sanh 2 phan so co bang nhau khong
        int t1 = this.getTu();
        int m1 = this.getMau();
        int t2 = other.getTu();
        int m2 = other.getMau();
        if(t1 == t2 && m1 == m2) return true;
        else return false;
    }
    public void getInfo(){
        System.out.println("Gia tri cua phan so la : " + tu + "/" + mau);
    }
    public void ToiGian(){
        //ham toi gian phan so = cach chia ca tu va mau so cho UCLN
        int x = UCLN(tu,mau);
        tu /= x;
        mau /= x;
    }
    public static int UCLN(int a, int b){
        //ham de quy tim UCLN cua 2 so nguyen
        int temp ,x;
        if (a < b){
            temp = a;a = b;b = temp;  
        }
        x = a - b;//hieu 2 gia tri
        switch (x) {
            case 0:
                return a;//neu hieu 2 gia tri bang nhau mac dinh UCLN chinh la 2 so do
            case 1:
                return 1;//neu hieu 2 gia tri bang 1 thi tra ve gia tri 1
            default:
                return UCLN(b,x);//neu khac 2 truong hop tren thi de quy ham nay
                
        }  
    }
}