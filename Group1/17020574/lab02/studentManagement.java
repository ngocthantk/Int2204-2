/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class studentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student studentOne = new student();
        studentOne.getInfo();
        student studentTwo = new student("Vu Ngoc Anh","17020598","vuanh@gmail.com");
        studentTwo.getInfo();
        student studentThree = new student(studentOne);
        studentThree.setGroup("K62_CB");
        studentThree.setName("Lam");
        studentThree.getInfo();
        studentManagement group = new studentManagement();
        group.st[0]= new student();
        group.st[1]= new student(studentTwo);
        group.st[2]= new student();
        if(group.sameGroup(group.st[0], group.st[1]))
        {
            System.out.println("cung lop");
        }
        else
        {
            System.out.println("khac lop");
        }
        		
    }
    public boolean sameGroup(student studentOne, student studentTwo)
    {
        return (studentOne.getGroup() == studentTwo.getGroup());
    }
    public student[] st = new student[100];

    
    //public void

    
    
}
