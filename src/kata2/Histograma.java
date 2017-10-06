
package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Histograma {
   
   

    private final ArrayList<Integer> data;
    
    
    Histograma(ArrayList<Integer> data){
        this.data = data;
    }

    public Map<Integer, Integer> getHistogram() {
             Map<Integer,Integer> histogram = new HashMap();
       for(Integer i : data){
           histogram.put(i , histogram.containsKey(i) ? histogram.get(i) + 1 : 1 );
        }
        return histogram;
    }
    
    
}
