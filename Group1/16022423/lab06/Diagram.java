public class Diagram {
    protected Layer[] createLayer = new Layer[10];
    public Layer getCreateLayer(int pos) {
        return createLayer[pos];
    }
    
    public Layer[] getCreateLayer() {
        return createLayer;
    }
    
    public void deleteCircle() {
        for(int i = 0; i < createLayer.length; i++){
            for(int j = 0; j < createLayer[i].getCreateCircle().length; j++)
            	if(createLayer[i].getCreateCircle()[j].getRadius() != 0) 
            		createLayer[i].getCreateCircle()[j].setRadius(10);
            
        }
    }
}

