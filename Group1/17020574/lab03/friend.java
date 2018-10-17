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
public class friend {
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
    public friend()
    {
        this.Name = "Cong";
        this.Age = "19";
    }
    public void friendInfo()
    {
        System.out.println(this.Name + " " + this.Age);
    }
}
