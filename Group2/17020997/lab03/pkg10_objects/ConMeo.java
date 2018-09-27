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
public class ConMeo {
    private 
            String  type ;
            int height, age;
    void setType(String t)
      {
          this.type  = t;
      }
    void setHeight(int t)
      {
          this.height  = t;
      }
    void setAge(int t)
      {
          this.age  = t;
      }
    String getType()
    {
        return this.type;
    }
    int getHeight(){
        return this.height;
    }
    int getAge(){
        return this.age;
    }
    void setCat(String type, int hei, int age)
    {
        this.type = type;
        this.height = hei;
        this.age = age;
    }
}
