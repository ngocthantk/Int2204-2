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
public class CamCaoPhong extends Orange{
    //init
    public CamCaoPhong(){
        super();
    }
    public CamCaoPhong(int price,String orgin,String dateOfEntry,int number){
        super(price, orgin, dateOfEntry, number);
        super.setName("CamSanh");
    }
    //ghi đè để trả về tên quả là Cam Cao Phong
    @Override
    public String getName() {
        return "CamCaoPhong";
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
public class CamCaoPhong extends Orange{
    //init
    public CamCaoPhong(){
        super();
    }
    public CamCaoPhong(int price,String orgin,String dateOfEntry,int number){
        super(price, orgin, dateOfEntry, number);
        super.setName("CamSanh");
    }
    //ghi đè để trả về tên quả là Cam Cao Phong
    @Override
    public String getName() {
        return "CamCaoPhong";
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
