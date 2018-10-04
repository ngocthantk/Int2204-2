/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituong;

/**
 *
 * @author Dat Anh
 */
public class Doituong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat a = new Cat();
	a.catInfo();
        Pig b = new Pig();
        b.pigInfo();
        teacher c = new teacher();
        c.teacherInfo();
        house d = new house();
        d.houseInfo();
        father e = new father();
        e.fatherInfo();
        mother f = new mother();
        f.motherInfo();
        tree g = new tree();
        g.treeInfo();
        group n = new group();
        n.groupInfo();
        monhoc m = new monhoc();
        m.monhocInfo();
        friend x = new friend();
        x.friendInfo();
    }
    
}
