/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Jan 13, 2012
 * Time: 12:31:34 AM
 */

class InTestBase{
  public InTestBase(){
    System.out.println("This is base default constructor");
  }
  public InTestBase(int x){
    System.out.println("Base one argument constructor: "+x);
  }
}

public class InTest extends InTestBase {
  public InTest(int a){
    //super(a);
    System.out.println("Child constructor: "+a);
  }
  public static void main(String a[]){
    InTestBase in = new InTest(6);
  }
}
