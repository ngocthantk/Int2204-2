import java.util. *;
public class PS_Test {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1,m1,t2,m2;
        System.out.println("Moi nhap tu so, phan so 1 :");
        t1 = sc.nextInt(); m1 = sc.nextInt();
        System.out.println("Moi nhap tu so, phan so 2 :");
        t2 = sc.nextInt(); m2 = sc.nextInt();
        PS ps1 = new PS(t1,m1);
        PS ps2 = new PS(t2,m2);
        PS sum = new PS(ps1,ps2,0);//phep cong 2 phan so
        PS sub = new PS(ps1,ps2,1);//tru 2 phan so
        PS multi = new PS(ps1,ps2,2);//nhan 2 phan so
        PS divide = new PS(ps1,ps2,3);//chia 2 phan so
        System.out.println("Gia tri phep tinh cong tru nhan chia: ");
        sum.getInfo();
        sub.getInfo();
        multi.getInfo();
        divide.getInfo();
        System.out.println(ps1.equals(ps2));//kiem tra 2 phan so = nhau hay k
    }
    
}