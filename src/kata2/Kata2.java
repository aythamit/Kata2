
package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Kata2 {

  

    public static void main(String[] args) {
        
        
        Histograma histogr = new Histograma();
        Map<Integer,Integer> histogram = histogr.getHistogram();
        
        System.out.println("Clave - Valor");
        for (int key : histogram.keySet()) {
            System.out.println(key + "  ==>  " + histogram.get(key));
        }
    }
    
}
