
package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Histograma<T> {
   
   

    private final ArrayList<T> data;
    
    
    Histograma(ArrayList<T> data){
        this.data = data;
    }

    public Map<T, Integer> getHistogram() {
             Map<T,Integer> histogram = new HashMap();
       for(T i : data){
           histogram.put(i , histogram.containsKey(i) ? histogram.get(i) + 1 : 1 );
        }
        return histogram;
    }

    public ArrayList<T> getData() {
        return data;
    }
    
    
}
