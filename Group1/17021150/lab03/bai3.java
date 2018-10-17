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
     class hocsinh{
        private String name;
        private int iq;
        private int age;

    @Override
    public String toString() {
        return "hocsinh{" + "name=" + name + ", iq=" + iq + ", age=" + age + '}';
    }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIq() {
            return iq;
        }

        public void setIq(int iq) {
            this.iq = iq;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        //in thong tin doi tuong ra man hinh
        public void infor(){
            System.out.println(this.toString());
        }
    }
   class oto{
       private String color;
       private int price;
       private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // so sanh toc do voi xe a
    public boolean nhanh(oto a){
        if (this.getSpeed()>a.getSpeed()){return true;}
        else return false;
    }

    @Override
    public String toString() {
        return "oto{" + "color=" + color + ", price=" + price + ", speed=" + speed + '}';
    }
    public oto(String x,int y,int z){
        this.color=x;
        this.price=y;
        this.speed=z;
    }
   }

   class dog{
        private int weight;
        private String name;
        private int iq;
    @Override
    public String toString() {
        return "dog{" + "weight=" + weight + ", name=" + name + ", iq=" + iq + '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    public void infor(){
        System.out.println(this.toString());
    }
    //dac diem cua doi tuong
     public void sua(){
            System.out.println("gâu");
            
        }
    //khoi tao co tham so
    public dog(String x,int y,int z){
        this.name=x;
        this.iq=y;
        this.weight=z;
    }
    }
public class bai3{
    public static void main(String[] agrs){
        dog a=new dog("cho",2,3);
      
        a.sua();
        oto oto1= new oto("red",2,5);
        oto oto2=new oto("red",3,6);
        System.out.println(oto2.nhanh(oto1));
    }
}

