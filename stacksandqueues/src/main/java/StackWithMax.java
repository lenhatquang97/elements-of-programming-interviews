import java.util.Stack;
//Stack with Max xet nhung gia tri lon nhat, lon thu hai,... tro lai, so lan thay doi max chinh la so stack
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
            throw new IllegalStateException("max(): empty stack");
        }
        Integer val=normalStack.pop();
        if(val==stackedWithMax.peek().value){
            Pairer newPair=stackedWithMax.pop();
            if(newPair.times>0){
                newPair.times--;
                stackedWithMax.push(newPair);
            }
        }
        return val;
    }

    public void push(Integer x) {
        if(!normalStack.isEmpty()){
            if(x==stackedWithMax.peek().value){
                Pairer newPair = new Pairer(x,stackedWithMax.peek().times+1);
                stackedWithMax.pop();
                stackedWithMax.push(newPair);
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
