import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnumeratePrimes {

    /*
    6.8
    */
    /*
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static List<Integer> enumeratePrimes(int n) {
        List<Integer> res= new ArrayList<Integer>();
        for(int i=2;i<=n;i++)
            if(isPrime(i))
                res.add(i);
        return res;
    }*/
    //Sieve of primes
    public static List<Integer> enumeratePrimes(int n) {
        List<Integer> primes=new ArrayList<>();
        List<Boolean> isPrime=new ArrayList<>(Collections.nCopies(n+1,true));
        isPrime.set(0,false);
        isPrime.set(1,false);
        for(int p=2;p<=n;p++){
            if(isPrime.get(p)){
                primes.add(p);
                for(int j=p;j<=n;j+=p){
                    isPrime.set(j,false);
                }
            }
        }
        return primes;
    }
}
