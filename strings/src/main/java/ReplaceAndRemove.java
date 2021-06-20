public class ReplaceAndRemove {

    /*
    7.4
    */

    public static String replaceAndRemove(char[] s, int k) {
        int countA=0;
        for(int i=0;i<k;i++){
            s[k]=(s[k]=='b')?' ':s[k];
            countA+=(s[k]=='a')?1:0;
        }
        return s.toString();
    }


}
