
package kata2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        
        // como hablamos de tipo generíco tenemos que cambiar Int por integer
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ?
                    histogram.get(key) + 1 : 1);
        }
        
        for (int key : data) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
}