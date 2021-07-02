import java.util.Stack;
//stack with max from 1 to max value
public class StackWithMax {
    private Stack<Integer> normalStack = new Stack<>();
    private Stack<Pairer> stackedWithMax=new Stack<>();
    public StackWithMax() {}

    public Integer max() {
        if(normalStack.isEmpty()) {
            throw new IllegalStateException("max(): empty stack");
        }
        return stackedWithMax.peek().value;
    }

    public Integer pop() {
        if(normalStack.isEmpty()) {
            throw new IllegalStateException("pop(): empty stack");
        }
        Integer val=normalStack.pop();
        if(val==stackedWithMax.peek().value){
            if(stackedWithMax.peek().times>0){
                stackedWithMax.peek().times--;
            }
            else stackedWithMax.pop();
        }
        return val;
    }

    public void push(Integer x) {
        if(!normalStack.isEmpty()){
            if(x==stackedWithMax.peek().value){
                stackedWithMax.peek().times++;
            }
            else if(x>stackedWithMax.peek().value){
                Pairer newPair = new Pairer(x,1);
                stackedWithMax.push(newPair);
            }
        }
        else{
            Pairer newPair = new Pairer(x,1);
            stackedWithMax.push(newPair);
        }
        normalStack.push(x);
    }
}
