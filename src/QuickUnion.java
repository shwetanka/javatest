/**
 * Created with IntelliJ IDEA.
 * User: Shwetanka
 * Date: 26/9/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * A better way of QuickFind. Will implement with weighted trees to keep tree depth from becoming too big.
 *
 */
public class QuickUnion {
    private int[]ele;

    public QuickUnion(int n){
        ele = new int[n];
        for(int i=0;i<n;i++){
            ele[i] = i;
        }
    }

    private int root(int p){
        while (ele[p] != p){
            p=ele[p];
        }
        return p;
    }

    public boolean connected(int a, int b){
        return root(a) == root(b);
    }

    public void union(int a, int b){
        ele[root(a)]= root(b);
    }
}
