import java.util.HashMap;
import java.util.Map;

/**
 * Created by shwetanka on 5/28/17.
 */
public class ThreeNPlusOne {
    static Map<Integer, Integer> cache = new HashMap<>();
    public static void main(String args[]){
        int start = 900;
        int end = 1000;
        int max = 1;
        for (int i=start;i<=end;i++){
            int len = cycleLength(i);
            if (len>max){
                max = len;
            }
        }
        System.out.println("Maximum cycle length between start: "+start+" and " +
                "end: "+end+" is: "+max);
    }

    private static int cycleLength(int c){
        if (cache.containsKey(c)){
            return cache.get(c);
        }
        if (c==1){
            return 1;
        }
        int res;
        if (c%2 == 0){
            res = 1 + cycleLength(c/2);
        }else {
            res = 1 + cycleLength(3*c+1);
        }
        cache.put(c, res);
        return res;
    }
}
