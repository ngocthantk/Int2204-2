package tu.phamanh;

public class HoaQua {
    public String name;
    public String taste;
    public double saleprice;

    public HoaQua() 
    {
    	
    }

    public HoaQua(String name, String taste, double saleprice) {
        this.name = name;
        this.taste = taste;
        this.saleprice = saleprice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return this.taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getSaleprice() {
        return this.saleprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public void TenGoi() {
        System.out.println("\n\n===== " + this.name + " =====");
    }

    public void MuiVi() {
        System.out.println("Mui Vi thi " + this.taste);
    }

    public void GiaBan() {
        System.out.println("Gia Ban 1kg " + this.saleprice);
    }
    public String toString() {

        return "Name: " + this.name + " Taste: " + this.taste + " Saleprice:" + this.saleprice;
    }
}
