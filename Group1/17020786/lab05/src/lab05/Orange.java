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
public class Orange extends Fruit 
{
    //init
    public Orange(){
        super();
    }
    public Orange(int price,String orgin,String dateOfEntry,int number){
        super("Orange","berries", true, "sour,sweet", price, orgin, dateOfEntry, number);
    }
    //ghi đè để trả về tên quả là Cam
    @Override
    public String getName() {
        return "Orange";
    }
    //ghi đè để vị là chua
    @Override
    public String getTaste() {
        return "sour,sweet";
    }
    //ghi đè để trả về là có hạt
    @Override
    public boolean isSeed() {
        return true;
    }
    //ghi đề để loại quả là mọng nước
    @Override
    public String getType() {
        return "berries";
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
public class Orange extends Fruit 
{
    //init
    public Orange(){
        super();
    }
    public Orange(int price,String orgin,String dateOfEntry,int number){
        super("Orange","berries", true, "sour,sweet", price, orgin, dateOfEntry, number);
    }
    //ghi đè để trả về tên quả là Cam
    @Override
    public String getName() {
        return "Orange";
    }
    //ghi đè để vị là chua
    @Override
    public String getTaste() {
        return "sour,sweet";
    }
    //ghi đè để trả về là có hạt
    @Override
    public boolean isSeed() {
        return true;
    }
    //ghi đề để loại quả là mọng nước
    @Override
    public String getType() {
        return "berries";
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
