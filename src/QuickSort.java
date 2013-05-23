/**
 * User: shwetanka
 * Date: 12/9/12
 * Time: 2:06 AM
 */
public class QuickSort  {
  public static int c=1;
  public static void main(String ... args){
    int [] input = new int[] {10, 12, 11, 7, 9, 2, 8, 15, 6, 23, 6, 4, 19, 16, 17};
    quickSort(input, 0, input.length-1);
    for(int a : input){
      System.out.print(a+" ");
    }
  }

  public static void quickSort(int[] inp, int st, int lt){
    if(st>=lt){
      return;
    }
    int pi = st+(lt-st)/2;
    int pv = inp[pi];
    int b = st;
    int e = lt;
    System.out.print("S: "+b+"  E: "+e+"  Pi: "+pi+"  Pv: "+pv+"    ");
    for(int i : inp){
      System.out.print(i+" ");
    }
    System.out.print("     ");
    swap(inp, st, pi);
    boolean ss = false;
    boolean se = false;
    st++;
    while(st<lt){
      if(inp[st] > pv){
        ss = true;
      }else{
        st++;
      }
      if(inp[lt] < pv){
        se = true;
      }else{
        lt--;
      }
      if(ss && se){
        swap(inp, st, lt);
        ss = false;
        se = false;
        st++;
        lt--;
      }
    }
    if(inp[st] > pv){
      st--;
      swap(inp, b, st);
    }else{
      swap(inp, b, st);
    }
    for(int i : inp){
      System.out.print(i+" ");
    }
    System.out.println();
    quickSort(inp, b, st-1);
    quickSort(inp, st+1, e);
  }

  public static void swap(int[] inp, int i, int j){
    int t = inp[i];
    inp[i] = inp[j];
    inp[j] = t;
  }
}
