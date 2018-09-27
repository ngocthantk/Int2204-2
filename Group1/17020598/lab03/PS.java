/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author CCNE
 */
public class PS {
    private int TS;
    private int MS;
public PS(){
    
}
public PS(int TS, int MS)
{
    this.TS = TS;
    this.MS = MS;
}

    public int getTS() {
        return TS;
    }

    public void setTS(int TS) {
        this.TS = TS;
    }

    public int getMS() {
        return MS;
    }

    public void setMS(int MS) {
        this.MS = MS;
    }

    public void HienThi()
    {
        System.out.println("Phan so: "+getTS()+"/"+getMS());
    }
    public int Ucln(int a, int b)
    {
        while(a!=b)
   {
       if(a>b)a = a-b;
       else b=b-a;
   }
            return (a);
    }
    public void ToiGianPS(){
        int uc = Ucln(this.getTS(),this.getMS());
        this.TS =(this.TS/uc);
        this.MS= (this.MS/uc);
    }
    public PS tong(PS ps)
    {
        PS pstong = new PS();
        pstong.TS = this.TS*getMS()+this.MS*getTS();
        pstong.MS = this.MS*getMS();
        return (pstong);
    }
    
    public PS hieu(PS ps)
    {
        PS pshieu = new PS();
        pshieu.TS= this.TS*getMS()-this.MS*getTS();
        pshieu.TS= this.MS*getMS();
        return (pshieu);
    }
    public PS tich(PS ps)
    {
        PS pstich = new PS();
        pstich.TS= this.TS*getTS();
        pstich.MS= this.MS*getMS();
        return (pstich);
    }
    
    public PS thuong(PS ps)
    {
        PS psthuong = new PS();
        psthuong.TS = this.TS*getMS();
        psthuong.MS = this.MS*getTS();
        return(psthuong);
    }
    
}
