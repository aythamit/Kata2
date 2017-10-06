
package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Kata2 {

  
 public static final int NDATOS = 20;
 
    public static void main(String[] args) {
        
       ArrayList<Integer> data = new ArrayList();
       for(int i = 0; i < NDATOS; i++){
            data.add( (int) (Math.random()* 10));
        }
      
        Histograma histogr = new Histograma(data);
        Map<Integer,Integer> histogram = histogr.getHistogram();
        
        System.out.println("Clave - Valor");
        for (int key : histogram.keySet()) {
            System.out.println(key + "  ==>  " + histogram.get(key));               
        }
    }
    
}
