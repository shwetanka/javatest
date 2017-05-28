import java.util.HashMap;
import java.util.Map;

/**
 * Created by shwetanka on 5/11/17.
 */
public class TwoElementSum {
    public static void main(String args[]){
        int [] nums = new int[]{10, 4, 7, 1, 3, 15, 12, 19, 20, 22};
        int sum = 8;
        int [] res = findNums(nums, sum);
        if (res!=null){
            System.out.println("Numbers are: ["+res[0]+", "+res[1]+"]");
        }else {
            System.out.println("No such two numbers exist.");
        }
    }

    private static int[] findNums(int [] nums, int sum){
        Map<Integer, Integer> diff = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t = sum-nums[i];
            if (diff.containsKey(nums[i])){
                return new int[]{nums[i], nums[diff.get(nums[i])]};
            }else {
                diff.put(t, i);
            }
        }
        return null;
    }
}
