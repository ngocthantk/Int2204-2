/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituong;

/**
 *
 * @author Dat Anh
 */
public class group {
    private String Name;
    private String Siso;
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getSiso()
    {
        return Siso;
    }
    public void setSiso(String Siso)
    {
        this.Siso = Siso;
    }
    public group()
    {
        this.Name = "K62_cc";
        this.Siso = "80";
    }
    public void groupInfo()
    {
        System.out.println(this.Name + " " + this.Siso);
    }
}
