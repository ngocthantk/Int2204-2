public class Layer {
    protected Shape[] createShape;
    protected Circle[] createCircle;
    protected Triangle[] createTriangle;
    protected Squares[] createSquare;
    protected Rectangle[] createRectangle;

    public Circle[] getCreateCircle() {
        return createCircle;
    }

    public Rectangle[] getCreateRectangle() {
        return createRectangle;
    }

    public Shape[] getCreateShape() {
        return createShape;
    }

    public Squares[] getCreateSquare() {
        return createSquare;
    }

    public Triangle[] getCreateTriangle() {
        return createTriangle;
    }

    public void deleteTriangle() {
        for(int i = 0; i < createTriangle.length; i++) {
            createTriangle[i].setEdge1(0);
            createTriangle[i].setEdge2(0);
            createTriangle[i].setEdge3(0);
        }
    }
}
