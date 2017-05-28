import java.util.HashMap;
import java.util.Map;

/**
 * Created by shwetanka on 5/25/17.
 */
public class FirstNonRepeat {
    public Character nonRepeatingChar(String str) {
        if (str == null || str.trim().equals("")){
            return null;
        }
        str.toLowerCase();
        char [] stch = str.toCharArray();
        Map<Character, Integer> temp = new HashMap<>();

        for (int i = 0; i < stch.length; i++) {
            if (temp.containsKey(stch[i])) {
                temp.put(stch[i], temp.get(stch[i]) + 1);
            } else {
                temp.put(stch[i], 1);
            }
        }

        for (int i = 0; i < stch.length; i++) {
            Integer n = temp.get(stch[i]);
            if (n <= 1) {
                return stch[i];
            }
        }
        return null;
    }
}
