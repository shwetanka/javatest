import java.util.ArrayList;
import java.util.List;

public class Precedence {
  public static List<String> res = new ArrayList<String>();
  public static void main(String arg[]){
    String relation[] = new String[]{"DB", "BZ", "AC"};
    for(int i=0;i<relation.length;i++){
      String s = relation[i];
      String a = s.substring(0,1);
      String b = s.substring(1,2);
      if(!alreadyInList(a)){
        if(alreadyInList(b)){
          res.add(res.indexOf(b), a);
        }else {
          res.add(a);
          res.add(b);
        }
      }else {
        if(alreadyInList(b)){
          if(res.indexOf(b)>res.indexOf(a)){

          } else{
            res.remove(a);
            res.add(res.indexOf(b), a);
          }
        }else {
          res.add(b);
        }
      }
    }
    String op = "";
    for(int k=0;k<res.size();k++){
        op+=res.get(k);
    }
    System.out.println(op);
  }

  public static boolean alreadyInList(String s){
    for(int i=0;i<res.size();i++){
      if(s.equals(res.get(i))){
        return true;
      }
    }
    return false;
  }
}
