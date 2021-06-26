public class DeleteKthLastNode {

    /*
    8.7
    */

    public static void deleteNode(ListNode<Integer> list, int k) {
        ListNode<Integer>prev=null;
        ListNode<Integer>first=list;
        ListNode<Integer>second=list;
        while(k>=1){
            second=second.next;
            k-=1;
        }
        while(second!=null){
            prev=first;
            first=first.next;
            second=second.next;
        }
        prev.next=first.next;
    }

}
