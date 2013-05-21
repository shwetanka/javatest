import java.util.ArrayList;
import java.util.List;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: 2/12/12
 * Time: 1:26 PM
 */
public class ZeroMatrix {
  public static void main(String ar[]){
    List<Integer[]> w = new ArrayList<Integer[]>();
    int mat[][] = new int[5][5];
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if((i+j)%10 == 2 && i!=2){
          mat[i][j] = 0;
        }else {
          mat[i][j] = 1;
        }
      }
    }
    System.out.println("Before... \n");
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        System.out.print(mat[i][j]+"  ");
      }
      System.out.println();
    }
    System.out.print("\n");
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(mat[i][j] == 0){
          Integer [] t = new Integer[2];
          t[0] = i;
          t[1] = j;
          w.add(t);
        }
      }
    }
    for(Integer[] x : w){
      for(int i=0;i<5;i++){
        mat[x[0]][i] = 0;
        mat[i][x[1]] = 0;
      }
    }
    System.out.println("After... \n");
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        System.out.print(mat[i][j]+"  ");
      }
      System.out.println();
    }
  }
}
