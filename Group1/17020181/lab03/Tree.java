
public class Tree {
    private String ten;
    private String loai; // loài cây
    private String diachi;
    private int tuoi;
    
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getloai() {
        return loai;
    }
    public void setloai(String boyOrgirl) {
        this.loai = boyOrgirl;
    }
    
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void Output() {
        System.out.println("Tên: " + ten);
        System.out.println("Loài: " + loai);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Tuổi: " + tuoi + "năm");

    }
    public Tree(){
        this.ten = "Cây phượng";
        this.loai = "cây thân gỗ";
        this.diachi = "cổng trường";
        this.tuoi =  10;
    }
    
    public void dactrungTree() {
        System.out.println("Đặc trưng: Tỏa bóng mát, lá nhỏ, hoa nở có màu đỏ");
    }
    
    public static void main(String[] args) {
        Tree cay = new Tree();
        cay.Output();
        cay.dactrungTree();
        
    }
}
