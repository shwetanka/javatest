/**
 * Created by shwetanka on 5/28/17.
 */
public class MaxdiffHigherIndex {

    public static void main(String args []){
        int [] inp = new int[]{3, 2, 12, 5, 1, 10, 4};
        maxDifference(inp);
    }

    static int maxDifference(int arr[]){
        int max = -1;
        int minEl = arr[0];
        int pa = arr[0];
        int a = 0;
        int b = 0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<minEl){
                minEl = arr[i];
                pa = arr[i];
            }else {
                int tm = arr[i]-minEl;
                if (tm>max){
                    max = tm;
                    b = arr[i];
                    a = pa;
                }
            }
        }
        System.out.println("MaxDifference is: "+max+" A: "+a+" B: "+b);
        return max;
    }
}
