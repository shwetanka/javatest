/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/11/12
 * Time: 2:53 AM
 */
public class LinearCongruentialRandom {
  public static void main(String a[]){
    System.out.print(random(101)+" ");
  }

  public static int random(int n){
    if(n==0){
      return 7;
    }
    return (7*random(n-1)+7)%10;
  }
}
