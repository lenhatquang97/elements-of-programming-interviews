public class AddIntegers {

    /*
    8.13
    */
    
    public static ListNode<Integer> addIntegers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> res = null;
        ListNode<Integer> pointer_res=res;
        int tmpRem=0;
        while(a!=null&&b!=null){
            int tmpVal=(a.data+b.data)%10;
            if(res==null){
                res=new ListNode<>(tmpVal%10+tmpRem,null);
                pointer_res=res;
            }
            else{
                pointer_res.next=new ListNode<>(tmpVal%10+tmpRem,null);
                pointer_res=pointer_res.next;
            }
            tmpRem=(a.data+b.data)/10;
            a=a.next;
            b=b.next;
        }
        if(tmpRem>=1){
            pointer_res.next=new ListNode<>(tmpRem,null);
            pointer_res=pointer_res.next;
        }
        return res;
    }
}
