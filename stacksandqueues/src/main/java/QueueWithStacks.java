import java.util.Stack;

public class QueueWithStacks {

    private Stack<Integer> first=new Stack<Integer>();
    private Stack<Integer> second=new Stack<Integer>();
    public QueueWithStacks() {
    }

    public void enqueue(Integer x) {
        first.push(x);
    }

    public Integer dequeue() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        Integer tmp=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return tmp;
    }
}
