import java.util.Scanner;

public class Student {
    private String name;
    private int mssv;
    private String faculty;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMssv() {
        return mssv;
    }
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }
    
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    public void InputStudent() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap Ten sv: " );
        String ten = s.nextLine();
        
        System.out.print("Nhap Khoa: " );
        String khoa = s.nextLine();
        
        System.out.print("Nhap MSSV: ");
        int ma = s.nextInt();
        
        
        
        this.setName(ten);
        this.setMssv(ma);
        this.setFaculty(khoa);
    }
    
    public void OutputStudent () {
        System.out.println("Ten sv: "  + name);
        System.out.println("MSSV: " + mssv);
        System.out.println("Khoa: " + faculty);
    }
    
    public static void main(String[] args) {
        Student me = new Student();
        me.InputStudent();
        me.OutputStudent();
    }
    
}
    

