/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.ArrayList;
import java.util. *;
import javax.swing. *;

/**
 *
 * @author Win10
 */
public class Diagram extends JFrame{
    private ArrayList<Layer > dia = new ArrayList<>();
    ListIterator it;
    public void process(){
        it = dia.listIterator();
        while(it.hasNext()){
            //duyet mang diagram
            Object obj = it.next();//cho iterator cho den phan tu ke tiep
            if(obj instanceof Layer){
                Layer lay = (Layer) obj;
                add(lay);//add Jpanel vao JFrame
            }
        }
        setTitle("");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addLay(Layer lay){
        dia.add(lay);
    }
    public void deleteLay(String name){
        //xoa 1 phan tu layer theo ten
        it = dia.listIterator();//i la thu tu phan tu trong arraylist
        while(it.hasNext()){
            Object obj = it.next();//cho iterator cho den phan tu ke tiep
            if(obj instanceof Layer){
                Layer lay = (Layer) obj;
                if(lay.getLayName().equalsIgnoreCase(name)){
                    dia.remove(obj);
                }
            }
        }
    }
    public void deleteCircle(){
        it = dia.listIterator();
        while(it.hasNext()){
            Object obj = it.next();//cho iterator cho den phan tu ke tiep
            if(obj instanceof Layer){
                Layer lay = (Layer) obj;
                lay.deleteCircle();
            }
        }
    }
}
