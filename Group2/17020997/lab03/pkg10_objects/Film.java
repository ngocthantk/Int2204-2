/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_objects;

/**
 *
 * @author MyPC
 */
public class Film {
    String name, country, time;
    public void setName(String ten)
    {
        this.name = ten;
    }
    public void setCountry(String quocgia)
    {
        this.country = quocgia;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public String getTime(){
        return this.time;
    }
}
