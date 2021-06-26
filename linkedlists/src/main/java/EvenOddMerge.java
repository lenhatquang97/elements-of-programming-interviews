import java.util.List;

public class EvenOddMerge {

    /*
    8.10
    */

    public static ListNode<Integer> merge(ListNode<Integer> list) {
        if(list==null||list.next==null)
            return list;
        ListNode<Integer>odd = null;
        ListNode<Integer>pointer_even=list,pointer_odd= null;
        //Insert to odd lists
        while(pointer_even!=null){
            if(pointer_even.data%2==1){
                if(odd==null){
                    odd=new ListNode<>(pointer_even.data,null);
                    pointer_odd=odd;
                }
                else{
                    pointer_odd.next=new ListNode<>(pointer_even.data,null);
                    pointer_odd=pointer_odd.next;
                }

            }
            pointer_even=pointer_even.next;
        }
        //Delete even nodes
        ListNode<Integer>prev=null;
        ListNode<Integer>curr=list;
        while(curr!=null){
            if(curr.data%2==1){
                prev.next=curr.next;
            }
            prev=curr;
            curr=curr.next;
        }
        //End of even links to start of odd
        ListNode<Integer>pointer_check=list;
        while(pointer_check.next!=null){
            pointer_check=pointer_check.next;
        }
        pointer_check.next=odd;
        return list;

    }

}
