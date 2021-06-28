public class CyclicRightShift {

    /*
    8.9
    */
    public static int length(ListNode<Integer>listNode){
        ListNode<Integer>head=listNode;
        int count=0;
        while (listNode!=null){
            count++;
            listNode=listNode.next;
        }
        return count;
    }
    public static ListNode<Integer> shift(int k, ListNode<Integer> list) {
        ListNode<Integer>head=list;
        ListNode<Integer>slow=list,fast=list;
        k=k%length(list);
        if(k==0||list==null||list.next==null)
            return list;
        int tmpK=k;
        while (tmpK>0){
            tmpK--;
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}
