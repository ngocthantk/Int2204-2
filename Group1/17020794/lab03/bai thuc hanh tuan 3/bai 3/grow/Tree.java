
public class Tree {
    private final sinhVat s;  // cây là sinh vật
    private final Evin e;       // môi trường sống cây
    private final Water w;      // nước tưới cho cây
    public Tree(boolean live, double size, double v, boolean posion, int temp, habitan h){
        this.s=new sinhVat(live, size);
        this.e=new Evin(h, temp);
        this.w=new Water(posion, v);
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
    public void setWater(double v, boolean posion){
        this.w.setV(v);
        this.w.setPosion(posion);
    }
    public Water getWater(){
        return this.w;
    }
     public Evin getEvin(){
        return this.e;
    }
        public sinhVat getSinhVat(){
        return this.s;
    }
    public void liveORdie(){
        if(this.e.getTemp()<-100||this.e.getTemp()>60){          // nếu nhiệt độ k đảm bảo
            this.s.setLive(false);
        }
        if(this.w.getPosion()==true){                            // nếu nước tưới có độc
            this.s.setLive(false);
        }
        if(this.e.getHabitan()==habitan.SEA){                    // nếu môi trường là biển
            this.s.setLive(false);
        }
        if(this.s.getLive()==false){                                 //nếu cây k tồn tại=> kích thước =0;
            this.s.setSize(0);
        }
    }                                                               // điều kiện để cây tồn tại
    public void treeGrow(){
        if(this.w.getPosion()==false){                               // nếu nước không nhiễm độc
            this.s.setSize(this.w.getV()*0.01+this.s.getSize());
        }
    }                                                              // tưới nước cho cây, cây lớn
    
}
