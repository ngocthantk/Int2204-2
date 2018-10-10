
public class Fish{
    private final sinhVat s;          // cá là sinh vật
    private final Evin e;             // môi trường sống của cá
    private final thucAn t;            // cá là thức ăn
    public Fish(){
        this.s=new sinhVat(true ,100);
        this.e=new Evin( habitan.SEA, 30);
        this.t=new thucAn(100);
        this.t.getKcal(s);
    }
    public Fish(boolean live, double size, double kcal, int temp, habitan h){
        this.s=new sinhVat(live ,size);
        this.e=new Evin( h, temp);
        this.t=new thucAn(kcal);
        this.t.getKcal(s);
    }
    public void setSinhVat(boolean live, double size){
        this.s.setLive(live);
        this.s.setSize(size);
    }
    public void setEvin(int temp, habitan s, boolean posion){
        this.e.setHabitan(s);
        this.e.setTemp(temp);
        this.e.setPosion(posion);
    }
    public void setThucAn(double kcal){
        this.t.setKcal(kcal);
    }
    public Evin getEvin(){
        return this.e;
    }
    public thucAn getthucAn(){
        return this.t;
    }
    public sinhVat getSinhVat(){
        return this.s;
    }
    public void liveORdie(){
        if(this.e.getPosion()==true){     // nếu môi trường nhiễm độc
            this.s.setLive(false);
        }
        if(this.e.getHabitan()==habitan.LAND){  // nếu môi trường là đất
            this.s.setLive(false);
        }
        if(this.e.getTemp()<10||this.e.getTemp()>30){  // nếu nhiệt độ k đảm bảo
            this.s.setLive(false);
        }
        if(this.s.getLive()==false){              // nếu cá không tồn tại=> kích thước = 0;
            this.s.setSize(0);
        }
            
    }                                       // điều kiện cá không tồn tại được
    public void liveORdie(Fish F){
        if(this.s.getSize()>F.s.getSize()){
            this.s.biAn(F.s);
        }
    }                                         // cá gặp cá khác
    
}