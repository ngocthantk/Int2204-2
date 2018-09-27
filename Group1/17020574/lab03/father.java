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
public class father {
    private String Name;
    private String Age;
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getAge()
    {
        return Age;
    }
    public void setAge(String Age)
    {
        this.Age = Age;
    }
    public father()
    {
        this.Name = "Nguyen Dat Hien";
        this.Age = "46";
    }
    public void fatherInfo()
    {
        System.out.println(this.Name + " " + this.Age);
    }
}
