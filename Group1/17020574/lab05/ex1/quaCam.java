/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Dat Anh
 */
public class quaCam extends hoaQua{
    protected String xuatxu; 
    public String getXuatXu()
    {
        return this.xuatxu;
    }
    public void setXuatXu(String x)
    {
        this.xuatxu = x;
    }
    public String getName()
    {
        return "Qua Cam";
    }
}
