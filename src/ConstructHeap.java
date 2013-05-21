/**
 * User: shwetanka
 * Date: 12/10/12
 * Time: 10:51 AM
 */
public class ConstructHeap {
  public static void main(String ... args){
    int [] input = new int[] {10, 3, 5, 7, 9, 2, 8, 15, 6, 23, 14, 11, 19, 16};
    makeHeap(input);
    for(int h : input){
      System.out.print(h+" ");
    }
  }

  public static void makeHeap(int [] inp){
    int i = 0;
    while (i<inp.length){
//      for(int h : inp){
//        System.out.print(h+" ");
//      }
//      System.out.println();
      int lc = 2*i+1;
      int rc = 2*i+2;
      if(lc>=inp.length && rc >=inp.length){
        return;
      }
      int si = lc;
      if(rc <inp.length){
        if(inp[rc]>inp[lc]){
          si = rc;
        }
      }
      if(inp[si]>inp[i]){
        swap(inp, i, si);
        i=(i-1)/2;
      }else {
        i++;
      }
    }
  }

  public static void swap(int ar[], int i, int j){
    int t = ar[i];
    ar[i] = ar[j];
    ar[j] = t;
  }
}
