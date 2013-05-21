/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/12/12
 * Time: 1:05 PM
 */
public class ReplaceSpace {
  public static void main(String ar[]){
    String str = replaceSpace("This is a test");
    System.out.println(str);
  }

  public static String replaceSpace(String st){
    String s = "";
    for(int i=0;i<st.length();i++){
      if(st.charAt(i) == ' '){
        s+="%20";
      }else{
        s+=String.valueOf(st.charAt(i));
      }
    }
    return s;
  }
}
