public class PS{

  int ts, ms;
  PS(){
  }
  PS(int ts, int ms){
    this.ts = ts;
    this.ms = ms;
  }
  public int ucln(int a, int b) {
    int r;
    while (b != 0) 
    {
      r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
  PS toigian(PS ps){
    int uc = ucln(ps.ts,ps.ms);
    ps.ts = ps.ts/uc;
    ps.ms = ps.ms/uc;
    return ps;
  }

  PS tong(PS ps){
    PS pstong = new PS();
    pstong.ts = this.ts*ps.ms + ps.ts*this.ms;
    pstong.ms = this.ms*ps.ms;
    pstong = toigian(pstong);
    return pstong;
  }

  PS hieu(PS ps){
    PS pshieu = new PS();
    pshieu.ts = this.ts*ps.ms - ps.ts*this.ms;
    pshieu.ms = this.ms*ps.ms;
    pshieu = toigian(pshieu);
    return pshieu;
  }

  PS tich(PS ps){
    PS pstich = new PS();
    pstich.ts = this.ts*ps.ts;
    pstich.ms = this.ms*ps.ms;
    pstich = toigian(pstich);
    return pstich;
  }

  PS thuong(PS ps){
    PS psthuong = new PS();
    psthuong.ts = this.ts*ps.ms;
    psthuong.ms = this.ms*ps.ts;
    psthuong = toigian(psthuong);
    return psthuong;
  }

  void hienthi(PS ps){
    if((ps.ms == 1)||(ps.ts == 0)){
      System.out.println(ps.ts);
    }
    else{
      System.out.println(ps.ts + "/" + ps.ms);
    }
  }


  public boolean equals(Object obj){
	  if( obj instanceof PS){
    return(this.ts*((PS)obj).ms == ((PS)obj).ts*this.ms);
  }
  else return false;
  }
}
