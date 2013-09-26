/**
 * Created with IntelliJ IDEA.
 * User: Shwetanka
 * Date: 26/9/13
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuickFind {
    private Integer [] ele;

    public QuickFind(Integer n){
        ele = new Integer[n];
        String init = "";
        for(int i=0;i<n;i++){
            ele[i] = i;
            init+="  "+i+"|"+ele[i];
        }
        System.out.println(init.substring(2)+"\n");
    }

    public Boolean connected(Integer a, Integer b) throws Exception{
        try{
            return ele[a].equals(ele[b]);
        }catch (IndexOutOfBoundsException ibe){
            throw new Exception("Invalid a or b value passed");
        }
    }

    public void union(Integer a, Integer b){
        Integer aId=ele[a];
        Integer bId = ele[b];
        String res = "";
        for (int i=0;i<ele.length;i++){
            if(ele[i].equals(aId)){
                ele[i] = bId;
            }
            res+="  "+i+"|"+ele[i];
        }
        System.out.println(res.substring(2)+"\n");
    }

    public static void main(String args[]) throws Exception{
        QuickFind q = new QuickFind(20);
        q.union(6,8);
        q.union(9, 18);
        q.union(1, 19);
        q.union(1,8);
        System.out.println(q.connected(1, 10));
        q.union(6, 17);
        q.union(3, 6);
    }
}
