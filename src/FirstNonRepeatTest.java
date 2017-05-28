/**
 * Created by shwetanka on 5/25/17.
 */

public class FirstNonRepeatTest {

    public static void main(String [] args){
        FirstNonRepeat fnr = new FirstNonRepeat();

        String test1 = "abcdac";
        String test2 = "aabacdd";
        String test3 = "abcdefghh";
        String test4 = "abcdefghabefc";
        String test5 = "";
        String test6 = "abcdef";

        test(test1);
        test(test2);
        test(test3);
        test(test4);
    }

    public static void test(String s) {
        System.out.println(new FirstNonRepeat().nonRepeatingChar(s));
    }
}
