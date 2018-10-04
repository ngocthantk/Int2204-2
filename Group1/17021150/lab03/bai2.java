/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;
/**
 *
 * @author admin
 */

    /*lop phan so co ban*/
    class ps{
        private int ts;
        private int ms;

        public int getTs() {
            return ts;
        }

        public int getMs() {
            return ms;
        }

        public void setTs(int ts) {
            this.ts = ts;
        }

        public void setMs(int ms) {
            this.ms = ms;
        }
        public void inps(){
            System.out.println(this.ts+"/"+this.ms);
        }
    /*ham khoi tao co tham so*/
        
  public  ps(int tu,int mau)
  {
      this.ts=tu;
      this.ms=mau;
  }
  //ham cong tru nha chia va so sanh voi phan so a
    public void congps(ps a){
      int tg;
      tg= this.getMs();
      this.setMs(a.getMs()*this.getMs());
      this.setTs(a.getTs()*tg+a.getMs()*this.getTs());
  }
     public void trups(ps a){
      int tg=this.getMs();
      this.setMs(a.getMs()*this.getMs());
      this.setTs(a.getMs()*this.getTs()-a.getTs()*tg);
 
  }
  public void nhanps(ps a){
     
      this.setTs(a.getTs()*this.getTs());
      this.setMs(a.getMs()*this.getMs());
     
  }
   public void chiaps(ps a){
     
      this.setTs(a.getMs()*this.getTs());
      this.setMs(a.getTs()*this.getMs());
  }
   public boolean equals(Object obj){
      if (obj instanceof ps){
          ps a=(ps) obj;
          this.trups(a);
          if(this.getTs()==0) return true;
                  else return false;
      }
      else return false;
  }
      /* ham tim ucln */
   public  int ucln(int x,int y){
    int kq; 
      if ((x>1)&&(y>1)){
    while ((x>0)&&(y>0)){
     if(x>=y){x=x-y;}
else {y=y-x;}
    }
}
   if(x!=0){kq=x;}else{kq=y;}
   return(kq);
}
      /*ham toi gian phan so   */
   public void toigian(){
       int tg=ucln(this.getTs(),this.getMs());
      this.setTs(this.getTs()/tg);
      this.setMs(this.getMs()/tg);
   }


    }
public  class bai2 {
 


  public static void main(String[] args){
      ps a=new ps(2,5);
      ps b=new ps(3,5);
      if ((a.getMs()==0)||(b.getMs()==0)){
              System.out.println("mau so phai khac khong");}
      else{
      a.inps();
      b.inps();
      a.congps(b);
      a.toigian();
      a.inps();
     //System.out.println(a.equals(b));
     // a.nhanps(b);
     
   }
  }
}