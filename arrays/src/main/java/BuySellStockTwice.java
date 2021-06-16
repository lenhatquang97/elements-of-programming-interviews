import java.util.ArrayList;
import java.util.List;

public class BuySellStockTwice {

    /*
    6.7
    */
    /*
    public static int buySellStockTwice(List<Integer> A) {
        int minPrice = Integer.MAX_VALUE , maxProfit = 0;
        List<Integer> cache=new ArrayList<Integer>();
        for(Integer price:A){
            minPrice = Math.min(minPrice , price);//Local minimum
            maxProfit = Math.max(maxProfit , price - minPrice); // difference with max-min
            cache.add(maxProfit);
        }
        int maxPriceSoFar = Integer.MIN_VALUE;
        for(int i=A.size()-1;i>0;i--){
            maxPriceSoFar=Math.max(maxPriceSoFar,A.get(i)); // Maximum x
            maxProfit=Math.max(maxProfit,maxPriceSoFar-A.get(i)+cache.get(i-1));//Max value - Min value + price of i-1
        }
        return maxProfit;
    }
     */
    /*0(1) space, O(n) time */
    public static int buySellStockTwice(List<Integer> A) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        int minLocation = 0;
        int maxLocation = 0;
        // Get maxLocation
        for (int i = 0; i < A.size(); i++) {
            minPrice=Math.min(minPrice,A.get(i));
            if (A.get(i) - minPrice > maxProfit) {
                maxLocation = i;
                maxProfit = A.get(i) - minPrice;
            }
        }
        // Get min location
        for(int i=0;i<maxLocation;i++){
            if(A.get(maxLocation)-A.get(i)==maxProfit){
                minLocation=i;
            }
        }
        int minSec = Integer.MAX_VALUE, maxSec = 0;
        for (int i = 0; i < A.size(); i++) {
            boolean check = i>=minLocation && i<=maxLocation;
            if (A.get(i) < minSec && check==false) {
                minSec = A.get(i);
            }
            if (A.get(i) - minSec > maxSec && check==false) {
                maxSec = A.get(i) - minSec;
            }
        }
        return maxProfit+maxSec;
    }
}
