public class ListPivot {

    /*
    8.12
    */
    public static void insertEnd(ListNode<Integer> list,int k){
        if(list==null){
            list=new ListNode<>(k,null);
            return;
        }
        ListNode<Integer>ptr=list;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=new ListNode<>(k,null);
    }

    public static ListNode<Integer> pivot(ListNode<Integer> list, int k) {
        ListNode<Integer>lesser=new ListNode<>(0,null);
        ListNode<Integer>same=new ListNode<>(0,null);
        ListNode<Integer>greater=new ListNode<>(0,null);
        ListNode<Integer>ptr_less=lesser;
        ListNode<Integer>ptr_same=same;
        ListNode<Integer>ptr_greater=greater;
        ListNode<Integer>ptr=list;
        while (ptr!=null){
            if(ptr.data<k){
                ptr_less.next=ptr;
                ptr_less=ptr;
            }
            else if(ptr.data==k){
                ptr_same.next=ptr;
                ptr_same=ptr;
            }
            else{
                ptr_greater.next=ptr;
                ptr_greater=ptr;
            }
            ptr=ptr.next;
        }
        ptr_greater.next=null;
        ptr_same.next=greater.next;
        ptr_less.next=same.next;
        return lesser.next;
    }

}
