/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Oct 17, 2011
 * Time: 9:49:35 PM
 */
public class Test {
  public static void main(String ... a){
    String str = "\t\n\nthis is a test\n\n\n";
    System.out.println(str.length());
    System.out.println(lTrim(str).length());
    
  }
  public static String lTrim(String str){
    char tex[] = str.toCharArray();
    int i =0;
    while(tex[i] == ' ' || tex[i] == '\t' || tex[i] == '\n' || tex[i] == '\r'){
      i++;
    }
    return str.substring(i);
  }
}
