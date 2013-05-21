/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Oct 14, 2011
 * Time: 10:24:16 PM
 */
public class SelectionSort {
  public static void main (String a[]){
    int [] arr = new int[]{4, 2, 5, 9, 10, 14, 12, 6, 3, 11, 18, 16};
    int n=0;
    int s=0;
    while(n<arr.length-1){
      s=n;
      for(int i=n;i<arr.length-1;i++){
        if(arr[s]>arr[i+1]){
          s = i+1;
        }
      }
      int t=arr[s];
      arr[s] = arr[n];
      arr[n] = t;
      n++;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+", ");
    }
  }
}
