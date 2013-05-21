/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Nov 3, 2011
 * Time: 11:34:46 PM
 */
class TestParent {
  public void method1(){
    System.out.println("This is parent method 1");
  }
  protected void method2(){
    System.out.println("This is Parent method 2");
    method1();
  }
}

public class Test1 extends TestParent{
  public void method1(){
    System.out.println("This is child method 1");
  }


  public static void main(String ... a){
    Test1 t1 = new Test1();
    t1.method2();
  }
}
