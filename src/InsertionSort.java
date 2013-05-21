/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Oct 15, 2011
 * Time: 5:20:14 PM
 */
public class InsertionSort {
  public static int c = 1;
  public static void main(String a[]){
    int [] arr = new int[] {10, 3, 5, 7, 9, 2, 8, 15, 6, 23, 14, 11, 19, 16};
    for(int i=1;i<arr.length-1;i++){
      for(int j=i-1;j>=0;j--){
        System.out.println("Iteration: "+c++);
        if(arr[i]<arr[j]){
          int t = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = t;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+", ");
    }
  }
}
