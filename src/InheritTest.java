/**
 * User: shwetanka
 * Date: 12/12/12
 * Time: 10:26 PM
 */
public class InheritTest {
  public static void main(String ... args){
    A a = new B();

    System.out.println(a.getClass());
    System.out.println(a instanceof A);
    a.printGreet();
  }
}

abstract class A {
  protected String greet = "Hello World";
  public void printGreet(){
    System.out.println("Abstract");
  }
}

class B extends A {
  public void printGreet(){
    System.out.println(greet);
  }
}

abstract class C extends A {

}

class D extends C {

}