
public class PS
{
    private int t;
    private int m;
    public PS(){
        this.t=1;
        this.m=1;
    }
    public PS(int t, int m)
    {
        if(m!=0)
        {
            this.m=m;
        }
        this.t=t;
    }
    public int getT()
    {
        return this.t;
    }
    public int getM(){
        return this.m;
    }
    public void setT(int t){
        this.t=t;
    }
    public void setM(int m){
        this.m=m;
    }
    public void moveMinus(){
        if(this.m<0){
            this.m=-this.m;
            this.t=-this.t;
        }
    }
    public PS compactPS(){
      this.moveMinus();
      if(this.t>=0){
        Gcd s=new Gcd(this.t, this.m);
        int U=s.getGCD();
        this.t=this.t/U;
        this.m=this.m/U;
        PS ps = new PS(this.t, this.m);
        return ps;
      }
      else{
        Gcd s=new Gcd(-this.t, this.m);
        int U=s.getGCD();
        this.t=this.t/U;
        this.m=this.m/U;
        PS ps;
          ps = new PS(this.t, this.m);
          return ps;
      }
    }
    public PS plusToPS(PS ps){
        int a=this.t*ps.m+this.m*ps.t;
        int b=this.m*ps.m;
        PS sum=new PS( a,  b);
        sum=sum.compactPS();
        return sum;
    }
    public PS minusToPS(PS ps)
    {
        int a=this.t*ps.m-this.m*ps.t;
        int b=this.m*ps.m;
        PS minus = new PS(a, b);
        minus=minus.compactPS();
        return minus;
    }
    public PS mutilToPS(PS ps){
        int a=this.t*ps.t;
        int b=this.m*ps.m;
        PS mutil=new PS(a, b);
        mutil=mutil.compactPS();
        return mutil;
    }
    public PS diviToPS(PS ps){
        int a=this.t*ps.m;
        int b=this.m*ps.t;
        PS divi=new PS(a, b);
        divi.moveMinus();
        divi=divi.compactPS();
        return divi;
    }
    public boolean equals(Object obj){
        if (obj instanceof PS)
        {
            PS ps = (PS) obj;
            boolean check=false;
            int a=this.t*ps.m;
            int b=this.m*ps.t;
            if(a==b){
                check=true; 
            }
        return check;
        }
        else{
        return false;
        }
        
    }
    public void printPS(){
        System.out.println(this.t+"/"+this.m);
    }
    public static void main(String args[]){
        int a=-5, b=6;
        int c=-30, d=36;
        PS ps1=new PS(a, b);
        PS ps2=new PS(c,d);
        ps1.diviToPS(ps2).printPS();
        ps1.plusToPS(ps2).printPS();
        ps1.mutilToPS(ps2).printPS();
        System.out.println(ps1.equals(ps2));
        ps1.minusToPS(ps2).printPS();
        
    }
}