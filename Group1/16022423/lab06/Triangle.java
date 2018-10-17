public class Triangle extends Shape {
    protected double edge1;
    protected double edge2;
    protected double edge3;
    public Triangle() {
		
	}

    public Triangle(double edge1, double edge2, double edge3, String color, boolean check) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.setColor(color);
        this.setCheck(check);
    }
	//Setter and Getter
	public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }
	
    public double getEdge1() {
        return edge1;
    }
	
	public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge2() {
        return edge2;
    }
	
	public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }


    public double getEdge3() {
        return edge3;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
