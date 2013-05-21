import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChars {
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int l = Integer.parseInt(bf.readLine());
    StringBuilder sb = new StringBuilder(bf.readLine());
//    StringBuilder sb = new StringBuilder("aaaaabbbbbbccccccccdddddddeeffff");
 //   int l = sb.length();
    for(int i=0;i<l;i++){
      if(i>=l){
        break;
      }
      char c = sb.charAt(i);
      int cn = 1;
      int k=i+1;
      if(k>=l){
        sb.replace(i, k, String.valueOf(c)+1);
      } else{
        while(k<sb.length() && sb.charAt(k) == c ){
          cn++;
          k++;
        }
        String s = String.valueOf(c)+cn;
        sb.replace(i, k, String.valueOf(c)+cn);
        i = i+s.length()-1;
      }
      l = sb.length();
    }
    System.out.println(sb.toString());
  }
}
