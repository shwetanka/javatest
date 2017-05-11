/**
 * Created by shwetanka on 5/11/17.
 */
public class Sort012 {
    public static void main(String [] args){
        int [] nums = new int[]{1, 0, 1, 2, 1, 1, 0, 2, 2, 1, 0, 0, 0, 1, 1, 0, 2};

        int i = 0;
        int j = nums.length-1;

        while (i<j){
            while (nums[i]==0 || nums[i]==1){
                i++;
            }
            while (nums[j]==2){
                j--;
            }
            if (i>=j){
                break;
            }
            int t= nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            j--;
            i++;
        }
        System.out.println("i: "+i+" j: "+j);
        for (int k=0;k<nums.length;k++){
            System.out.print(nums[k]+", ");
        }

        i=0;
        while (i<j){
            while (nums[i]==0){
                i++;
            }
            while (nums[j] == 1){
                j--;
            }
            if (i>=j){
                break;
            }
            int t= nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            j--;
            i++;
        }
        System.out.println();
        for (int k=0;k<nums.length;k++){
            System.out.print(nums[k]+", ");
        }
    }
}
