import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shwetanka
 * Date: 10/1/12
 * Time: 1:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class Combination {
  public static void main(String args[]){
    String str = "abcd";
    String temp = str;
    int k=1;
    for(int i=0;i<str.length();i++){
      for(int j=0;j<str.length();j++){
        String pre = temp.substring(0, i);
        String pos = "";
        if(i<str.length()-1){
          pos = temp.substring(i+1);
        }
        temp = pre+str.charAt(j)+pos ;
        System.out.println(k+": "+temp);
        k++;
      }
    }
  }


}
