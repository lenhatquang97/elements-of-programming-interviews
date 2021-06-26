public class Palindromic {

    /*
    8.11
    */

    public static boolean isPalindromic(ListNode<Integer> list) {
        ListNode<Integer>head=new ListNode<>(null);
        ListNode<Integer>node=list;
        if(node==null||node.next==null){
            return true;
        }
        while(node!=null){
            if(head==null){
                head.data=node.data;
                head.next=null;
            }
            else{
                ListNode<Integer>temp=new ListNode<>(node.data);
                temp.next=head;
                head=temp;
            }
            node=node.next;
        }
        ListNode<Integer>first=list,second=head;
        while(first!=null){
            if(first.data!=second.data)
                return false;
            first=first.next;
            second=second.next;
        }

        return true;
    }

}
