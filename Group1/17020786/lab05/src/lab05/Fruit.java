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
public class Fruit{
    private String name; // tên quả
    private String type; // Quả đơn,quả tụ,quả phức,quả mọng, quả giả
    private boolean seed;//quả có hạt
    private String taste;// vị
    private int price;//giá
    private String orgin;// nguồn gốc
    private String dateOfEntry; //ngày nhập
    private int number; //số lượng
    //init
    public Fruit(){
        type = "";
        seed = true;
        taste = "";
        price = 0;
        orgin = "";
        dateOfEntry = "";
        number = 0;
    }
    public Fruit(String name,String type,boolean seed,String taste,int price,String orgin,String dateOfEntry,int number){
        this.name = name;
        this.type = type;
        this.seed = seed;
        this.taste = taste;
        this.price = price;
        this.orgin = orgin;
        this.dateOfEntry = dateOfEntry;
        this.number = number;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @return the dateOfEntry
     */
    public String getDateOfEntry() {
        return dateOfEntry;
    }
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    /**
     * @return the orgin
     */
    public String getOrgin() {
        return orgin;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    //
    /**
     * @param dateOfEntry the dateOfEntry to set
     */
    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * @param orgin the orgin to set
     */
    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @param seed the seed to set
     */
    public void setSeed(boolean seed) {
        this.seed = seed;
    }
    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the seed
     */
    public boolean isSeed() {
        return seed;
    }
    //
    
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
public class Fruit{
    private String name; // tên quả
    private String type; // Quả đơn,quả tụ,quả phức,quả mọng, quả giả
    private boolean seed;//quả có hạt
    private String taste;// vị
    private int price;//giá
    private String orgin;// nguồn gốc
    private String dateOfEntry; //ngày nhập
    private int number; //số lượng
    //init
    public Fruit(){
        type = "";
        seed = true;
        taste = "";
        price = 0;
        orgin = "";
        dateOfEntry = "";
        number = 0;
    }
    public Fruit(String name,String type,boolean seed,String taste,int price,String orgin,String dateOfEntry,int number){
        this.name = name;
        this.type = type;
        this.seed = seed;
        this.taste = taste;
        this.price = price;
        this.orgin = orgin;
        this.dateOfEntry = dateOfEntry;
        this.number = number;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @return the dateOfEntry
     */
    public String getDateOfEntry() {
        return dateOfEntry;
    }
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    /**
     * @return the orgin
     */
    public String getOrgin() {
        return orgin;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    //
    /**
     * @param dateOfEntry the dateOfEntry to set
     */
    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * @param orgin the orgin to set
     */
    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @param seed the seed to set
     */
    public void setSeed(boolean seed) {
        this.seed = seed;
    }
    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the seed
     */
    public boolean isSeed() {
        return seed;
    }
    //
    
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
