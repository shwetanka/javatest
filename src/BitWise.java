/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/12/12
 * Time: 12:31 PM
 */
public class BitWise {
  public static void main(String arg[]){
    byte x = 50;
    byte y = 59;
    System.out.println(4&4);
    System.out.println((0xff)&x>>y);

    int a=6;
    int b=10;
    int c = a - b;
    int k = (c >> 11) & 0x1;
    System.out.println(k+"     "+(c>>31));
    int max = a - k * c;
    System.out.println(max);

  }
}
