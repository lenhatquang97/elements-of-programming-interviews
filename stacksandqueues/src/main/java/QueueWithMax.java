import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithMax {
    private Queue<Integer>queue=new LinkedList<Integer>();
    private Deque<Integer>maxCandidates=new LinkedList<Integer>();
    public void enqueue(Integer x) {
        if(queue.isEmpty()){
            maxCandidates.addLast(x);
        }
        else{
            if(x>maxCandidates.getLast()){
               maxCandidates.removeLast();
            }

        }
        maxCandidates.addLast(x);
        queue.add(x);
        if(x>=maxCandidates.getFirst()){
            maxCandidates.removeLast();
            maxCandidates.addFirst(x);
        }
    }

    public Integer dequeue() {
        Integer value=queue.remove();
        if(value== maxCandidates.getFirst()){
            maxCandidates.removeFirst();
        }
        return value;
    }

    public Integer max() {
        return maxCandidates.getFirst();
    }


}
