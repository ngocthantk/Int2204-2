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
public class monhoc {
    private String Name;
    private String Point;
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getPoint()
    {
        return Point;
    }
    public void setPoint(String Point)
    {
        this.Point = Point;
    }
    public monhoc()
    {
        this.Name = "math";
        this.Point = "9";
    }
    public void monhocInfo()
    {
        System.out.println(this.Name + " " + this.Point);
    }
}
