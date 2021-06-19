import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComputePascalsTriangle {

    /*
    6.19
    */
    public static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> res=new ArrayList<>();
        int temp=0;
        if(n==0) return Collections.emptyList();
        res.add(Arrays.asList(1));
        if(n==1)
            return res;
        for(int i=2;i<=n;i++){
            List<Integer> tmp=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j-1>=0&&j!=i-1){
                   temp=res.get(i-2).get(j)+res.get(i-2).get(j-1);
                   tmp.add(temp);
                }
                else{
                    tmp.add(1);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
