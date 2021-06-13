public class ComputeParity {
    // So bit 1 le la 1, con lai la 0
    /*
    5.1
    */

    public static short parity(long n) {
        short count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        count %= 2;
        return count;
    }
}
