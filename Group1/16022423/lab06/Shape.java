public class Shape {
    protected String color;
    protected boolean check;
    public Shape(){
    	
    }
    

    public Shape(String color, boolean check) {
        this.color = color;
        this.check = check;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}