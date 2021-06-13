public class SwapBits {

    /*
    5.2
    */
    public static long log2(long x){
        if (x==0)
            return 0;
        return (long) (Math.log10(x)/Math.log10(2));
    }
    public static long swapBits(long x, int i, int j) {
        long bit_i= x<<i;
        long bit_j= x<<j;

        return 0L;
    }
}
