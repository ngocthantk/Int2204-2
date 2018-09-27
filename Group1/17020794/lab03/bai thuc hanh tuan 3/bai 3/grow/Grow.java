    
public class Grow{
    public static void main(String args[]){
        Fish F1=new Fish(true, 100, 1000, 30, habitan.SEA);
        Fish F2=new Fish(true, 80, 800, 30, habitan.SEA);
        Tree T1=new Tree(true, 100, 80, false, 30, habitan.LAND );
        F1.liveORdie(F2);
        System.out.println(F1.getSinhVat().getSize());
        System.out.println(F2.getSinhVat().getLive());
        T1.treeGrow();
        System.out.println(T1.getSinhVat().getSize());
    }
}