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
public class CamSanh extends Orange{
    //init
    public CamSanh(){
        super();
    }
    public CamSanh(int price,String orgin,String dateOfEntry,int number){
        super(price, orgin, dateOfEntry, number);
        super.setName("CamSanh");
    }
    //ghi đè để trả về tên quả là Cam Sành
    @Override
    public String getName() {
        return "CamSanh";
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
public class CamSanh extends Orange{
    //init
    public CamSanh(){
        super();
    }
    public CamSanh(int price,String orgin,String dateOfEntry,int number){
        super(price, orgin, dateOfEntry, number);
        super.setName("CamSanh");
    }
    //ghi đè để trả về tên quả là Cam Sành
    @Override
    public String getName() {
        return "CamSanh";
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
