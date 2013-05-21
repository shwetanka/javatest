import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: dee
 * Date: Jul 2, 2011
 * Time: 3:06:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransientTest implements Serializable{
    private int a;
    private transient int b;

    public TransientTest(int a, int b){
        this.a = a;
        this.b=b;
    }
    public  int getA(){
        return a;
    }
    private int getB(){
        return this.b;
    }

    public static void main(String a[]){
        TransientTest t = new TransientTest(10, 20);
    }
}
