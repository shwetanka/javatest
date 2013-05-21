import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindStringIS {
  private static Set<String> set;
  private static List<String> list = new ArrayList<String>();
  public static void main(String arg[]){
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    try{
      int n = Integer.parseInt(bf.readLine());
      for(int i=0;i<n;i++){
        list.addAll(getSubStringsO(bf.readLine()));
      }
      int q = Integer.parseInt(bf.readLine());
      set = new TreeSet<String>(list);
      String ops[] = set.toArray(new String[set.size()]);
      int k;
      for(int i=0;i<q;i++){
        k = Integer.parseInt(bf.readLine());
        if(k>ops.length){
          System.out.println("INVALID");                        
        }else {
          System.out.println(ops[k-1]);
        }
      }
    } catch (IOException ie){
      System.out.println(ie);
    }
  }

  public static List<String> getSubStringsO(String str){
    List<String> lset = new ArrayList<String>();
    for(int i=1;i<=str.length();i++){
      for(int j=0;j+i<=str.length();j++){
        lset.add(str.substring(j, j+i));
      }
    }
    return lset;
  }

  public static void getSubStrings(String str){
    for(int i=0;i<str.length();i++){
      for(int j=i;j<str.length();j++){
        if(i==j){
          set.add(str.substring(i, i+1));
        }else {
          set.add(str.substring(i, j+1));
        }
      }
    }
  }
}
