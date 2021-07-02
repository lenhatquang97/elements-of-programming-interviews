import java.util.*;
class Pair<T,V>{
    public T a;
    public V b;
    public Pair(T first, V second){
        this.a=first;
        this.b=second;
    }
}
public class ComputeBinaryTreeNodes {

    /*
    9.7
    */

    public static List<List<Integer>> binaryTreeDepthOrder(BinaryTree<Integer> tree) {
        if(tree==null) return Collections.emptyList();
        List<Integer>firstArr=new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<Pair<BinaryTree,Integer>> queue=new LinkedList<>();
        BinaryTree<Integer>node= tree;
        queue.add(new Pair(node,1));
        int layer=1;
        while(queue.peek()!=null){
            if(queue.peek().b!=layer){
                result.add(firstArr);
                firstArr=new ArrayList<>();
                layer=queue.peek().b;
            }
            if(queue.peek().a.left!=null){
                queue.add(new Pair(queue.peek().a.left,queue.peek().b+1));
            }
            if(queue.peek().a.right!=null){
                queue.add(new Pair(queue.peek().a.right,queue.peek().b+1));
            }
            firstArr.add((Integer)queue.peek().a.data);
            queue.remove();
        }
        result.add(firstArr);
        return result;
    }
}
