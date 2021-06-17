import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermuteElements {

    /*
    6.9
    */
    public static void applyPermutation(List<Integer> perm, List<Integer> a) {
        List<Integer> res=new ArrayList<Integer>(Collections.nCopies(perm.size(),0));
        for(int i=0;i<a.size();i++){
            res.set(i,a.get(perm.get(i)));
        }
        for(int i=0;i<a.size();i++){
            a.set(i,res.get(i));
        }
    }


}
