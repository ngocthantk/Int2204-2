import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layer = new ArrayList<>();
	
	public int deleteCircle() {
		int count = 0;
		for(int i = 0;i < layer.size() ; i++) {
			count = count + layer.get(i).deteleteCircle();
		}
		return count;
	}

	public void changeSameShape() {
		
		Layer a = new Layer();
		Layer b = new Layer();
		Layer c = new Layer();
		Layer d = new Layer();
		
        for(int i=0; i<layer.size(); i++)
        {
            for(int j=0; j<layer.get(i).shape.size(); j++)
            {
                if(layer.get(i).shape.get(j) instanceof Circle)
                    a.shape.add(layer.get(i).shape.get(j));
                if(layer.get(i).shape.get(j) instanceof Hexagon)
                    b.shape.add(layer.get(i).shape.get(j));
                if(layer.get(i).shape.get(j) instanceof Square)
                    c.shape.add(layer.get(i).shape.get(j));
                if(layer.get(i).shape.get(j) instanceof Triangle)
                    d.shape.add(layer.get(i).shape.get(j));
               
            }
        }
        
        this.layer.clear();
        this.layer.add(0, a);
        this.layer.add(1, b);
        this.layer.add(2, c);
        this.layer.add(3, d);
        
	}

}
