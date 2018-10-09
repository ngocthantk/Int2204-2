/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class HoaQua {
    protected String name;
    protected String madein;
    public HoaQua(String name, String madein){
        this.name = name;
        this.madein = madein;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMadein(){
        return madein;
    }
    public void setMadein(String madein){
        this.madein = madein;
    }
    
}
