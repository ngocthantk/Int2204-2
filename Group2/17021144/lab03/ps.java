
package ps;

public class ps {
   // khởi tạo 2 thuộc tính.
    public int tu;
    public int mau;
    public ps(){
        tu=1;
        mau=1;
    }
    public void setTu(int tu){
        this.tu = tu;
    }
    public int getTu(){
        return tu;
    }
    public void setMau(int mau){
        this.mau = mau;
    }
    public int getMau(){
        return tu;
    }
    public ps(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
// Hàm nhân 2 phân số.
    ps nhanPS(ps p){
        ps n = new ps();
        n.tu = p.tu*this.tu;
        n.mau = p.mau*this.mau;
        return n;
    }
// Hàm chia 2 phân số
    ps chiaPS(ps p){
        ps c = new ps();
        c.tu = p.tu*this.mau;
        c.mau = p.mau*this.tu;
        return c;
    }
// Hàm cộng 2 phân số
    ps congPS(ps p){
        ps co = new ps();
        co.tu = p.tu *this.mau + p.mau*this.tu;
        co.mau = p.mau *this.mau;
        return co;
    }
// Hàm trừ 2 phân số
    ps truPS(ps p){
        ps t = new ps();
        t.tu = p.tu *this.mau - p.mau*this.tu;
        t.mau = p.mau*this.mau;
        return t;
    }
// Tính ucln dùng để rút gọn 2 phân sô.
    public int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
    if(a==0 && b!=0){
        return 0;
    }else{
        while(a!=b){
    if(a>b)
        a=a-b;
    else
        b = b - a;
    }
       return a;}
    }
// Hàm rút gọn 2 phân sô.
    public void rut() {
      int u = UCLN(tu,mau);
      this.tu = getTu()/u;
      this.mau = getMau()/u;
    }
// Kiểm tra 2 phân số có bằng nhau.
    public boolean equals(Object obj) {
		if(this == obj)
		   return true;
		if(obj instanceof ps) {
	           ps p = (ps) obj;
	        return(this.tu*p.mau == this.mau*p.tu);
		}else return false;	  
	}
// Hàm in ra phân số.
    public void in(){
        if(tu==0){
            System.out.println(0);
        }else if(tu==mau){
            System.out.println(1);
        }else if(tu==(-mau)){
            System.out.println(-1);
        }else{ 
        if(this.mau<0 ){
		this.tu *=-1;
		this.mau *=-1;
	    }
        System.out.println(this.tu+ "/" +this.mau);
        }
    }
// hàm main.
    public static void main(String[] args){
        ps p1 = new ps(1,2);
        ps p2 = new ps(-1,2);
        System.out.print("phân số p1 = ");
        p1.in();
        System.out.print("phân số p2 = ");
        p2.in();
        System.out.println("kiểm tra 2 phân số là: " + p1.equals(p2));  
        
        System.out.println("kết quả: cộng trừ nhân chia lần lượt là");
          
        ps cong = p1.congPS(p2);
        cong.in();
        ps tru = p1.truPS(p2);
        tru.in(); 
        ps nhan = p1.nhanPS(p2);
        nhan.in();
        ps chia = p1.chiaPS(p2);
        chia.in();
    }
}



