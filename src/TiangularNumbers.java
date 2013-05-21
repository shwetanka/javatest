/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/11/12
 * Time: 2:24 AM
 */
public class TiangularNumbers {
  public static void main(String args[]){
    triangular(10, 1, 0);
    System.out.println("\n"+triangle(10));
  }

  public static void triangular(int n, int i, int p){
    if(i > n){
      return;
    }else {
      p = i+p;
      System.out.print(p+" ");
      triangular(n, ++i, p);
    }
  }

  public static int triangle(int n){
    if(n==1){
      return 1;
    }
    return (n+triangle(n-1));
  }
}
