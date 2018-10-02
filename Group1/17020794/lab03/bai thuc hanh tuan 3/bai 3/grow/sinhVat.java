
public class sinhVat {
    private boolean live;// sinh vật còn sống không
    private double size;// kích cỡ sinh vật
    public sinhVat(){
        this.live=true;
        this.size=100;
    }
    public sinhVat(boolean a, double b){
        this.live=a;
        this.size=b;
    }
    public boolean getLive(){
        return this.live;
    }
    public double getSize(){
        return this.size;
    }
    public void setLive(boolean live){
        this.live=live;
    }
    public void setSize(double size){
        this.size=size;
    }
    public void biAn(sinhVat s){
        if(this.size>s.getSize()){                   //nếu kích cỡ sinh vật 1 to hơn sinh vật 2 thì sinh vật 2 bị sinh vật 1 ăn
           thucAn t=new thucAn(10);
           s.setLive(false);                        // sinh vật 2 bị ăn(k còn sống)
           this.setSize(t.getKcal(s)*0.01+this.getSize()); // sinh vật 1 hấp thụ dinh dưỡng sinh vật 2
           s.setSize(0);                            // sinh vật 2 ko còn tồn tại        
           
        }
    }// sinh vật này bị sinh vật khác ăn
   
}
