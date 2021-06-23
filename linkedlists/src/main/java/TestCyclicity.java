public class TestCyclicity {

    /*
    8.3
    */
    //Solution
    public static ListNode<Integer> isCyclic(ListNode<Integer> list) {
        ListNode<Integer> fast=list, slow=list;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int cycleLen=0;
                do{
                    ++cycleLen;
                    fast=fast.next;
                }while (slow!=fast);
                ListNode<Integer> cycleLenIter=list;
                while (cycleLen-->0){
                    cycleLenIter=cycleLenIter.next;
                }
                ListNode<Integer>iter=list;
                while (iter!=cycleLenIter){
                    iter=iter.next;
                    cycleLenIter=cycleLenIter.next;
                }
                return iter;
            }
        }
        return null;
    }

}
