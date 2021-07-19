import java.util.ArrayList;
import java.util.List;
class Pair{
    public int value;
    public int leftRight;
    Pair(int a,int b){
        this.value=a;
        this.leftRight=b;
    }
}
public class IsSymmetric {

    /*
    10.2
    */
    //false la trai, true la phai
    public static void preorder(BinaryTree<Integer> tree, List<Pair> list,int state){
        if(tree==null)
            return;
        list.add(new Pair(tree.data,state));
        preorder(tree.left,list,-1);
        preorder(tree.right,list,1);
    }
    public static void postorder(BinaryTree<Integer> tree, List<Pair> list,int state){
        if(tree==null)
            return;
        postorder(tree.left,list,-1);
        postorder(tree.right,list,1);
        list.add(new Pair(tree.data,state));
    }
    public static boolean isSymmetric(BinaryTree<Integer> tree) {
        if(tree==null)
            return true;
        if(tree.left==null && tree.right==null)
            return true;
        if(tree.left==null || tree.right==null)
            return false;
        List<Pair> list1=new ArrayList<Pair>();
        List<Pair> list2=new ArrayList<Pair>();
        preorder(tree.left,list1,0);
        postorder(tree.right,list2,0);
        int n=list1.size();
        if(list1.size()!=list2.size())
            return false;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i).value==list2.get(n-1-i).value&&list1.get(i).leftRight==0){
                continue;
            }
            if(list1.get(i).value==list2.get(n-1-i).value&&list1.get(i).leftRight!=list2.get(n-1-i).leftRight){
                continue;
            }
            return false;
        }
        return true;
    }

}
