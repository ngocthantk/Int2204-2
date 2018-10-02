import java.util.Scanner;
public class TestPS{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    PS ps1 = new PS();
    PS ps2 = new PS();
    PS ps3 = new PS();
    ps1.ts = input.nextInt();
    while(ps1.ms == 0) ps1.ms = input.nextInt();
    ps2.ts = input.nextInt();
    while(ps2.ms == 0) ps2.ms = input.nextInt();
    System.out.print(ps1.ts + "/" + ps1.ms + " + " + ps2.ts + "/" + ps2.ms + " = ");
    ps3.In(ps1.cong(ps2));
    System.out.print(ps1.ts + "/" + ps1.ms + " - " + ps2.ts + "/" + ps2.ms + " = ");
    ps3.In(ps1.tru(ps2));
    System.out.print(ps1.ts + "/" + ps1.ms + " * " + ps2.ts + "/" + ps2.ms + " = ");
    ps3.In(ps1.nhan(ps2));
    System.out.print(ps1.ts + "/" + ps1.ms + " / " + ps2.ts + "/" + ps2.ms + " = ");
    if(ps1.chia(ps2).ms == 0){
      System.out.println("Flase");
    }
    else{
      ps3.In(ps1.chia(ps2));
    }
    if(ps1.equals(ps2)){
      System.out.println("Hai phan so bang nhau");
    }
    else{
      System.out.println("Hai phan so khong bang nhau");
    }
  }
}
