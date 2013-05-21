import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReduction {

    public static char [][] map = new char[3][3];

    static {
        map['a' - 'a'] ['b' - 'a'] = 'c';
        map['b' - 'a'] ['a' - 'a'] = 'c';

        map['a' - 'a'] ['c' - 'a'] = 'b';
        map['c' - 'a'] ['a' - 'a'] = 'b';

        map['b' - 'a'] ['c' - 'a'] = 'a';
        map['c' - 'a'] ['b' - 'a'] = 'a';
    }

    public static void main(String... args) throws IOException{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(bf.readLine());
      for(int z=0;z<n;z++){
        String input = bf.readLine();
        StringBuilder sb = new StringBuilder(input);

        boolean OK = true;
        int pos1, pos2, len;

        while(OK){
          pos1 = -1;
          pos2 = -1;
          len = sb.length();

          if(len == 1) break;

          for(int i = 0; i < len; i++){
            if(i > 1 && sb.charAt(i) != sb.charAt(i-1) && sb.charAt(i-1) == sb.charAt(i-2)){
              pos1 = i-1;
              pos2 = i;
              break;
            }else if(i < len - 2 && sb.charAt(i) != sb.charAt(i+1) && sb.charAt(i+1) == sb.charAt(i+2)){
              pos1 = i;
              pos2 = i+1;
              break;
            }
          }

          if(pos1 == -1 && sb.charAt(0) != sb.charAt(1)){
            pos1 = 0;
            pos2 = 1;
          }

          if(pos1 != -1){
            char replace = map[sb.charAt(pos1) - 'a'][sb.charAt(pos2) - 'a'];
            sb.deleteCharAt(pos1);
            sb.deleteCharAt(pos1);
            sb.insert(pos1, replace);
          }else break;
        }

        System.out.println(sb.length());
      }
    }
}
