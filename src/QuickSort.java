/**
 * User: shwetanka
 * Date: 12/9/12
 * Time: 2:06 AM
 */
public class QuickSort  {
  public static int c=1;
  public static void main(String ... args){
    int [] input = new int[] {10, 3, 5, 7, 9, 2, 8, 15, 6, 23, 14, 11, 19, 16};
    quickSort(input, 0, input.length-1);
    for(int a : input){
      System.out.print(a+" ");
    }
  }

  public static void quickSort(int[] inp, int st, int lt){
    if(lt<=st){
      return;
    }
    int s = st;
    int pi = s+(lt-s+1)/2;
    int pv = inp[pi];
    int e = lt;
    while(s<e){
      boolean swapS = false;
      boolean swapE = false;
      if(s==pi){
        s++;
        continue;
      }
      if(e==pi){
        e--;
        continue;
      }
      if(inp[s]<pv){
        s++;
      }else {
        swapS = true;
      }
      if(inp[e]>=pv){
        e--;
      }else {
        swapE = true;
      }
      if(swapS && swapE){
        int tmp = inp[s];
        inp[s] = inp[e];
        inp[e] = tmp;
        s++;
        e--;
      }
    }
    inp[pi] = inp[e];
    inp[e] = pv;
//    for(int v : inp){
//      System.out.print(v+" ");
//    }
//    System.out.println();
    quickSort(inp, st, e-1);
    quickSort(inp, e+1, lt);
  }
}
