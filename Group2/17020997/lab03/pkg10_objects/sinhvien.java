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
public class sinhvien {

    private String name, mssv;
    int age;

    public void setName(String n) {
        this.name = n;
    }

    public void setMssv(String m) {
        this.mssv = m;
    }

    public void setAge(int n) {
        this.age = n;
    }

    public String getMssv() {
        return this.mssv;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
    public int NamSinh()
    {
        return 2018 - this.age;
    }
}
