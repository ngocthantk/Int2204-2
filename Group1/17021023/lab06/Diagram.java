import java.util.Vector;
public class Diagram extends Vector<Layer>{

    public void eraseCircle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Circle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}