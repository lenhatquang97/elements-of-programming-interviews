import java.util.List;

public class DeleteDuplicates {

    /*
    6.5
    */

    public static int deleteDuplicates(List<Integer> A) {
        int siz=A.size();
        if(A.size()<=1)
            return A.size();
        int current=1;
        for(int i=1;i<=A.size()-1;i++){
            if(A.get(i)!=A.get(i-1)){
                A.set(current++,A.get(i));
            }
        }
        for(int i=current;i<A.size();i++){
            A.set(i,null);
        }
        return current;
    }
}
