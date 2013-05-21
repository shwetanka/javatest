import java.util.Scanner;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Nov 6, 2011
 * Time: 10:03:24 PM
 */
public class Rotater {
  public static void main(String s[]){
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    for(int x=0;x<t;x++){
      String str = sc.nextLine();
      int m = Integer.parseInt(sc.nextLine());
      int p = Integer.parseInt(sc.nextLine());
      String r = str;
      boolean isStart = true;
      boolean ifM = true;
      int c = 0;
      while(!r.equals(str) || isStart){
        isStart = false;
        if(ifM){
          r = r.substring(r.length()-m)+r.substring(0, r.length()-m);
          ifM = false;
        }else {
          r = r.substring(r.length()-p)+r.substring(0, r.length()-p);
          ifM = true;
        }
        c++;
      }
      System.out.println(c);
    }
  }
}
