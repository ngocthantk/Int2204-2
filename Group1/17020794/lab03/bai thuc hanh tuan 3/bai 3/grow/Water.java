// nước tưới cho cây
public class Water {
    private double v;// lượng nước tưới
    private boolean posion;// có độc hay ko có độc
    public Water(boolean posion, double v){
        this.posion=posion;
        this.v=v;
    } // hàm tạo
    public double getV(){
        return this.v;
    }
    public boolean getPosion(){
        return this.posion;
    }
    public void setV(double v){
        this.v=v;
    }
    public void setPosion(boolean posion){
        this.posion=posion;
    }
    
    
}
