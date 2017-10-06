
package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Histograma {
   
    public static final int NDATOS = 20;

    private ArrayList<Integer> data = new ArrayList();
    
    
    Histograma(){
    }

    public Map<Integer, Integer> getHistogram() {
      Map<Integer,Integer> histogram = new HashMap();
      for(int i = 0; i < NDATOS; i++){
            data.add( (int) (Math.random()* 10));
        }
      
       for(Integer i : data){
           histogram.put(i , histogram.containsKey(i) ? histogram.get(i) + 1 : 1 );
        }
        return histogram;
    }
    
    
}
