import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleArbitraryPrecisionIntegers {
    public static List<Integer> multiply(List<Integer> a, List<Integer> b) {
        List<Integer> res=new ArrayList<Integer>(Collections.nCopies(a.size()+b.size(),0));
        if(a.size()==0&&b.size()==0)
            return Collections.emptyList();
        int check = a.get(0)*b.get(0)<0?-1:1;
        a.set(0,a.get(0)<0?-a.get(0):a.get(0));
        b.set(0,b.get(0)<0?-b.get(0):b.get(0));
        int remem_mul=0;
        int temp=0;
        int temp2=0;
        int remem_add=0;
        for(int i=b.size()-1;i>=0;i--){
            for(int j=a.size()-1;j>=0;j--){
                temp=a.get(j)*b.get(i)+remem_mul;
                remem_mul = temp/10;
                temp2=res.get(i+j+1)+temp%10+remem_add;
                remem_add=temp2/10;
                res.set(i+j+1,temp2%10);
                if(j==0){
                    temp2=res.get(i+j)+temp/10+remem_add;
                    res.set(i+j,temp2);
                }
            }
            remem_add=0;
            remem_mul=0;
        }
        while(res.get(0)==0&&res.size()!=1){
            res.remove(0);
        }
        res.set(0,res.get(0)*check);
        return res;
    }
}
