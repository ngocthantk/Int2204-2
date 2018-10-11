<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Liscli
 */
public class Apple extends Fruit{
    //init
    public Apple(int price,String orgin,String dateOfEntry,int number){
        super("Apple", "single", true, "sugary", price, orgin, dateOfEntry, number);
    }
    // trả về tên quả
    @Override
    public String getName() {
        return "Apple";
    }
    // trả về vị giác
    @Override
    public String getTaste() {
        return "sugary";
    }
    // có hạt hay không?
    @Override
    public boolean isSeed() {
        return true;
    }
    // trả về loại của quả
    @Override
    public String getType() {
        return "single";
    }
}   
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Liscli
 */
public class Apple extends Fruit{
    //init
    public Apple(int price,String orgin,String dateOfEntry,int number){
        super("Apple", "single", true, "sugary", price, orgin, dateOfEntry, number);
    }
    // trả về tên quả
    @Override
    public String getName() {
        return "Apple";
    }
    // trả về vị giác
    @Override
    public String getTaste() {
        return "sugary";
    }
    // có hạt hay không?
    @Override
    public boolean isSeed() {
        return true;
    }
    // trả về loại của quả
    @Override
    public String getType() {
        return "single";
    }
}   
>>>>>>> 8698251a186993be093e172d03823408519eb608
