//B3Lab03
public class Dog{
    //Khoi tao doi tuong can nang
    private int cannang;
    //Khoi tao doi tuong ten
    private String ten;
    //Tieng keu dac trung
    public void sound(){
        System.out.println("Gau gau");
    }
    //Set gia tri cho can nang
     void setCannang(int n){
       this.cannang = n;
    }
    //Lay gia tri can nang
    int getCannang(){
      return this.cannang;
    }

    //Set gia tri cho ten
    void setTen(String n){
                this.ten = n;
    }

    //Lay ten
    String getTen(){
        return this.ten;
    }
}
