public class Doituong {
    private String quatao;
    private String color;
    private String muivi; // mùi vị
    public  String getQuatao() {
        return quatao;
    }
    public void setQuatao(String Quatao) {
        this.quatao = Quatao;
    }
    public  String getColor() {
        return color;
    }
    public void setColor(String Do) {
        this.color = Do;
    }
    public  String getMuivi() {
        return muivi;
    }
    public void setMuivi(String Ngot) {
        this.muivi = Ngot;
    }
    public void output() {
        System.out.println("Doi tuong: " + quatao);
        System.out.println("Mau: " + color);
        System.out.println("Mui vi : " + muivi);
    }
    public Doituong(){
        this.quatao = "qua tao";
        this.color = "Do";
        this.muivi = "Ngot";
    }
    public static void main(String[] args) {
        Doituong me = new Doituong();
        me.output();
    } 
}