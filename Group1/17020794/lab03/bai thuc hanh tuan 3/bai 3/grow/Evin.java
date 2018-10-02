// môi trường sinh sống
public class Evin {
    private int temp; // nhiệt độ môi trường
    private boolean posion;// môi trường có nhiễm độc không
    private habitan s;// loại môi trường(Land or sea)

    
    public Evin(habitan s, int temp){
       this.temp=temp;
       this.posion=false;
       this.s=s;
       
    }//hàm tạo
    public void setTemp(int temp){
        this.temp=temp;
    }
    public void setPosion(boolean posion){
        this.posion=posion;
    }
    public void setHabitan(habitan s){
        this.s=s;
    }
    public boolean getPosion(){
        return this.posion;
    }
    public int getTemp(){
        return this.temp;
    }
    public habitan getHabitan(){
        return this.s;
    }
}
