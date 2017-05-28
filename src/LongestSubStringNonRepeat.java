import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shwetanka on 5/28/17.
 */
public class LongestSubStringNonRepeat {
    public static void main(String []args){
        String inp = "abcdefghdapqrstuv";
        char [] inpChars = inp.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();

        int maxLength = 0;
        int curMax = 0;
        int start = 0;
        int end = 0;
        int cStart = 0;
        int cEnd = 0;

        for (int i=0;i<inp.length();i++){
            if (!charMap.containsKey(inp.charAt(i))){
                curMax++;
                cEnd = i;
                if (cEnd-cStart>maxLength){
                    maxLength = cEnd-cStart;
                    end = cEnd;
                    start = cStart;
                }
            }else {
                //Check if in current subString calculation
                Integer charIndex = charMap.get(inp.charAt(i));
                if (charIndex>=cStart){
                    //Means current char is repeated in current sub string calculation
                    //so stop calculation
                    if (cEnd-cStart>maxLength){
                        maxLength = cEnd-cStart;
                        end = cEnd;
                        start = cStart;
                    }
                    cStart = charIndex+1;
                }else {
                    cEnd = i;
                }
            }
            charMap.put(inp.charAt(i), i);
        }

        System.out.println("Longest Substring Length: "+maxLength+ "Starts at: " +
                ""+start+" ends at: "+end);
    }
}
