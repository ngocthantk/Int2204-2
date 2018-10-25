package Graphic;
import java.util.ArrayList;
public class Diagram {
    ArrayList<Layer> dg = new ArrayList<Layer>();
    public void changeSameShape()
    {
        Layer a = new Layer();
        Layer b = new Layer();
        Layer c = new Layer();
        Layer d = new Layer();

        for(int i=0; i<dg.size(); i++)
        {
            for(int j=0; j<dg.get(i).lr.size(); j++)
            {
                if(dg.get(i).lr.get(j) instanceof Circle)
                    a.lr.add(dg.get(i).lr.get(j));
                if(dg.get(i).lr.get(j) instanceof Hexagon)
                    b.lr.add(dg.get(i).lr.get(j));
                if(dg.get(i).lr.get(j) instanceof Square)
                    c.lr.add(dg.get(i).lr.get(j));
                if(dg.get(i).lr.get(j) instanceof Triangle)
                    d.lr.add(dg.get(i).lr.get(j));

            }
        }
        this.dg.clear();
        this.dg.add(a);
        this.dg.add(b);
        this.dg.add(c);
        this.dg.add(d);

    }

}
