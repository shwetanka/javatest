import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Shwetanka
 * Date: 4/23/12
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sudoku {
   public static int n = 9;   //n should be a perfect square of a natural number
   //public static
  public static void main(String arg[]){
    int [][] problem = new int[n][n];
    preFill(problem);
    for(int i=0;i<n;i++){
      System.out.println();
      for(int j=0;j<n;j++){
        System.out.print(problem[i][j]+" ");
      }
      System.out.print(" | ");
    }
    System.out.println("\n");
    solve(problem, 0, 0);

//    for(int i=0;i<n;i++){
//      System.out.println();
//      for(int j=0;j<n;j++){
//        System.out.print(problem[i][j]+" ");
//      }
//      System.out.print(" | ");
//    }
  }

  public static boolean solve(int[][] problem, int i, int j){
    if(i==n){
      //Print
    }
    return true;
  }

  public static boolean solveNext(int[][] problem, int i, int j){
    if(j==n-1){
      i++;
      j=0;
    }else {
      j++;
    }
    return solve(problem, i, j);
  }

  public static Integer[] getValidValues(int[][] problem, int i, int j){
    List<Integer> vals = new ArrayList<Integer>(n);
    for(int k=1;k<=n;k++){
      if(isValid(problem, i, j, k)){
        vals.add(k);
      }
    }
    return vals.toArray(new Integer[]{});
  }

  public static boolean isValid(int[][] problem, int i, int j, int k){
    if(isRowValid(problem, i, k) && isColValid(problem, j, k) && isValidBox(problem, i, j, k)){
      return true;
    }
    return false;
  }

  public static boolean isRowValid(int[][] problem, int r, int num){
    for(int i=0;i<n;i++){
      if(problem[r][i] == num){
        return false;
      }
    }
    return true;
  }

  public static boolean isColValid(int[][] problem, int c, int num){
    for(int i=0;i<n;i++){
      if(problem[i][c] == num){
        return false;
      }
    }
    return true;
  }

  public static boolean isValidBox(int[][] problem, int r, int c, int num){
    int b = (int)Math.sqrt(n);
    int rb = (r/b)*b;
    int cb = (c/b)*b;
    for(int i=rb;i<b;i++){
      for(int j=cb;j<b;j++){
        if(problem[i][j] == num){
          return false;
        }
      }
    }
    return true;
  }

  public static void preFill(int [][] problem){
    problem[0][0] = 9 ;
    problem[0][4] = 2 ;
    problem[0][6] = 7 ;
    problem[0][7] = 5 ;

    problem[1][0] = 6 ;
    problem[1][4] = 5 ;
    problem[1][7] = 4 ;

    problem[2][1] = 2 ;
    problem[2][3] = 4 ;
    problem[2][7] = 1 ;

    problem[3][0] = 2 ;
    problem[3][2] = 8 ;

    problem[4][1] = 7 ;
    problem[4][3] = 5 ;
    problem[4][5] = 9 ;
    problem[4][7] = 6 ;

    problem[5][6] = 4 ;
    problem[5][8] = 1 ;

    problem[6][1] = 1 ;
    problem[6][5] = 5 ;
    problem[6][7] = 8 ;

    problem[7][1] = 9 ;
    problem[7][4] = 7 ;
    problem[7][8] = 4 ;

    problem[8][1] = 8 ;
    problem[8][2] = 2 ;
    problem[8][4] = 4 ;
    problem[8][8] = 6 ;
  }
}
