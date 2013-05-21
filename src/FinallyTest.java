/**
 * Created by IntelliJ IDEA.
 * User: dee
 * Date: Jul 2, 2011
 * Time: 2:37:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class FinallyTest {
    static int i=0;
    public static void main(String a[]){
        while(true){
            try{
                i=i+1;
                System.out.println(i);
                return;
            }finally{
                i=i+1;
                continue;
            }
        }
        //System.out.println(i);
    }
}
