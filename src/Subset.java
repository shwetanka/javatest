import java.util.ArrayList;
import java.util.List;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/11/12
 * Time: 2:11 PM
 */
public class Subset {
  private static List<List<String>>  allSets = new ArrayList<List<String>>();
  private static List<List<String>>  curSet = new ArrayList<List<String>>();
  public static void main(String s[]){
    List<String> set = new ArrayList<String>();
    set.add("A");set.add("B");set.add("C");set.add("D");
    int l=1;
    for(String x : set){
      List<String> tem = new ArrayList<String>();
      tem.add(x);
      curSet.add(tem);
    }
    while(l<=set.size()){
      curSet = combine(set, curSet);
      for(List<String> list : curSet){
        allSets.add(list);
      }
      l++;
    }
    for(List<String> ll : allSets){
      System.out.println(ll);
    }
  }

  public static List<List<String>> combine(List<String> set, List<List<String>> curSet){
    List<List<String>> op = new ArrayList<List<String>>();
    for(String s : set){
      for(List<String> ls : curSet){
        if(isNotIn(ls, s)){
          List<String> tls = new ArrayList<String>();
          for(String v : ls){
            tls.add(v);
          }
          tls.add(s);
          if(notInMain(op, tls)){
            op.add(tls);
          }
        }
      }
    }
    return op;
  }

  public static boolean isNotIn(List<String> ls, String s){
    for(String x : ls){
      if(s.equals(x)){
        return false;
      }
    }
    return true;
  }

  public static boolean notInMain(List<List<String>> lst, List<String> ls){
    if(lst.size()==0){
      return true;
    }

    for(List<String> l : lst){
      boolean av = false;
      for(String s : l){
        if(isNotIn(ls, s)){
          av = true;
          break;
        }
      }
      if(!av){
        return av;
      }
    }
    return true;
  }

}
