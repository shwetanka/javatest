import java.util.ArrayList;
import java.util.List;

/**
 * Created by shwetanka on 6/6/17.
 */
public class CheckBST {

    static class Node{
       private int value;
       private Node left;
       private Node right;


        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    private static List<Integer> list = new ArrayList<>();

    static boolean checkBst(Node root){
        if (root==null){
            return true;
        }

        doInorder(root);
        //Check if list is sorted
        for(int i=0;i<list.size()-2;i++){
            if (list.get(i+1)<list.get(i)){
                return false;
            }
        }
        return true;
    }

    static void doInorder(Node n){
        if (n.left!=null){
            doInorder(n.left);
        }
        list.add(n.getValue());
        if (n.right!=null){
            doInorder(n.right);
        }
    }
}
