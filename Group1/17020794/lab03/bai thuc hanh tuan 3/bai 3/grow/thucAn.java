
public class thucAn{
private double kcal; //dinh dưỡng của thức ăn
public thucAn(double kcal){
    this.kcal=kcal;
}

public double getKcal(){
    return this.kcal;
}
public void setKcal(double kcal){
    this.kcal=kcal;
}
public double getKcal(sinhVat s){
    this.kcal=s.getSize()* 100; 
    return this.kcal;
}//tính lượng dinh dưỡng của sinh vật thông qua kích cỡ sinh vật
}