
package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static final int NDATOS = 20;

    public static void main(String[] args) {
        
        ArrayList<Integer> data = new ArrayList();
        Map<Integer,Integer> histogram = new HashMap();
        for(int i = 0; i < NDATOS; i++){
            data.add( (int) (Math.random()* 10));
        }
        
        for(Integer i : data){
           histogram.put(i , histogram.containsKey(i) ? histogram.get(i) + 1 : 1 );
        }
        System.out.println("Clave - Valor");
        for (int key : histogram.keySet()) {
            System.out.println(key + "  ==>  " + histogram.get(key));
        }
    }
    
}
