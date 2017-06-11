/**
 * Created by shwetanka on 6/6/17.
 */
public class SecondMax {
    public static void main(String args[]){
        int inp[] = new int[]{4, Integer.MIN_VALUE};

        System.out.println("Second Max: "+getSecondMax(inp));
    }

    public static int getSecondMax(int arr[]){
        //Array should not be null and size  > 1
        if (arr==null || arr.length<2){
            return -1;
        }
        int maxF = Integer.MIN_VALUE;
        int maxS = Integer.MIN_VALUE;
        boolean set = false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maxF){
                maxF = arr[i];
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]<maxF && arr[i]>=maxS){
                maxS = arr[i];
                set = true;
            }
        }
        if (set){
            return maxS;
        }else {
            return -1;
        }

    }
}
