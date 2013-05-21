/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Oct 14, 2011
 * Time: 10:04:07 PM
 */
public class BubbleSort {
  public static int c = 1;
  public static void main(String a[]){
    int [] arr = new int[] {10, 3, 5, 7, 9, 2, 8, 15, 6, 23, 14, 11, 19, 16};
    int n=arr.length-1;

    while(n>1){
      for(int i=0;i<n;i++){
        c++;
        if(arr[i]>arr[i+1]){
          int t=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=t;
        }
      }
      n--;
    }
    System.out.println("Iterations: "+c);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+", ");
    }
  }
}
