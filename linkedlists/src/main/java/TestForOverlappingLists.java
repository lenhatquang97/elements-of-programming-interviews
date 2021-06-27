public class TestForOverlappingLists {

    /*
    8.4
    */
    public static int length(ListNode<Integer>list){
        int count=0;
        while (list!=null){
            count+=1;
            list=list.next;
        }
        return count;
    }
    public static ListNode<Integer> doListsOverlap(ListNode<Integer> list1, ListNode<Integer> list2) {
        int a1=length(list1);
        int a2=length(list2);
        ListNode<Integer> p1=list1,p2=list2;
        while(a1>a2){
            p1=p1.next;
            a1-=1;
        }
        while(a1<a2){
            p2=p2.next;
            a2-=1;
        }
        while (p1!=null&&p2!=null && p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
