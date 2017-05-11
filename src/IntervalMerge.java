import java.util.ArrayList;
import java.util.List;

/**
 * Created by shwetanka on 5/11/17.
 * Given a list of intervals merge all overlapping intervals
 * eg. {[1, 6], [3, 9], [12, 18]} Output - {[1, 9], [12, 18]}
 */
public class IntervalMerge {
    public static void main(String [] args){
        List<Integer[]> inp = new ArrayList<>();
        inp.add(new Integer[]{1, 6});
        inp.add(new Integer[]{3, 9});
        inp.add(new Integer[]{10, 12});
        inp.add(new Integer[]{14, 18});
        inp.add(new Integer[]{17, 22});

        List<Integer[]> res = new ArrayList<>();
        int i = 1;
        Integer cur [] = inp.get(0);
        while (i<inp.size()){
            Integer next[] = inp.get(i);
            if (next[0]<=cur[1]){
                cur[1] = next[1];
                if (i+1>=inp.size()){
                    res.add(cur);
                    break;
                }
            }else {
                res.add(cur);
                cur = next;
            }
            i++;
        }

        res.forEach(integers -> {
            System.out.println("Interval: ["+integers[0]+ ", "+integers[1]+"]");
        });
    }
}
