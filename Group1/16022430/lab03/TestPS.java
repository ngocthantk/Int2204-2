import java.util.Scanner;
public class TestPS{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    PS ps1 = new PS();
    PS ps2 = new PS();
    PS psc = new PS();

    System.out.print("Nhap tu so phan so thu nhat: ");
    ps1.ts = input.nextInt();
    while(ps1.ms == 0){
      System.out.print("Nhap mau so phan so thu nhat: ");
      ps1.ms = input.nextInt();
    }
    System.out.print("Nhap tu so phan so thu hai: ");
    ps2.ts = input.nextInt();
    while(ps2.ms == 0){
      System.out.print("Nhap mau so phan so thu hai: ");
      ps2.ms = input.nextInt();
    }

    System.out.print("\n\n");
    System.out.print("Tong cua hai phan so: ");
    psc.hienthi(ps1.tong(ps2));
    System.out.print("Hieu cua hai phan so: ");
    psc.hienthi(ps1.hieu(ps2));
    System.out.print("Tich cua hai phan so: ");
    psc.hienthi(ps1.tich(ps2));
    System.out.print("Thuong cua hai phan so: ");
    if(ps1.thuong(ps2).ms == 0){
      System.out.println("Khong the chia cho 0 duoc");
    }
    else{
      psc.hienthi(ps1.thuong(ps2));
    }
    if(ps1.equals(ps2)){
      System.out.println("Hai phan so bang nhau");
    }
    else{
      System.out.println("Hai phan so khong bang nhau");
    }
  }

}
