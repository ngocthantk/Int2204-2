package lab2;

public class studentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student a = new student();
        a.getInfo();
        a.setName("Bui Vu Anh");
        a.setId("17020564");
        a.setEmail("vuanhlk12@gmail.com");
        a.setGroup("INT22042");
        System.out.println(a.getName());
        a.getInfo();
        student b = new student("ten", "id", "email");
        b.getInfo();
        student c = new student(b);
        c.getInfo();
        
        studentManagement x=new studentManagement();
        System.out.println(x.samegroup(a, b));
        x.list[0]=new student();
        x.list[1]=new student(a);
        x.list[2]=new student("Vu An","17020563","vuanh@gmail.com");
        x.studentbygroup();
        x.removeid("17020564");
        System.out.println("Sau khi da remove");
        x.studentbygroup();
        
    }

    public boolean samegroup(student a, student b) {
        return (a.getGroup().equals(b.getGroup()));
    }

    public student[] list = new student[100];
    public int soluong = 0;

    public void studentbygroup() {
        String nametam;
        soluong = 0;
        while (this.list[soluong] != null) {
            soluong++;
        }
        int i, j;
        student temp;
        for (i = 0; i < soluong - 1; i++) {
            for (j = i + 1; j < soluong; j++) {
                if (this.list[i].getGroup().compareTo(this.list[j].getGroup())>0) {
                    temp = this.list[i];
                    this.list[i] = this.list[j];
                    this.list[j] = temp;
                }
            }
        }
        nametam=this.list[0].getGroup();
        System.out.println(nametam);
        for(i=0;i<soluong;i++){
            if(!nametam.equals(this.list[i].getGroup()))
            {
                nametam=this.list[i].getGroup();
                System.out.println(nametam);
            }
            this.list[i].getInfo();
        }

    }
    
    public void removeid(String id){
        int dem=0,i;
        while(!this.list[dem].getId().equals(id)){
            dem++;
        }
        for(i=dem;i<soluong-1;i++){
            this.list[i]=this.list[i+1];
        }
        soluong--;
        this.list[soluong]=null;
    }
}
