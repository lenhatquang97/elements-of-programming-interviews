public class RemoveDuplicatesFromSortedList {

    /*
    8.8
    */

    public static void removeDuplicates(ListNode<Integer> list) {
        if(list==null||list.next==null)
            return;
        ListNode<Integer>prev=list,curr=list.next;
        while(curr!=null){
            if(prev.data==curr.data){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                prev=prev.next;
                curr=curr.next;
            }
        }
    }

}
