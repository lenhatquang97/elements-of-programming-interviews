import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    /*
    7.9
    */

    public static int romanToDecimal(String roman) {
        Map<Character,Integer> romanToDec=new HashMap<Character, Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M', 1000);
        }};
        int res=0;
        res=romanToDec.get(roman.charAt(0));
        for(int i=1;i<roman.length();i++){
            if(romanToDec.get(roman.charAt(i))>romanToDec.get(roman.charAt(i-1))){
                res=res-2*romanToDec.get(roman.charAt(i-1))+romanToDec.get(roman.charAt(i));
            }
            else{
                res+=romanToDec.get(roman.charAt(i));
            }
        }
        return res;
    }
}
