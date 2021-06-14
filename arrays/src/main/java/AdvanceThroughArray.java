import java.util.List;

public class AdvanceThroughArray {

    /*
       6.4
    */
    public static boolean arrayAdvanceFoo(List<Integer> A,int start){
        if(start==A.size()-1)
            return true;
        else if(start>=A.size())
            return false;
        for(int i=A.get(start);i>=1;i--){
            return arrayAdvanceFoo(A,start+i);
        }
        return false;
    }
    public static boolean arrayAdvance(List<Integer> A) {
        if(A.size()<=1)
            return true;
        return arrayAdvanceFoo(A,0);
    }
}
