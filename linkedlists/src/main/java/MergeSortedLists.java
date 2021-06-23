public class MergeSortedLists {

    /*
    8.1
    */

    public static ListNode<Integer> mergeLists(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer>res=new ListNode<Integer>(0,null);
        ListNode<Integer>curr=res;
        ListNode<Integer>p1=list1,p2=list2;
        while(p1!=null&&p2!=null){
            if(p1.data<p2.data){
                curr.next=p1;
                p1=p1.next;
            }
            else{
                curr.next=p2;
                p2=p2.next;
            }
            curr=curr.next;
        }
        curr.next=(p1!=null)?p1:p2;
        return res.next;
    }
}
