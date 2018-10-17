/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab02;

/**
 *
 * author CCNE
 */
public class StudentManagement{
    
	public static void main (String[] args){
        
        StudentManagement stuMng = new StudentManagement();
        stuMng.numS = 10;
        
        for(int i=0;i<stuMng.numS;i++){
            stuMng.students[i] = new Student();
            if(i%2==0){
                stuMng.students[i].setGroup("INT2204111");
            }
        }
        stuMng.students[0].setId("001");

        stuMng.removeStudent("001");
        stuMng.studentsByGroup();
	}

    private boolean sameGroup(Student s1,Student s2){
            return s1.getGroup().equals(s2.getGroup());
    }

    private void studentsByGroup(){
            // count group
            String groups[] = new String[100];
            int nG=0;
            //
            for(int i=0;i<numS;i++){
                boolean x = true;
                for(int j=0;j<nG;j++){
                    if(students[i].getGroup().equals(groups[j])){
                        x = false;
                        break;
                    }
                }
                if(x){
                    groups[nG++]=students[i].getGroup();
                }
            }
            //
            for(int i=0;i<nG;i++){
                System.out.println(groups[i]+": ");
                for(int j=0;j<numS;j++){
                    if(students[j].getGroup().equals(groups[i])){
                        students[j].getInfo();
                    }
                }
                System.out.println();
            }
            
        }

    private void removeStudent(String id){
        int index=0;
        for(int i=0;i<numS;i++){
            if(students[i].getId()==id){
                index = i;
                break;
            }
        }
        for(int i=index;i<numS;i++){
            students[i] = students[i+1];
        }
        numS--;
    }

    private int numS;
    private Student students[] = new Student[100];        
}
