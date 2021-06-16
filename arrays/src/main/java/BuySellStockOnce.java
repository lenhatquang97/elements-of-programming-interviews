import java.util.ArrayList;
import java.util.List;

public class BuySellStockOnce {
    /*
       6.6
    */
    public static int findMax(List<Integer> arr, int a,int b){
        int maxVal=arr.get(a);
        for(int i=a;i<=b;i++){
            if(arr.get(i)>maxVal)
                maxVal=arr.get(i);
        }
        return maxVal;
    }
    /*
    public static int buySellStockOnce(List<Integer> A) {
        List<Integer> localMin=new ArrayList<Integer>();
        if(A.size()<2){
            return 0;
        }
        if(A.size()==2)
            return A.get(1)-A.get(0)>0?A.get(1)-A.get(0):0;
        int res=0;
        localMin.add(0);
        for(int i=1;i<A.size()-1;i++){
            if(A.get(i)<A.get(i-1)&&A.get(i)<A.get(i+1)){
                localMin.add(i);
                i+=1;
            }
        }
        for(int j:localMin){
            if(findMax(A,j,A.size()-1)-A.get(j)>res)
                res=findMax(A,j,A.size()-1)-A.get(j);
        }
        return res;
    }
    */
    public static int buySellStockOnce(List<Integer> A){
        int minPrice = Integer.MAX_VALUE , maxProfit = 0;
        for(Integer price:A){
            maxProfit = Math.max(maxProfit , price - minPrice); // Local minimum
            minPrice = Math.min(minPrice , price);//Max difference
        }
        return maxProfit;
    }
}
