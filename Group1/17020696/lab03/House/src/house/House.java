/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author Nguyen Ba Duc
 */
public class House {
    private String address;
    private int homenumber;
    private String direction;
    private float cost;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(int homenumber) {
        this.homenumber = homenumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public void getInfo(){
        System.out.println("Mot so thong tin nha cua ban: ");
        System.out.println("Dia chi: " + this.getAddress());
        System.out.println("So nha: " + this.getHomenumber());
        System.out.println("Huong: " + this.getDirection());
        System.out.println("Gia: " + this.getCost());
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        House h = new House();
        h.getInfo();
    }
    
}
