public class IsHeightBalanced {

    /*
    10.1
    */
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int heightTree(BinaryTree<Integer> tree){
        if(tree==null)
            return 0;
        return max(heightTree(tree.left),heightTree(tree.right))+1;
    }
    public static boolean isBalanced(BinaryTree<Integer> tree) {
        if(tree==null)
            return true;
        return Math.abs(heightTree(tree.left)-heightTree(tree.right))<=1 && isBalanced(tree.left) && isBalanced(tree.right);
    }
}
