/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admincxq
 */
import java.util.ArrayList;
public class Diagram {
    ArrayList<Layer>layer=new ArrayList<Layer>();
    public void xoaCircle(){
        for(int i=0;i<layer.size();i++){
            layer.get(i).xoaAllCircle();
        }
    }
}
