import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ComputeBuildingsWithView {

    /*
    9.6
    */

    public static Deque<BuildingWithHeight> examineBuildingsWithSunset(Iterator<Integer> sequence) {
        Stack<BuildingWithHeight> stack=new Stack<>();
        Deque<BuildingWithHeight> res=new LinkedList<>();
        int id=0;
        while(sequence.hasNext()){
            BuildingWithHeight obj=new BuildingWithHeight(id,sequence.next());
            stack.add(obj);
            id++;
        }
        BuildingWithHeight tmp=stack.peek();
        res.add(tmp);
        int maxValue=tmp.height;
        stack.pop();
        while(!stack.isEmpty()){
            if(stack.peek().height>maxValue){
                maxValue=stack.peek().height;
                res.add(stack.peek());
            }
            stack.pop();
        }

        return res;
    }
}
