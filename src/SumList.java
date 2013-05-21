import java.util.ArrayList;
import java.util.List;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/12/12
 * Time: 6:55 PM
 */
public class SumList {
  public static void main(String arg[]){
    List<Integer> n1 = new ArrayList<Integer>();
    n1.add(3);
    n1.add(1);
    n1.add(5);
    List<Integer> n2 = new ArrayList<Integer>();
    n2.add(5);
    n2.add(9);
    n2.add(9);
    n2.add(3);

    System.out.println(calculateSum(n1, n2));
  }

  public static List<Integer> calculateSum(List<Integer> l1, List<Integer> l2){
    List<Integer> sum = new ArrayList<Integer>();
    int l = l1.size()>l2.size()?l2.size():l1.size();
    int c=0;
    for(int i=0;i<l;i++){
      int s = l1.get(i)+l2.get(i)+c;
      c = s>=10?1:0;
      sum.add(s%10);
    }
    if(l1.size() == l2.size()){
      return sum;
    }
    if(l1.size()>l2.size()){
      for (int i=l2.size();i<l1.size();i++){
        int s = l1.get(i)+c;
        c = s>=10?1:0;
        sum.add(s%10);
      }
    }else {
      for (int i=l1.size();i<l2.size();i++){
        int s = l2.get(i)+c;
        c = s>=10?1:0;
        sum.add(s%10);
      }
    }
    return sum;
  }

}
