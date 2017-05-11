import java.util.ArrayList;
import java.util.List;

/**
 * Created by shwetanka on 5/4/17.
 */
public class GrabTest2 {

    public static void main(String [] args){
        int [] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 29, 30};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length>23){
            return 25;
        }

        Integer indv = 0;
        Integer seven = 0;

        int i=0;
        while (i<A.length){
            List<Integer> temp = new ArrayList<>();

            for (int j=i;j<i+7;j++){
                if (j+1==A.length){
                    temp.add(j);
                    break;
                }
                temp.add(j);
                if (!(A[j+1]-A[temp.get(0)]<7)){
                    break;
                }
            }
            if (temp.size()>3){
                seven+=7;
            }else {
                indv+=temp.size()*2;
            }
            i=temp.get(temp.size()-1)+1;
        }
        Integer finalP = indv+seven;
        if (finalP>25){
            return 25;
        }else {
            return finalP;
        }
    }
}
