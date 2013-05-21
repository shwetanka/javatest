import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringReductionIS {
  private static final Map<String, String> map = new HashMap<String, String>();
  static{
    map.put("ab", "c");
    map.put("ba", "c");
    map.put("bc", "a");
    map.put("cb", "a");
    map.put("ac", "b");
    map.put("ca", "b");
  }
  public static void main(String ... arg) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    for(int i=0;i<n;i++){
      String s = bf.readLine();
      System.out.println(reduceString(s).length());
    }
  }

  public static String reduceString(String str){
    boolean bl = false;
    for(int i=0;i<str.length()-1;i++){
      if(str.charAt(i) != str.charAt(i+1)){
        bl= true;
        break;
      }
    }
    if(!bl){
      return str;
    }
    StringBuilder sb = new StringBuilder(str);
    for(int i=0;i<sb.length()-1;i++){
      String sub = sb.substring(i,i+2);
      if(map.get(sub) != null){
        sb.replace(i,i+2, map.get(sub));
        //i++;
      }
    }
    return reduceString(sb.toString());
  }
}
