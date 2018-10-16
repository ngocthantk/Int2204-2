public class StudentManagement {
    private static Student[] ss = new Student[100];
    public static void main(String[] args){
        //xet truong hop so phan tu trong danh sach la 4
        ss[0] = new Student("Quang Binh","17020606","hohonana666@gmail.com");
        ss[1] = new Student("Hoang Ha","17025644","hoangha@gmail.com");
        ss[2] = new Student("Hai Anh","17021506","kkkkk@gmail.com");
        ss[3] = new Student("Quoc Cong","17025064","quoccong@gmail.com");
        ss[0].SetGroup("K59CLC");
        ss[1].SetGroup("K59CB");
        ss[2].SetGroup("K59CLC");
        ss[3].SetGroup("K59CB");
        StudentByGroup();
        removeStudent("17020606");
        System.out.println("The student information is: ");
        for(int i = 0;i <= 3;i++){
            System.out.println(ss[i].GetInfo());
        }
      
    }
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.GetGroup().equals(s2.GetGroup())) return true;
        else return false;
    }
    //ham duoi day gop cac sinh vien co cung lop thanh 1 danh sach
    public static void StudentByGroup(){
        Student temp;
        // vong lap for duoi day sap xep lai theo thu tu danh sach lop
        for(int i = 0;i <= 2;i++){
            for(int j = i+1;j <= 3;j++ ){
                if(ss[i].GetGroup().compareTo(ss[j].GetGroup()) > 0){
                    temp = new Student(ss[i]);
                    ss[i] = new Student(ss[j]);
                    ss[j] = new Student(temp);
                }
            }
        }
        Student[][] list = new Student[10][50];//mang 2 chieu dung de luu tru cac danh sach cua hoc sinh theo group
        int k = 0, m = 0;//chi so k ung voi chi so danh sach, m ung voi chi so phan tu trong danh sach k
        list[k][m] = new Student(ss[0]);
        ++m;
        for(int i = 0;i <= 2;i++){
            if(sameGroup(ss[i],ss[i+1])){
                //neu 2 phan tu = nhau, phan tu phia sau se dc gan vao cung danh sach cua phan tu truoc
                list[k][m] = new Student(ss[i+1]);
                ++m;
            }
            else{  
                //truong hop 2 phan tu khac lop, in ra danh sach vua roi va khoi tao danh sach moi
                System.out.println("The student information of " + ss[i].GetGroup() + " is: ");
                for(int j = 0;j < m;j++){
                    System.out.println(list[k][j].GetInfo());
                    
                }
                ++k;m = 0;
                list[k][m] = new Student(ss[i+1]);
                ++m;
            }
        }
        System.out.println("The student information of " + ss[3].GetGroup() + " is: ");
        for(int j = 0;j < m;j++){   
            System.out.println(list[k][j].GetInfo());
        } 
    }
    public static void removeStudent(String id){
        //xoa 1 phan tu trong danh sach bang cach cho phan tu do sao chep phan tu 
        //dang sau no(lien tuc lam vay cho den cuoi danh sach)
        for(int i = 0;i <= 3;i++){
            if(ss[i].GetID() == id){
                for(int j = i+1;j <= 3;j++){
                    ss[j-1] = new Student(ss[j]);
                }   
            }
        }
        ss[3] = new Student();//phan tu cuoi cung duoc tao ra theo mac dinh
        
    }
    
}