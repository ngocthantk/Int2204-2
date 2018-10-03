//B2Lab03
public class PS{
  int ts;
  int ms;
  PS(){

  }
  PS(int ts, int ms){
    this.ts = ts;
    this.ms = ms;
  }

  public int ucln(int a, int b) {
    int a1 = Math.abs(a);
    int b1 = Math.abs(b);
    while (a1 != b1){
      if (a1 > b1) a1 = a1 - b1;
      else b1 = b1 - a1;
    }
    return a1;
  }

  PS rutgon(PS ps){
    int uc = ucln(ps.ts,ps.ms);
    ps.ts = ps.ts/uc;
    ps.ms = ps.ms/uc;
    return ps;
  }

  PS cong(PS ps){
    PS cong = new PS();
    cong.ts = this.ts*ps.ms + ps.ts*this.ms;
    cong.ms = this.ms*ps.ms;
    cong = rutgon(cong);
    return cong;
  }

  PS tru(PS ps){
    PS tru = new PS();
    tru.ts = this.ts*ps.ms - ps.ts*this.ms;
    tru.ms = this.ms*ps.ms;
    tru = rutgon(tru);
    return tru;
  }

  PS nhan(PS ps){
    PS nhan = new PS();
    nhan.ts = this.ts*ps.ts;
    nhan.ms = this.ms*ps.ms;
    nhan = rutgon(nhan);
    return nhan;
  }

  PS chia(PS ps){
    PS chia = new PS();
    chia.ts = this.ts*ps.ms;
    chia.ms = this.ms*ps.ts;
    chia = rutgon(chia);
    return chia;
  }

  void In(PS ps){
    if((ps.ms == 1)||(ps.ts == 0)){
      System.out.println(ps.ts);
    }
    else{
      System.out.println(ps.ts + "/" + ps.ms);
    }
  }
}
