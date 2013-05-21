import java.security.Permission;
import java.util.ArrayList;
import java.util.List;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/11/12
 * Time: 1:19 PM
 */
public class Anagrams {
  public static String str = "abc";
  public static void main(String a[]){
    List<String> perms = permuate(str);
    int c = 1;
    for(String s : perms){
      System.out.println("#"+c+": "+s);
      c++;
    }
  }

  public static List<String> permuate(String st){
    List<String> allPerms = new ArrayList<String>();
    if(st.length()==2){
      return swap2(st);
    }
    String sf = st.substring(0,1);
    List<String> perms = permuate(st.substring(1));
    for(String s : perms){
      allPerms.addAll(getPerms(sf, s));
    }
    return allPerms;
  }

  public static List<String> getPerms(String sf, String st){
    List<String> rep = new ArrayList<String>();
    for(int i=0;i<st.length()+1;i++){
      String t;
      if(i==0){
        t = sf+st;
      }else if(i>0 && i<=st.length()){
        t = st.substring(0, i)+sf+st.substring(i, st.length());
      }else {
        t = st+sf;
      }
      rep.add(t);
    }
    return rep;
  }

  public static List<String> swap(String str){
    String s = str.substring(0,1);
    List<String> list = new ArrayList<String>();
    list.add(str);
    list.add(str.substring(1,2)+s);
    return list;
  }

  public static List<String> swap2(String str){
    String a = str.substring(0, 1);
    String b = str.substring(1, 2);
    List<String> list = new ArrayList<String>();
    list.add(a+a);
    list.add(b+b);
    list.add(str);
    list.add(b+a);
    return list;
  }
}
