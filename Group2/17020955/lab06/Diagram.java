/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author TranTienPhong
 */
import java.util.Vector;
public class Diagram extends Vector <Shape> {
   
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
