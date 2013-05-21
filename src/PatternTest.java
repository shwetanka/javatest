import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Jun 2, 2012
 * Time: 8:10:10 PM
 */
public class PatternTest {
  public static void main(String ... arg){
    Pattern p = Pattern.compile("^[_a-zA-Z0-9]+(\\w.)+@[_a-zA-Z]+\\.[com|co.in|in]+$");
    String str = "ab.hj@abc.co.in";
    Matcher m = p.matcher(str);
    System.out.println(m.matches());
    System.out.println(m.find());
  }
}
