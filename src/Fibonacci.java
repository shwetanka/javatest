/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/11/12
 * Time: 2:29 AM
 */
public class Fibonacci {
  public static void main(String a[]){
    fibonacci(10, 1, 1, 0);
  }

  public static void fibonacci(int n, int i, int p1, int p2){
    if(i > n){
      return;
    }
    int t = p2;
    p2 = p1;
    p1 = p1+t;
    System.out.print(p1+" ");
    fibonacci(n, ++i, p1, p2);
  }


}
