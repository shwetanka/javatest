/**
 * Created by shwetanka on 5/11/17.
 */
public class MaxContiguousSum {
    public static void main(String args[]){
        Integer nums[] = new Integer[]{-8, -4, 0, -3, -2};

        Integer max = nums[0];
        Integer temp = nums[0];
        int i=1;
        int st = 0;
        int en = 0;
        int st2 = 0;
        while (i<nums.length){
            int ts = temp+nums[i];
            if (temp<0){
                if (nums[i] > temp){
                    temp = nums[i];
                }
                if (nums[i]> max){
                    max = nums[i];
                    st= i;
                    en = i;
                }
            }else if (temp >= 0){
                if (ts <= 0){
                    temp = 0;
                    st2 = i+1;
                }else {
                    temp = ts;
                    if (ts>max){
                        max = ts;
                        en = i;
                        st = st2;
                    }
                }
            }
            i++;
            System.out.println("Max = "+max+ " Temp: "+temp+" Start: "+st+" End: "+en);
        }
    }
}
