import java.util.Collections;
import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2
    */

    public static List<Integer> incrementInteger(List<Integer> A) {
        int remem=0;
        int old_remem=0;
        remem=(A.get(A.size()-1)+1)/10;
        A.set(A.size()-1,remem==1?0:A.get(A.size()-1)+1);
        for(int i=A.size()-2;i>=0;i--){
            old_remem=remem;
            remem=(A.get(i)+remem)/10;
            A.set(i,remem==1?0:A.get(i)+old_remem);
        }
        if(remem==1){
            A.add(0,1);
        }
        return A;
    }
}
