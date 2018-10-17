import static java.lang.Math. *;

public class PS {
    private  int tu, mau;
    public PS(int tu, int mau){
        //ham khoi tao thong thuong
        this.tu = tu; this.mau = mau;
        this.ToiGian();
    }
    
    public void Sum(PS other){
        this.tu = this.tu * other.getMau() + this.mau *other.getTu();
        this.mau = this.mau * other.getMau();
    }
    public void Subtract(PS other){
        this.tu = this.tu * other.getMau() + this.mau * other.getTu();
        this.mau = this.mau * other.getMau();
    }
    public void Multi(PS other){
        this.tu =this.tu * other.getTu();
        this.mau = this.mau * other.getMau();
    }
    public void Divide(PS other){
        this.tu = this.tu * other.getMau();
        this.mau =this.mau * other.getTu();
    }
    public int getTu(){
        return tu;
    }
    public int getMau(){
        return mau;
    }
    
    public boolean equals(Object obj){
        if(obj instanceof PS){
            PS other = (PS) obj;
            int t1 = this.getTu();
            int m1 = this.getMau();
            int t2 = other.getMau();
            int m2 = other.getMau();
            if(abs(t1) == abs(t2) && abs(m1) == abs(m2)) return true;
            else return false;
        } else return false;   
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
    public int UCLN(int a, int b){
        //ham de quy tim UCLN cua 2 so nguyen
        int temp ,x;
        a = abs(a);
        b = abs(b);
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