public class PalindromeAlphanumeric {

    /*
    7.5
    */

    public static boolean isPalindromeRecur(String input, int a,int b){
        if(input.charAt(a)<'a' || input.charAt(a)>'z'){
            return isPalindromeRecur(input,a+1,b);
        }
        if(input.charAt(b)<'a' || input.charAt(b)>'z'){
            return  isPalindromeRecur(input,a,b-1);
        }
        if(a>=b){
            return true;
        }
        if(input.charAt(a)!=input.charAt(b))
            return false;
        return isPalindromeRecur(input,a+1,b-1);
    }
    public static boolean isPalindrome(String input) {

        return isPalindromeRecur(input.toLowerCase(),0,input.length()-1);
    }
}
