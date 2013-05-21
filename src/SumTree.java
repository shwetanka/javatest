import java.util.*;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/8/12
 * Time: 8:38 PM
 */
public class SumTree {
  public static Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
  public static void main(String arg[]){
    int n = 5;
    int edges[][] = new int[4][2];
    edges[0] = new int[]{0, 1};
    edges[1] = new int[]{0, 2};
    edges[2] = new int[]{1, 3};
    edges[3] = new int[]{2, 4};
    int nodeValue[] = new int[]{-12, 2, 3, 5, 3};
    int sum[] = new int[n];
//    for(int i=0;i<sum.length;i++){
//      sum[i] = -1;
//    }

    for(int i=0;i<n;i++){
      List tem = new ArrayList<Integer>();
      tem.add(nodeValue[i]);
      map.put(i, tem);
    }

    for(int i=0;i<edges.length;i++){
      int t[] = edges[i];
      List<Integer> tl = map.get(t[0]);
      tl.add(t[1]);
      map.put(t[0], tl);
    }
    for(int i=n-1;i>=0;i--){
      sum[i] = getSum(map.get(i));
    }
    Arrays.sort(sum);
    System.out.println(sum[n-1]);
  }

  public static int getSum(List<Integer> ns){
    if(ns.size() == 1){
      return ns.get(0);
    }else {
      int s = ns.get(0);
      for(int j=1;j<ns.size();j++){
        s += getSum(map.get(ns.get(j)));
      }
      return s;
    }
  }
}
