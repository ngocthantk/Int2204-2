package lab06;

import java.util.Vector;

public class Layer extends Vector <Shape>{

    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
}
